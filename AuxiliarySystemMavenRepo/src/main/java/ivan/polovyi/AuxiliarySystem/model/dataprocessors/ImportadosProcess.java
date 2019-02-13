package ivan.polovyi.AuxiliarySystem.model.dataprocessors;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;

import org.apache.commons.lang3.tuple.Pair;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ImportadosProcess {

	public ObservableList<ProductBeanXML> importadosProcess(Pair<ObservableList<ProductBeanXML>, BillBean> xmlInfo) {
		ObservableList<ProductBeanXML> listOfProducts = xmlInfo.getKey();

		BillBean bill = xmlInfo.getValue();
		String chave = "xx0";
		// quantity per box calculation
		try {

			listOfProducts = quantityPerBoxCalculation(listOfProducts, chave, bill);
		} catch (Exception e) {
			e.getStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("ImportadosProcess class " + e.toString());

		}
		return listOfProducts;

	}

	// get quantity per box
	private static ObservableList<ProductBeanXML> quantityPerBoxCalculation(
			ObservableList<ProductBeanXML> listOfProducts, String chave, BillBean bill) {
		ObservableList<ProductBeanXML> listOfProductsTemp = FXCollections.observableArrayList();
		int perBoxNumber = 0;
		int boxes = 0;
		int boxesRemainder = 0;

		for (ProductBeanXML productBeanXML : listOfProducts) {

			if ((productBeanXML.getProductName().contains("JARD"))) {

				perBoxNumber = 72;

			}

			else if (productBeanXML.getProductName().contains("GYPSO")) {

				perBoxNumber = 8;

			} else if (productBeanXML.getProductName().contains("PEONIA")) {

				perBoxNumber = 10;

			}

			else if (productBeanXML.getProductName().contains("CRAVO")) {

				perBoxNumber = 150;

			}

			else

				perBoxNumber = 100;

			// boxes division
			boxes = Integer.parseInt(
					new BigDecimal(productBeanXML.getQuantityPerBox()).setScale(0, RoundingMode.FLOOR).toString())
					/ perBoxNumber;
			boxesRemainder = Integer.parseInt(
					new BigDecimal(productBeanXML.getQuantityPerBox()).setScale(0, RoundingMode.FLOOR).toString())
					% perBoxNumber;
			// if only one box
			if (boxes == 0) {
				boxes = 1;
				perBoxNumber = Integer.parseInt(
						new BigDecimal(productBeanXML.getQuantityPerBox()).setScale(0, RoundingMode.FLOOR).toString());
			}

			

			productBeanXML.setBoxQuantity(new SimpleStringProperty(Integer.toString(boxes)));
			productBeanXML.setChave(new SimpleStringProperty(chave));
			productBeanXML.setQuantityPerBox(new SimpleStringProperty(String.valueOf(perBoxNumber)));

			

			boolean check = false;
			if (boxesRemainder != Integer.parseInt(productBeanXML.getQuantityPerBox())) {

				check = true;

			}

			if (boxesRemainder > 0 && check == true) {

				listOfProductsTemp.add(
						new ProductBeanXML(productBeanXML.getProductSupplierCode(), productBeanXML.getProductHBLOCode(),
								productBeanXML.getProductName(), productBeanXML.getProductGrower(),
								productBeanXML.getProductSupplier(), "1", Integer.toString(boxesRemainder),
								productBeanXML.getProductPrice(), productBeanXML.getProductStatus(), chave,
								productBeanXML.getBillNumber(), productBeanXML.getLotNumber(), productBeanXML.getUnit(),
								productBeanXML.getIpi(), productBeanXML.getEan(), productBeanXML.getNcm(),
								productBeanXML.getCfop(), productBeanXML.getProductDisc(),
								productBeanXML.getProductTotal(), productBeanXML.getComment(), null, null));

			}

		}

		listOfProducts.addAll(listOfProductsTemp);
		// sort list
		listOfProducts.sort(Comparator.comparing(ProductBeanXML::getProductName));

		// set lot number
		int lotSesequence = 0;
		for (ProductBeanXML productBeanXML : listOfProducts) {

			lotSesequence++;

			productBeanXML.setLotNumber(new SimpleStringProperty(bill.getBillDate() + Integer.toString(lotSesequence)));

			BigDecimal priceMVA = new BigDecimal(productBeanXML.getProductPrice());
			productBeanXML.setProductPrice(
					new SimpleStringProperty(priceMVA.setScale(2, BigDecimal.ROUND_CEILING).toString()));

		}

		return listOfProducts;

	}

	// get subsidiary chave
	private static String chave(String subsidiaryCNPJ) {

		String chave = "";

		switch (subsidiaryCNPJ) {

		case "xxxxxxxxxxxx90":
			chave = "xx0";
			break;
		case "xxxxxxxxxxxx70":
			chave = "xxx1";
			break;

		case "xxxxxxxxxxxxx0":
			chave = "xxx5";
			break;

		case "xxxxxxxxxxxxx6":
			chave = "x3";
			break;
		case "xxxxxxxxxxxxx4":
			chave = "x3";
			break;
		case "xxxxxxxxxxxx23":
			chave = "xxx1";
			break;

		case "xxxxxxxxxxxx00":
			chave = "xxx5";
			break;
		case "xxxxxxxxxxxx08":
			chave = "xxx1";
			break;

		}
		
		return chave;
	}

}
