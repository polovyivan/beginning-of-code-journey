package ivan.polovyi.SelfCheckoutMaven.checklist;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import ivan.polovyi.SelfCheckoutMaven.beanclasses.ChecklistBean;
import ivan.polovyi.SelfCheckoutMaven.beanclasses.ProductBean;

public class CheckList {

	public static ChecklistBean createChecklistfromHTML(String invoiceHtml) {

		String checkListTotal = StringUtils.substringBetween(invoiceHtml, "invoice_table_footer_total_price\">", "<");

		ArrayList<ProductBean> products = productList(invoiceHtml);

		return new ChecklistBean(null, null, null, products, checkListTotal);

	}

	private static ArrayList<ProductBean> productList(String html) {

		ArrayList<ProductBean> products = new ArrayList<ProductBean>();
//getting whole table
		String productTable = StringUtils.substringBetween(html, "invoice_table\">", "</table>");

		// splitting table by row
		String[] rowSeparator = productTable.split("</tr><tr");
		for (String tableLine : rowSeparator) {
			if (tableLine.contains("STI_ID")) {

				// splitting row by column
				String[] columnSeparator = tableLine.split("/td>");
				String productlot = null;
				String productName = null;
				String qtyPack = null;
				String qtyPerPack = null;
				String prodPrice = null;

				productName = StringUtils.substringBetween(columnSeparator[1], ">", "<");
				qtyPack = StringUtils.substringBetween(columnSeparator[2], ">", "<");
				qtyPerPack = StringUtils.substringBetween(columnSeparator[3], ">", "<");
				prodPrice = StringUtils.substringBetween(columnSeparator[5], ">R&#36; ", "<");
				productlot = StringUtils.substringBetween(columnSeparator[5], "STI_ID/", "/CUS_ID/");

				products.add(new ProductBean(productlot, productName, qtyPack, qtyPerPack, null, null, prodPrice));
			}

		}

		return products;

	}

}
