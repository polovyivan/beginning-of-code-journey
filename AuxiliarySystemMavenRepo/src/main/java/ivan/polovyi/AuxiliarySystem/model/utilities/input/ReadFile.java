/**
 * 
 */
package ivan.polovyi.AuxiliarySystem.model.utilities.input;

import java.util.ArrayList;

import org.apache.commons.lang3.tuple.Pair;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import javafx.collections.ObservableList;

/**
 * @author ivan.polovyi
 *
 */
public interface ReadFile {

	public String getFileContent();

	public ArrayList<ProductBean> getProductFromInput();

	public Pair<ObservableList<ProductBeanXML>, BillBean> getProductandBillFromFile();
}
