/**
 * Gets as an input String filePath, reads .flo and returns String fileContent, that contains content of the file
 */

package ivan.polovyi.AuxiliarySystem.model.utilities.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang3.tuple.Pair;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.ObservableList;
/**
 * @author ivan.polovyi
 *
 */
public class ReadFLOFile implements ReadFile {
	private String filePath;

	public ReadFLOFile(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String getFileContent() {
		StringBuilder fileContent = new StringBuilder();
		BufferedReader br;
		try {

			File flo = new File(filePath);

			br = new BufferedReader(new FileReader(flo));

			String st;
			while ((st = br.readLine()) != null)

				fileContent.append(st + "lineSplit");

			System.out.println("inside read file  " + fileContent.toString());
		} catch (FileNotFoundException e) {
			ViewFactory error = new ViewFactory();
			error.getErrorMess("ReadFLOFile class_ "+e.toString());
			e.printStackTrace();
		} catch (IOException e) {
			ViewFactory error = new ViewFactory();
			error.getErrorMess("ReadFLOFile class_ "+e.toString());
			e.printStackTrace();
		}
		return fileContent.toString();

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
