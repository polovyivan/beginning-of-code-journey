package ivan.polovyi.AuxiliarySystem.model.dataprocessors;

import java.io.IOException;

import org.openxml4j.exceptions.InvalidFormatException;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CooperfloraFLOProcess {

	static String inputFilePath;

	ObservableList<ProductBean> product = FXCollections.observableArrayList();

	public ObservableList<ProductBean> displayText(String resultString) throws IOException, InvalidFormatException {

	

		String[] lineSeparator = resultString.toString().split("lineSplit");
		try {

			for (String line : lineSeparator) {
				if (!line.contains("null")) {
					

					String[] atributeSeparator = line.split(";");

					String chave = atributeSeparator[0];
					// customer = atributeSeparator[1];

					String supplierProductCode = atributeSeparator[3];
				
					String productName = atributeSeparator[4];
					
					// productSize = atributeSeparator[5];
					
					String productQuality = atributeSeparator[6];
					
					String productGrower = "CF" + atributeSeparator[7];
					String billNumber = atributeSeparator[9].replaceFirst("^0+(?!$)", "");
					String boxQuantity = atributeSeparator[10];
					String quantityPerBox = atributeSeparator[11];
					String productPrice = atributeSeparator[12];

					String productLot = atributeSeparator[23];

					String productDate = atributeSeparator[24];

					StringBuilder productDateFormated = new StringBuilder().append(productDate.charAt(6))
							.append(productDate.charAt(7)).append(productDate.charAt(4)).append(productDate.charAt(5))
							.append(productDate.charAt(2)).append(productDate.charAt(3));

					//productDate = productDateFormated.toString();

					if (!billNumber.isEmpty()) {
						product.add(new ProductBean(supplierProductCode, null, productName, productGrower,
								"COOPERFLORA", boxQuantity, quantityPerBox, productPrice, null, chave, billNumber,
								productLot, null, null, null));

					}

				}
			}
		} catch (Exception e) {
			ViewFactory error = new ViewFactory();
			error.getErrorMess("CooperfloraFLOProcess class_ " + e.toString());
		}
		return product;
	}

}