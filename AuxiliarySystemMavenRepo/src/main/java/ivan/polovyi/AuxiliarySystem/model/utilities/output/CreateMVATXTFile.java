
/**
 * Gets as an input ObservableList<ProductBean>, ObservableList<ProductBeanXML>, BillBean.
 * Always one from  two first  arguments has to be equal 0. This way it can work with ProductBean and ProductBeanXML
 * Method iterates thru observable list and fills up all information of the product in a specified format, than returns a string
 * 
 */
package ivan.polovyi.AuxiliarySystem.model.utilities.output;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.ObservableList;

/**
 * @author ivan.polovyi
 *
 */

public class CreateMVATXTFile {

	private ObservableList<ProductBean> products;
	private ObservableList<ProductBeanXML> productsXML;
	private BillBean bill;

	public CreateMVATXTFile(ObservableList<ProductBean> products, ObservableList<ProductBeanXML> productsXML,
			BillBean bill) {
		this.products = products;
		this.bill = bill;
		this.productsXML = productsXML;
	}

	public static String header = "BAR_CODE;LOTE;BOLETA;DATA_EMISSAO;DATA_SAIDA;DATA_COMERCIAL;PEDIDO;PRAZO;COD_SITIO;SITIO;COD_CLIENTE;CLIENTE;LETRA_LOTE;MC_CODE;QTD_MC;COD_PRODUTO;PRODUTO;QTD_UNIT;QTD_EMB;VLR_UNIT;QUALIDADE;OBS1;OBS2;OBS3;OBS4;BOL_STATUS;";

	public String setMVAcontent() {
		StringBuilder sbTotal = new StringBuilder();
		StringBuilder sbLines = new StringBuilder();
		sbTotal.append(header);
		sbTotal.append(System.getProperty("line.separator"));
		try {

			if (products != null && productsXML == null) {
				for (ProductBean productBean : products) {

					sbLines.append(mvaLinesMaker(productBean.getBillNumber(), productBean.getLotNumber(),
							productBean.getProductGrower(), productBean.getChave(), productBean.getBoxQuantity(),
							productBean.getProductHBLOCode(), productBean.getProductName(),
							productBean.getQuantityPerBox(), productBean.getProductPrice()));

				}
			} else if (productsXML != null && products == null) {
				for (ProductBeanXML ProductBeanXML : productsXML) {

					sbLines.append(mvaLinesMaker(ProductBeanXML.getBillNumber(), ProductBeanXML.getLotNumber(),
							ProductBeanXML.getProductGrower(), ProductBeanXML.getChave(),
							ProductBeanXML.getBoxQuantity(), ProductBeanXML.getProductHBLOCode(),
							ProductBeanXML.getProductName(), ProductBeanXML.getQuantityPerBox(),
							ProductBeanXML.getProductPrice()));
				}
			}

			sbTotal.append(sbLines);
		} catch (Exception e) {
			e.getStackTrace();
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("CreateMVATXTFile class_ " + e.toString());
		}
		return sbTotal.toString();
	}

	public StringBuilder mvaLinesMaker(String billNumber, String lotNumber, String productGrower, String productChave,
			String productBoxQuantity, String productCode, String productName, String productQuantityPerBox,
			String productPrice) {
		StringBuilder sbLine = new StringBuilder();

		String mvaLine = billNumber + ";" + ";" + billNumber + ";" + ";" + ";" + ";" + ";" + ";" + productGrower + ";"
				+ ";" + productChave + ";" + ";" + lotNumber + ";" + "" + ";" + productBoxQuantity + ";" + productCode
				+ ";" + productName + ";" + productBoxQuantity + ";" + productQuantityPerBox + ";" + productPrice + ""
				+ ";" + ";" + ";" + ";" + ";" + ";" + ";";

		sbLine.append(mvaLine);
		sbLine.append(System.getProperty("line.separator"));
		return sbLine;
	}

	public ObservableList<ProductBean> getProducts() {
		return products;
	}

	public void setProducts(ObservableList<ProductBean> products) {
		this.products = products;
	}

	public BillBean getBill() {
		return bill;
	}

	public void setBill(BillBean bill) {
		this.bill = bill;
	}

	public ObservableList<ProductBeanXML> getProductsXML() {
		return productsXML;
	}

	public void setProductsXML(ObservableList<ProductBeanXML> productsXML) {
		this.productsXML = productsXML;
	}

}
