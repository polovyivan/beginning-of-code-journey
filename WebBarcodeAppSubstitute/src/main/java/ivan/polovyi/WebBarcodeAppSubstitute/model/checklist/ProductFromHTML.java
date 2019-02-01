package ivan.polovyi.WebBarcodeAppSubstitute.model.checklist;

import org.apache.commons.lang3.StringUtils;

import ivan.polovyi.WebBarcodeAppSubstitute.model.beans.ProductBean;

public class ProductFromHTML {

	public static ProductBean createProductfromHTML(String html) {
		String productLot = null;
		String productName = null;
		String productPictureLink = null;
		String productSalesUnit = null;
		String avalibaleQty = null;
		String productPrice = null;

		productLot = StringUtils.substringBetween(html, "STI_ID/", "/");

		productName = StringUtils.substringBetween(html, "id=\"product_information\"><h3>", "</h3>");

		productPictureLink = "http://lw-fps-img-01.freshportal.nl" + StringUtils.substringBetween(html,
				"<a href=\"\" role=\"button\"><img src=\"http://lw-fps-img-01.freshportal.nl", "jpg") + "jpg";

		productSalesUnit = StringUtils.substringBetween(html, "class=\"quantity_per_pack\">", "<");
		productPrice = StringUtils.substringBetween(html, "class=\"price\">", "<");
		System.out.println(productPictureLink);
		System.out.println(productPrice);
		return new ProductBean(productLot, productName, null, productSalesUnit, productPictureLink, avalibaleQty,
				productPrice);
	}

}
