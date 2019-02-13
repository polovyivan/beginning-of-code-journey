package ivan.polovyi.AuxiliarySystem.model.dataprocessors;

import java.math.BigDecimal;

import org.apache.commons.lang3.tuple.Pair;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class XMLProcess {

	public ObservableList<ProductBeanXML> xmlProcess(Pair<ObservableList<ProductBeanXML>, BillBean> xmlInfo) {

		BigDecimal discountCoefficient = new BigDecimal(0);
		ObservableList<ProductBeanXML> listOfProducts = xmlInfo.getKey();

		BillBean bill = xmlInfo.getValue();
		try {
			// discount coefficient calculation

			// get chave
			int lotSesequence = 0;
			for (ProductBeanXML productXML : listOfProducts) {
				lotSesequence++;

				// correct quantity

				productXML
						.setQuantityPerBox(new SimpleStringProperty(productXML.getQuantityPerBox().split("\\.", 2)[0]));

				// set supplier replace slash
				productXML.setProductSupplier(
						new SimpleStringProperty(commercialAndHandler(productXML.getProductSupplier())));
				// set chave

				productXML.setChave(new SimpleStringProperty(chave(bill.getSubsidiaryCNPJ().toString())));

				// set lot number
				productXML.setLotNumber(new SimpleStringProperty(bill.getBillDate() + Integer.toString(lotSesequence)));

				// price and quantity adjust
				BigDecimal priceBD = new BigDecimal(productXML.getProductPrice());
				// desc coef calculation

				if (productXML.getProductDisc() != null || productXML.getProductTotal() != null) {
					discountCoefficient = descountCalcilation(productXML.getProductDisc(),
							productXML.getProductTotal());
				}

				// add discount

				priceBD = priceBD.subtract((priceBD.multiply(discountCoefficient)));

				// add ipi

				if (productXML.getIpi() != null) {
					priceBD = ipiCalculation(priceBD, productXML.getIpi());
				}
				// price round up
				priceBD = priceBD.setScale(2, BigDecimal.ROUND_CEILING);

				productXML.setProductPrice(new SimpleStringProperty(priceBD.toString()));

			}
		} catch (Exception e) {

			ViewFactory error = new ViewFactory();
			error.getErrorMess("XMLProcess class " + e.toString());

		}
		return listOfProducts;
	}

	private static String commercialAndHandler(String productCode) {

		productCode = productCode.replaceAll("&", "eamp;");
		return productCode;
	}

//get subsidiary chave
	private static String chave(String subsidiaryCNPJ) {

		String chave = "";

		switch (subsidiaryCNPJ) {

		case "xxxxxxxxxxxx90":
			chave = "xx0";
			break;
		case "xxxxxxxxxxxx70":
			chave = "xxx1";
			break;

		case "xxxxxxxxxxxx10":
			chave = "xxx5";
			break;

		case "xxxxxxxxxxxx46":
			chave = "x3";
			break;
		case "xxxxxxxxxxxxx4":
			chave = "x3";
			break;
		case "xxxxxxxxxxxx23":
			chave = "xxx1";
			break;

		case "xxxxxxxxxxxxx0":
			chave = "xxx5";
			break;
		case "xxxxxxxxxxxx08":
			chave = "xxx1";
			break;

		}

		return chave;
	}

//discount coefficient calculation
	private static BigDecimal descountCalcilation(String productDesc, String productTotal) {

		BigDecimal productDescBD = new BigDecimal(productDesc);
		BigDecimal productTotalBD = new BigDecimal(productTotal);

		BigDecimal discCoeff = productDescBD.divide(productTotalBD, 3, BigDecimal.ROUND_CEILING);

		return discCoeff;

	}

	// IPI calculation
	private static BigDecimal ipiCalculation(BigDecimal productPrice, String ipi) {

		BigDecimal ipiBD = new BigDecimal(ipi);
		BigDecimal ipiValue = productPrice.multiply(ipiBD.divide(new BigDecimal(100)));

		productPrice = productPrice.add(ipiValue);

		return productPrice;

	}

	public SimpleStringProperty freshPortalCodeAdjust(String hbloProdNumber) {

		if ((hbloProdNumber.length() == 15) && !hbloProdNumber.startsWith("H")) {
			String VBN = (String) hbloProdNumber.subSequence(0, 5);
			String s1 = (String) hbloProdNumber.subSequence(5, 8);
			String s2 = (String) hbloProdNumber.subSequence(8, 11);
			String s3 = (String) hbloProdNumber.subSequence(11, 13);
			String s4 = (String) hbloProdNumber.subSequence(13, 15);
			hbloProdNumber = VBN + "." + s1 + "." + s2 + "." + s3 + "." + s4;

		}

		return new SimpleStringProperty(hbloProdNumber);
	}

}
