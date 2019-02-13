package ivan.polovyi.AuxiliarySystem.model.dataprocessors;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import ivan.polovyi.AuxiliarySystem.database.DBConnInventory;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TextArea;

public class InventoryProcessor {

	public String inventoryProcessing(ArrayList<ProductBean> listofProducts, TextArea txtAreaInventory) {

		List<ProductBean> listofProductsduplicates = new ArrayList<ProductBean>();

		StringBuilder sb = new StringBuilder();

		DBConnInventory dbConn = new DBConnInventory();
		for (ProductBean productBean : listofProducts) {

			productBean.setQuantityPerBox(
					new SimpleStringProperty(StringUtils.substringBefore(productBean.getQuantityPerBox(), ".")));

			if (!productBean.getProductHBLOCode().startsWith("H")) {

				productBean.setProductHBLOCode(new SimpleStringProperty(
						dbConn.getProductCode(productBean.getProductHBLOCode().replaceAll("\\.", ""))));

			}

			javafx.application.Platform.runLater(() -> txtAreaInventory
					.appendText(productBean.getProductHBLOCode() + " + " + productBean.getProductName() + " + "
							+ productBean.getQuantityPerBox() + " + " + productBean.getProductPrice() + "\n"));

		}

		// separate unknown products
		List<ProductBean> unknownProducts = new ArrayList<ProductBean>();
		for (ProductBean product : listofProducts) {
			if (product.getProductHBLOCode().equals("sem cadastro")) {
				unknownProducts.add(product);
				// listofProducts.remove(product);

				javafx.application.Platform.runLater(() -> txtAreaInventory
						.appendText(product.getProductHBLOCode() + " + " + product.getProductName() + " + "
								+ product.getQuantityPerBox() + " + " + product.getProductPrice() + "\n"));

			}
		}

		// Make array list of product codes
		ArrayList<String> productCodes = new ArrayList<String>();

		for (ProductBean product : listofProducts) {
			productCodes.add(product.getProductHBLOCode());
		}

		// count frequency and remove codes that appear only 1 time
		Set<String> codes = new HashSet<String>(productCodes);
		for (String s : codes) {

			if (Collections.frequency(productCodes, s) < 2) {
				productCodes.remove(s);
				txtAreaInventory.appendText("remove" + s + "\n");
			}
		}

		// Remove duplicates codes so it has only original values
		LinkedHashSet<String> hashSet = new LinkedHashSet<>(productCodes);

		ArrayList<String> repitedCodes = new ArrayList<>(hashSet);

		// separate products that have more then one occurrence

		for (int i = 0; i < repitedCodes.size(); i++) {

			for (int j = 0; j < listofProducts.size(); j++) {

				if ((listofProducts.get(j).getProductHBLOCode()).equals(repitedCodes.get(i))) {

					listofProductsduplicates.add(listofProducts.get(j));

				}
			}
		}

		// Subtotal and average price of duplicates

		for (int i = 0; i < listofProductsduplicates.size(); i++) {

			for (int j = i + 1; j < listofProductsduplicates.size(); j++) {

				if ((listofProductsduplicates.get(i).getProductHBLOCode())
						.equals(listofProductsduplicates.get(j).getProductHBLOCode())) {

				

					// add up quantities of the same products
					BigDecimal totalQuantity = new BigDecimal(listofProductsduplicates.get(i).getQuantityPerBox())
							.add(new BigDecimal(listofProductsduplicates.get(j).getQuantityPerBox()))
							.setScale(0, RoundingMode.HALF_EVEN);

					// calculate smart average price

					BigDecimal totalValueI = new BigDecimal(listofProductsduplicates.get(i).getProductPrice())
							.multiply(new BigDecimal(listofProductsduplicates.get(i).getQuantityPerBox()))
							.setScale(2, RoundingMode.HALF_EVEN);

					BigDecimal totalValueJ = new BigDecimal(listofProductsduplicates.get(j).getProductPrice())
							.multiply(new BigDecimal(listofProductsduplicates.get(j).getQuantityPerBox()))
							.setScale(2, RoundingMode.HALF_EVEN);

					BigDecimal averagePrice = totalValueI.add(totalValueJ).divide(totalQuantity, 2,
							RoundingMode.HALF_UP);

					listofProductsduplicates.get(i)
							.setQuantityPerBox(new SimpleStringProperty(totalQuantity.toString()));
					listofProductsduplicates.get(i).setProductPrice(new SimpleStringProperty(averagePrice.toString()));

					// delete an element from list after processing
					listofProductsduplicates.remove(j--);
				}
			}
		}

		// remove products, that was summarized from main list
		for (int i = 0; i < repitedCodes.size(); i++) {
			for (int j = 0; j < listofProducts.size(); j++) {
				if (listofProducts.get(j).getProductHBLOCode().equals(repitedCodes.get(i))) {
					listofProducts.remove(j--);
				}
			}

		}

		// add summarized products to a main list
		for (ProductBean product : listofProductsduplicates) {

			listofProducts.add(product);

		}
		// append products to StringBuilder
		for (ProductBean product : listofProducts) {

			sb.append(product.getProductHBLOCode() + ";");
			sb.append(product.getProductName() + ";");
			sb.append(product.getQuantityPerBox() + ";");
			sb.append(product.getProductPrice() + ";");
			sb.append(System.getProperty("line.separator"));
		}
		sb.append("unknown");
		for (ProductBean product : unknownProducts) {

			sb.append(product.getProductHBLOCode() + ";");
			sb.append(product.getProductName() + ";");
			sb.append(product.getQuantityPerBox() + ";");
			sb.append(product.getProductPrice() + ";");
			sb.append(System.getProperty("line.separator"));
		}

		// seve to file

		return sb.toString();
	}

}
