/**
 *Contains 3 constructors 
 *first gets as an input String filePath and String  and prints content of a String into file
 *second gets as an input String filePath and Workbook and writes content of a Workbook into a file
 *third gets as input String filePath and Document and writes .xml file
 */

package ivan.polovyi.AuxiliarySystem.model.utilities.output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.ss.usermodel.Workbook;
import org.w3c.dom.Document;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;

/**
 * @author ivan.polovyi
 *
 */
public class PrintToFile {

	private String filePath;
	private String mva;
	private Workbook wb;
	private Document doc;

	public PrintToFile(String filePath, String mva) {

		this.filePath = filePath;
		this.mva = mva;
	}

	public PrintToFile(String filePath, Workbook wb) {

		this.filePath = filePath;
		this.wb = wb;
	}

	public PrintToFile(String filePath, Document doc) {

		this.filePath = filePath;
		this.doc = doc;
	}

	public void printToTXTFile() {

		try {
			FileWriter fstream = new FileWriter(filePath);

			BufferedWriter out = new BufferedWriter(fstream);

			out.write(mva);

			out.close();
			fstream.close();
		} catch (IOException e) {

			e.printStackTrace();

			ViewFactory error = new ViewFactory();
			error.getErrorMess("PrintToFile class_ printToTXTFile()" + e.toString());

		}

	}

	public void writeToExelFile() {

		try {

			FileOutputStream fileOut = new FileOutputStream(filePath);

			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("PrintToFile class_ writeToExelFile()" + e.toString());
		} catch (IOException e) {
			ViewFactory error = new ViewFactory();
			error.getErrorMess("PrintToFile class_ writeToExelFile()" + e.toString());
			e.printStackTrace();
		}
	}

	public void writeToXML() {

		try {

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			StreamResult result = new StreamResult(new File(filePath));

			transformer.transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("PrintToFile class_ writeToXML()" + e.toString());
		}
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getMva() {
		return mva;
	}

	public void setMva(String mva) {
		this.mva = mva;
	}

	public Workbook getWb() {
		return wb;
	}

	public void setWb(Workbook wb) {
		this.wb = wb;
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

}
