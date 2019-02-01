/**
 *Contains 3 constructors 
 *first gets as an input String filePath and String  and prints content of a String into file
 *second gets as an input String filePath and Workbook and writes content of a Workbook into a file
 *third gets as input String filePath and Document and writes .xml file
 */

package ivan.polovyi.WebBarcodeAppSubstitute.model.printutilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ivan.polovyi
 *
 */
public class PrinterToFile {

	private String filePath;
	private String fileContent;

	public PrinterToFile(String filePath, String mva) {

		this.filePath = filePath;
		this.fileContent = mva;
	}

	public void printToTXTFile() {

		try {
			FileWriter fstream = new FileWriter(filePath);

			BufferedWriter out = new BufferedWriter(fstream);

			out.write(fileContent);

			out.close();
			fstream.close();
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getMva() {
		return fileContent;
	}

	public void setMva(String mva) {
		this.fileContent = mva;
	}

}
