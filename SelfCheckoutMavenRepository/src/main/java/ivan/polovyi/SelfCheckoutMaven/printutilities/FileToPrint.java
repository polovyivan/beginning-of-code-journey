package ivan.polovyi.SelfCheckoutMaven.printutilities;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import ivan.polovyi.SelfCheckoutMaven.beanclasses.ChecklistBean;
import ivan.polovyi.SelfCheckoutMaven.beanclasses.ProductBean;

public class FileToPrint {

	public static String createContentfromHTML(ChecklistBean checkList) {
		String dateStamp = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime());
		StringBuilder toPrint = new StringBuilder();

		toPrint.append(checkList.getCustomerName().replaceAll("\\+", " "));
		toPrint.append("\n" + checkList.getOrderNumber());
		toPrint.append("\n==================================");

		for (ProductBean product : checkList.getProducts()) {

			toPrint.append("\n" + (checkList.getProducts().indexOf(product) + 1) + ". ");

			toPrint.append(product.getProductName());
			toPrint.append("\nLote " + product.getProductLot() + " ");
			toPrint.append("\n" + product.getProductQuantityOfPacks() + "x");
			toPrint.append(product.getProductSalesUnit());

			int productTotalQuantity = Integer.valueOf(product.getProductQuantityOfPacks())
					* Integer.valueOf(product.getProductSalesUnit());
			toPrint.append("=" + productTotalQuantity);
			float priceD = Float.valueOf(product.getProductPrice().replaceAll("\\^([0-9]+)", "").replaceAll(",", "."));

			BigDecimal price = BigDecimal.valueOf(priceD);

			BigDecimal totalValue = BigDecimal.valueOf(productTotalQuantity).multiply(price);
			toPrint.append(" * R$" + product.getProductPrice() + " ");
			toPrint.append(" Total R$" + totalValue.setScale(2, BigDecimal.ROUND_HALF_UP) + " ");
			toPrint.append("\n----------------------------------");
		}
		toPrint.append("\n" + "TOTAL " + checkList.getCheckListTotal());
		toPrint.append("\n----------------------------------");
		toPrint.append("\n" + "             OBRIGADO! ");
		toPrint.append("\n       " + dateStamp + " ");
		toPrint.append("\n   ");
		toPrint.append("\n   ");
		toPrint.append("\nVerificado por____________________");
		toPrint.append("\n   ");
		toPrint.append("\nRecebido por______________________");

		return toPrint.toString();

	}

}
