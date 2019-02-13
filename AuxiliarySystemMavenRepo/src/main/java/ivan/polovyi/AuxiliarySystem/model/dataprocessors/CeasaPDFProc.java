package ivan.polovyi.AuxiliarySystem.model.dataprocessors;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CeasaPDFProc {

	final double pis = 0.0165;// 1,62%
	final double cofins = 0.076;// 7,60%

	public Pair<ObservableList<ProductBeanXML>, BillBean> converter(String textFromPDF) {

		// restrictions
		/*
		 * restrictions Supplier name has to be no more than 42 char Phone number =
		 * supplier code, phone number = fax number Supplier name Fornecedor:-HOLAMBELO
		 * Bill number Pedido # - Data: Supplier code = billnumber from 10th Date first
		 * 10 char of bill product line <-> product name <-( product code (-: quantity ;
		 * -) price!-; token Token: - :
		 */

		// bill number #-#
		// supplier !-!
		// productline <->
		// line itself ; ; ;
		// product code number (-)
		// token Token: - :

		ObservableList<ProductBeanXML> products = FXCollections.observableArrayList();
		BillBean bill = null;

		String supplierName = null;
		String supplierCode = null;
		String billDate = null;
		String billNumber = null;
		String productGrower = null;
		String productStatus = null;
		String orderNumber = null;
		String token = null;
		String chave = null;
		String subsidiaryCNPJ = null;
		String billTotal = null;

		String productDiscount = null;
		String productTotal = null;
		String comment = null;

		try {

			textFromPDF = textFromPDF.replace("\r\n", "");// replase all \n

			supplierName = StringUtils.substringBetween(textFromPDF, "Fornecedor:", "@").trim();

			orderNumber = StringUtils.substringBetween(textFromPDF, "@ Pedido #", "Data:").trim();

			token = StringUtils.substringBetween(textFromPDF, "Token:", ":").trim();

			supplierCode = orderNumber.substring(10);
			billDate = orderNumber.substring(0, 10);

			StringBuilder dateXMLFormat = new StringBuilder().append(billDate.charAt(6)).append(billDate.charAt(7))
					.append(billDate.charAt(8)).append(billDate.charAt(9)).append(billDate.charAt(5))
					.append(billDate.charAt(3)).append(billDate.charAt(4)).append(billDate.charAt(2))
					.append(billDate.charAt(0)).append(billDate.charAt(1));

			billNumber = (orderNumber + token).replaceAll("-", "");

			billTotal = StringUtils.substringAfter(textFromPDF, ": R$").trim().replace(".", "").replace(",", ".");

			if (StringUtils.substringBetween(textFromPDF, "@", "@").trim().equals("EXAMPLE GIT")) {
				subsidiaryCNPJ = "xxxxxxxxxxxx70";
				chave = "xxx1";
			} else {
				subsidiaryCNPJ = "xxxxxxxxxxxx90";
				chave = "xx0";
			}

			if (billNumber.length() > 9) {
				billNumber = dateXMLFormat.toString().replaceAll("-", "") + supplierCode + token;
				billNumber = billNumber.substring(billNumber.length() - 8, billNumber.length());
			}

			String billKeyPartI = "00000000000000000000000000000000000";

			String billKeyPartII = "000000000";

			String billKey = billKeyPartI.substring(billNumber.length()) + billNumber + billKeyPartII;

			bill = new BillBean(billNumber, billKey, dateXMLFormat.toString(), supplierName, supplierCode,
					subsidiaryCNPJ, "", billTotal, null);

			String[] lineSeparator = textFromPDF.split(">");
			int counter = 0;
			for (String line : lineSeparator) {

				counter++;

				String productName = StringUtils.substringBetween(line, "<", "!").trim();

				String productNumber = StringUtils.substringBetween(line, "=", "?").trim();

				String quantity = StringUtils.substringBetween(line, "!", "=").trim();

				String boxQuantity = StringUtils.substringBefore(quantity, "x").trim();

				String quantityPerBox = StringUtils.substringAfter(quantity, "x").trim();

				String productPrice = StringUtils.substringBetween(line, "?", ";");

				productPrice = StringUtils.substringAfter(productPrice, "R$").trim();

				String productPriceWithoutDot = productPrice.replaceAll(",", ".").trim();

				// calculation

				// product total

				try {

					BigDecimal productPriceBD = new BigDecimal(productPriceWithoutDot);

					BigDecimal productQtyBoxBD = new BigDecimal(boxQuantity);
					BigDecimal productQtyPerBoxBD = new BigDecimal(quantityPerBox);

					BigDecimal productQtyBD = productQtyBoxBD.multiply(productQtyPerBoxBD);

					BigDecimal productTotalBD = productQtyBD.multiply(productPriceBD).setScale(2, RoundingMode.CEILING);

					// pis
					BigDecimal productPISBD = productTotalBD.multiply(new BigDecimal(pis)).setScale(2,
							RoundingMode.CEILING);
					// cofins
					BigDecimal productCOFINSBD = productTotalBD.multiply(new BigDecimal(cofins)).setScale(2,
							RoundingMode.CEILING);

					productTotal = productTotalBD.toString();

					products.add(new ProductBeanXML(productNumber, productNumber, productName, productGrower,
							supplierName, boxQuantity, quantityPerBox, productPrice, productStatus, chave, billNumber,
							(billNumber + counter), null, null, null, null, null, productDiscount, productTotal,
							comment, productPISBD.toString(), productCOFINSBD.toString()));
				} catch (Exception e) {
					e.printStackTrace();
					e.getStackTrace();
				}
			}

		} catch (Exception e) {
			e.getStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("CEASAPDFProcess class_ " + e.toString());
		}
		return new ImmutablePair<>(products, bill);

	}

}
