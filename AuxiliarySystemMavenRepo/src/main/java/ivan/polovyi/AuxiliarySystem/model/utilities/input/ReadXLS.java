package ivan.polovyi.AuxiliarySystem.model.utilities.input;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import javafx.collections.ObservableList;

public class ReadXLS implements ReadFile {

	private String filePath;

	public ReadXLS(String filePath) {

		this.filePath = filePath;
	}

	@Override
	public ArrayList<ProductBean> getProductFromInput() {

		ArrayList<ProductBean> listofProducts = new ArrayList<ProductBean>();

		try {

			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(filePath));

			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			HSSFRow row;

			int rows; // No of rows
			rows = sheet.getPhysicalNumberOfRows();

			int cols = 0; // No of columns
			int tmp = 0;

			// This trick ensures that we get the data properly even if it doesn't start
			// from first few rows
			for (int i = 0; i < 10 || i < rows; i++) {
				row = sheet.getRow(i);
				if (row != null) {
					tmp = sheet.getRow(i).getPhysicalNumberOfCells();
					if (tmp > cols)
						cols = tmp;
				}
			}

			for (int r = 0; r < rows; r++) {
				row = sheet.getRow(r);
				if (row != null) {
					try {
						System.out.println(row.getCell(0).toString() + "-" + row.getCell(1).toString() + "-"
								+ row.getCell(2).toString() + "-" + row.getCell(3).toString());

						listofProducts.add(new ProductBean(null, row.getCell(0).toString(), row.getCell(1).toString(),
								null, null, null, row.getCell(2).toString(), row.getCell(3).toString(), null, null,
								null, null, null, null, null));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}

		return listofProducts;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String getFileContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pair<ObservableList<ProductBeanXML>, BillBean> getProductandBillFromFile() {
		// TODO Auto-generated method stub
		return null;
	}
}
