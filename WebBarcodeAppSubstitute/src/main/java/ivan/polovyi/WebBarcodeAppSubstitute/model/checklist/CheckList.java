package ivan.polovyi.WebBarcodeAppSubstitute.model.checklist;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import ivan.polovyi.WebBarcodeAppSubstitute.model.beans.ChecklistBean;
import ivan.polovyi.WebBarcodeAppSubstitute.model.beans.ProductBean;

public class CheckList {

	public static ChecklistBean createChecklistfromHTML(String invoiceHtml) {

		String checkListTotal = StringUtils.substringBetween(invoiceHtml, "invoice_table_footer_total_price\">", "<");
		System.out.println("checkListTotal " + checkListTotal);

		String customerName = StringUtils.substringAfter(
				StringUtils.substringBetween(invoiceHtml, "customer/customer/index/CUS_ID/", "</a>"), ">");
		System.out.println("customerName " + customerName);
		ArrayList<ProductBean> products = productList(invoiceHtml);
		System.out.println(checkListTotal);
		for (ProductBean productBean : products) {
			System.out.println("Lot " + productBean.getProductLot());
			System.out.println("Name " + productBean.getProductName());
			System.out.println("Price " + productBean.getProductPrice());
			System.out.println("QtyPacks " + productBean.getProductQuantityOfPacks());
			System.out.println("per pack" + productBean.getProductSalesUnit());

		}
		return new ChecklistBean(null, null, customerName, products, checkListTotal);

	}

	private static ArrayList<ProductBean> productList(String html) {

		ArrayList<ProductBean> products = new ArrayList<ProductBean>();
//getting whole table
		String productTable = StringUtils.substringBetween(html, "invoice_table\">", "</table>");

		System.out.println("productTable " + productTable + " productTable");

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

				int count = 0;
				for (String rowLine : columnSeparator) {
					count++;
					System.out.println(count);
					System.out.println("rowLine  " + rowLine);

					productName = StringUtils.substringBetween(columnSeparator[1], ">", "<");
					qtyPack = StringUtils.substringBetween(columnSeparator[2], ">", "<");
					qtyPerPack = StringUtils.substringBetween(columnSeparator[3], ">", "<");
					prodPrice = StringUtils.substringBetween(columnSeparator[5], ">R&#36; ", "<");
					productlot = StringUtils.substringBetween(columnSeparator[5], "STI_ID/", "/CUS_ID/");

				}
				products.add(new ProductBean(productlot, productName, qtyPack, qtyPerPack, null, null, prodPrice));
			}

		}

		return products;

	}

}
