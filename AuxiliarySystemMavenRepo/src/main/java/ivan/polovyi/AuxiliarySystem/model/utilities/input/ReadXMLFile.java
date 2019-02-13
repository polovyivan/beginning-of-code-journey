/**
 * Gets as an input String filePath,  reads .xml file and returns Pair of ObservableList<ProductBeanXML> and BillBean
 */

package ivan.polovyi.AuxiliarySystem.model.utilities.input;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ReadXMLFile implements ReadFile{

	private String filePath;

	public ReadXMLFile(String filePath) {
		this.filePath = filePath;
	}

	public Pair<ObservableList<ProductBeanXML>, BillBean> getProductandBillFromFile() {
		
		ObservableList<ProductBeanXML> products = FXCollections.observableArrayList();
		BillBean bill = null;
		try {

			File inputFile = new File(filePath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			// Variables
			// bill info
			String billNumber = null;
			String billDate = null;
			String supplierName = null;
			String supplierCNPJ = null;
			String subsidiaryCNPJ = null;
			String billDescount = null;
			String billTotal = null;
			String recieverName = null;
			

			// Get document number
			NodeList nfe = doc.getElementsByTagName("ide");
			Node nNodeNfe = nfe.item(0);
			Element eElementNfe = (Element) nNodeNfe;

			billNumber = eElementNfe.getElementsByTagName("nNF").item(0).getTextContent();
			

			billDate = StringUtils.substring(eElementNfe.getElementsByTagName("dhEmi").item(0).getTextContent(), 5, 10)
					.replaceAll("-", "");
			

			// Get supplier name
			NodeList suppliernod = doc.getElementsByTagName("emit");
			Node nNodeSupplierrnod = suppliernod.item(0);
			Element eElementSupplierNode = (Element) nNodeSupplierrnod;
			supplierCNPJ = eElementSupplierNode.getElementsByTagName("CNPJ").item(0).getTextContent();
			supplierName = eElementSupplierNode.getElementsByTagName("xNome").item(0).getTextContent();
			

			// Get subsidiary CNPJ
			NodeList reciever = doc.getElementsByTagName("dest");

			Node nNodeReciever = reciever.item(0);

			Element eElementReciever = (Element) nNodeReciever;

			recieverName = eElementReciever.getElementsByTagName("xNome").item(0).getTextContent();
			

			// If destCNPJ is precent

			NodeList restElmLstSubCNPJ = eElementReciever.getElementsByTagName("CNPJ");
			if (restElmLstSubCNPJ.getLength() > 0) {
				subsidiaryCNPJ = eElementReciever.getElementsByTagName("CNPJ").item(0).getTextContent();
				
			}

			// get items
			bill = new BillBean(billNumber,null, billDate, supplierName, supplierCNPJ, subsidiaryCNPJ, billDescount,
					billTotal, recieverName);

			
			NodeList nList = doc.getElementsByTagName("det");
			for (int temp = 0; temp < nList.getLength(); temp++) {

				String productCode = null;
				String productName = null;
				String quantity = null;
				String price = null;
				String unit = null;
				String productDiscount = null;
				String productTotal = null;

				String ipi = null;
				String EAN = null;
				String NCM = null;
				String CFOP = null;

				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					productCode = eElement.getElementsByTagName("cProd").item(0).getTextContent();

					// all to upper case replace all;
					productName = eElement.getElementsByTagName("xProd").item(0).getTextContent().toUpperCase()
							.replaceAll(";", " ");

					quantity = eElement.getElementsByTagName("qCom").item(0).getTextContent();

					price = eElement.getElementsByTagName("vUnCom").item(0).getTextContent();
					// get barcode
					EAN = eElement.getElementsByTagName("cEAN").item(0).getTextContent();

					NCM = eElement.getElementsByTagName("NCM").item(0).getTextContent();
					CFOP = eElement.getElementsByTagName("CFOP").item(0).getTextContent();

					// If IPI is precent

					NodeList restElmLstipi = eElement.getElementsByTagName("pIPI");
					if (restElmLstipi.getLength() > 0) {
						ipi = eElement.getElementsByTagName("pIPI").item(0).getTextContent();
					}

					// If DISCOUNT is precent

					NodeList restElmLstDescount = eElement.getElementsByTagName("vDesc");
					if (restElmLstDescount.getLength() > 0) {
						productDiscount = eElement.getElementsByTagName("vDesc").item(0).getTextContent();
						productTotal = eElement.getElementsByTagName("vProd").item(0).getTextContent();
					}

					// unit = eElement.getElementsByTagName("uCom").item(0).getTextContent();

					products.add(new ProductBeanXML(productCode, null, productName, null, supplierName, "1", quantity,
							price, null, null, billNumber, " ", unit, ipi, EAN, NCM, CFOP, productDiscount,
							productTotal, null, null, null));
				} // xml item read loop end

			} // xml nod read loop end
			

		} catch (Exception e) {
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("ReadXMLFile class_ " + e.toString());

		}
		
		return new ImmutablePair<>(products, bill);

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
	public ArrayList<ProductBean> getProductFromInput() {
		// TODO Auto-generated method stub
		return null;
	}

	

}