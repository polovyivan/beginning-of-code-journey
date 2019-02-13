package ivan.polovyi.AuxiliarySystem.model.utilities.output;

/**
 * Has 3 methods 1 for ProductBeans, 2 for ProductBeansXML and one to create workbook in Excel
 */
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openxml4j.exceptions.InvalidFormatException;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author ivan.polovyi
 *
 */
public class CreateExelFile {

	public Workbook setExelProductBean(ObservableList<ProductBean> products, BillBean bill)
			throws IOException, InvalidFormatException {

		ObservableList<ProductBeanXML> productsConverted = FXCollections.observableArrayList();

		for (ProductBean productBean : products) {

			productsConverted.add(new ProductBeanXML(productBean.getProductSupplierCode(),
					productBean.getProductHBLOCode(), productBean.getProductName(), productBean.getProductGrower(),
					productBean.getProductSupplier(), productBean.getBoxQuantity(), productBean.getQuantityPerBox(),
					productBean.getProductPrice(), productBean.getProductStatus(), productBean.getChave(),
					productBean.getBillNumber(), productBean.getLotNumber(), null, null, null, null, null, null, null,
					productBean.getComment(), null, null));

		}
		Workbook wb = writetoExel(productsConverted);
		return wb;

	}

	public Workbook setExelProductBeanXML(ObservableList<ProductBeanXML> products, BillBean bill)
			throws IOException, InvalidFormatException {

		Workbook wb = writetoExel(products);
		return wb;

	}

	static String[] columns = { "#", "Status", "Código Empresa", "Código produto (fornecedor)", "EAN", "Descrição",
			"Numero da nota fiscal", "Grupo", "Tipo de embalagem", "Código NCM", "CFOP entrada", "CFOP saida", "Cor",
			"Observação" };
	static String billNumber;

	public Workbook writetoExel(ObservableList<ProductBeanXML> uncnownProduct)
			throws IOException, InvalidFormatException {
		String dateStamp = new SimpleDateFormat("yyyyMMddmmss").format(Calendar.getInstance().getTime());

		String blank_cell = "preencher";
		String observation = "";

		// Create a Workbook

		Workbook wb = new HSSFWorkbook();

		CreationHelper createHelper = wb.getCreationHelper();
		// Create sheet
		Sheet sheet = wb.createSheet("SEM CADASTRO   " + dateStamp);

		try {

			// Create a Font for styling header cells
			Font headerFont = wb.createFont();
			headerFont.setItalic(true);
			headerFont.setFontHeightInPoints((short) 14);
			headerFont.setColor(IndexedColors.BLACK.getIndex());
			// Create a Font for styling blank cells
			Font fontblank = wb.createFont();
			fontblank.setFontName(HSSFFont.FONT_ARIAL);
			fontblank.setItalic(true);
			fontblank.setFontHeightInPoints((short) 10);
			fontblank.setColor(IndexedColors.GREY_40_PERCENT.getIndex());

			// Create a CellStyle with the font
			CellStyle headerCellStyle = wb.createCellStyle();
			headerCellStyle.setFont(headerFont);
			headerCellStyle.setBorderBottom(BorderStyle.THIN);
			headerCellStyle.setBorderTop(BorderStyle.THIN);
			headerCellStyle.setBorderRight(BorderStyle.THIN);
			headerCellStyle.setBorderLeft(BorderStyle.THIN);
			headerCellStyle.setAlignment(HorizontalAlignment.CENTER);
			// Create a Rest with the font
			CellStyle restCellStyle = wb.createCellStyle();
			restCellStyle.setBorderBottom(BorderStyle.THIN);
			restCellStyle.setBorderTop(BorderStyle.THIN);
			restCellStyle.setBorderRight(BorderStyle.THIN);
			restCellStyle.setBorderLeft(BorderStyle.THIN);

			// Create a blankCellStyle with the font
			CellStyle blankCellStyle = wb.createCellStyle();
			blankCellStyle.setFont(fontblank);
			blankCellStyle.setBorderBottom(BorderStyle.THIN);
			blankCellStyle.setBorderTop(BorderStyle.THIN);
			blankCellStyle.setBorderRight(BorderStyle.THIN);
			blankCellStyle.setBorderLeft(BorderStyle.THIN);
			blankCellStyle.setAlignment(HorizontalAlignment.CENTER);
			// Create a row and put some cells in it. Rows are 0 based.
			Row headerRow = sheet.createRow(0);
			// Resize all columns to fit the content size
			for (int i = 0; i < columns.length; i++) {
				Cell cell = headerRow.createCell(i);
				cell.setCellValue(columns[i]);
				cell.setCellStyle(headerCellStyle);
			}
			int rowNum = 0;

			for (ProductBeanXML uncnownProductBean : uncnownProduct) {

				billNumber = uncnownProductBean.getBillNumber().toString();

				rowNum++;

				Row row = sheet.createRow(rowNum);

				// Create Other rows and cells with employees data

				// Row number "#"
				row.createCell(0).setCellValue(rowNum);
				row.getCell(0).setCellStyle(restCellStyle);

				row.createCell(1).setCellValue(uncnownProductBean.getProductStatus());
				row.getCell(1).setCellStyle(blankCellStyle);

				// Numero uno C�digo HBLO

				row.createCell(2).setCellValue(blank_cell);
				row.getCell(2).setCellStyle(blankCellStyle);
				// supplier_number C�digo do fornecedor
				row.createCell(3).setCellValue(uncnownProductBean.getProductSupplierCode());
				row.getCell(3).setCellStyle(restCellStyle);
				// Barcoude EAN
				row.createCell(4).setCellValue(uncnownProductBean.getEan());
				row.getCell(4).setCellStyle(restCellStyle);
				// description Descri��o
				row.createCell(5).setCellValue(uncnownProductBean.getProductName());
				row.getCell(5).setCellStyle(restCellStyle);
				// supplier billNumber
				row.createCell(6).setCellValue(uncnownProductBean.getBillNumber());
				row.getCell(6).setCellStyle(restCellStyle);
				// grup Grupo
				row.createCell(7).setCellValue(blank_cell);
				row.getCell(7).setCellStyle(blankCellStyle);
				// sales unit
				row.createCell(8).setCellValue(blank_cell);
				row.getCell(8).setCellStyle(blankCellStyle);
				// NCM
				row.createCell(9).setCellValue(blank_cell);
				row.getCell(9).setCellStyle(blankCellStyle);
				// CFOP entry
				row.createCell(10).setCellValue(blank_cell);
				row.getCell(10).setCellStyle(blankCellStyle);
				// CFOP exit
				row.createCell(11).setCellValue(blank_cell);
				row.getCell(11).setCellStyle(blankCellStyle);
				// color Cor
				row.createCell(12).setCellValue(blank_cell);
				row.getCell(12).setCellStyle(blankCellStyle);
				// commentObcerva��o
				row.createCell(13).setCellValue(uncnownProductBean.getComment());
				row.getCell(13).setCellStyle(blankCellStyle);

			}

			// Resize all columns to fit the content size
			for (int i = 0; i < columns.length; i++) {
				sheet.autoSizeColumn(i);
			}

		} catch (Exception e) {
			ViewFactory error = new ViewFactory();
			error.getErrorMess("CreateExelFile class_ " + e.toString());
		}
		return wb;
	}

}
