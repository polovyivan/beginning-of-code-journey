/**
 * Gets as an input String filePath and returns String fileContent, that contains content of the file
 */
/**
 * Gets as an input String filePath,  reads .pdf file and returns String fileContent, that contains content of the file
 */

package ivan.polovyi.AuxiliarySystem.model.utilities.input;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.ObservableList;

/**
 * @author ivan.polovyi
 *
 */
public class ReadPDFFile implements ReadFile {

	private String filePath;

	public ReadPDFFile(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String getFileContent() {
		
		String fileContent = null;
		try (PDDocument document = PDDocument.load(new File(filePath))) {

			document.getClass();

			if (!document.isEncrypted()) {

				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);

				PDFTextStripper tStripper = new PDFTextStripper();

				fileContent = tStripper.getText(document);

			}
		} catch (IOException e) {

			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("ReadPDFFile class_ " + e.toString());

		}
		return fileContent;

	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public Pair<ObservableList<ProductBeanXML>, BillBean> getProductandBillFromFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ProductBean> getProductFromInput() {
		// TODO Auto-generated method stub
		return null;
	}
}