package ivan.polovyi.SelfCheckoutMaven.dao;

import org.apache.commons.lang3.StringUtils;

import ivan.polovyi.SelfCheckoutMaven.beanclasses.ProductBean;

public class ProductFromHTML {

	private static String htmlContent;

	public ProductFromHTML(String htmlContent) {

		ProductFromHTML.htmlContent = htmlContent;
	}

	static String productLot = null;
	static String productName = null;
	static String productPictureLink = null;
	static String productSalesUnit = null;
	static String avalibaleQty = null;
	static String productPrice = null;

	public ProductBean createProductfromWebShopHTML() {

		productLot = StringUtils.substringBetween(htmlContent, "STI_ID/", "/");

		productName = StringUtils.substringBetween(htmlContent, "id=\"product_information\"><h3>", "</h3>");

		productPictureLink = "http://lw-fps-img-01.freshportal.nl" + StringUtils.substringBetween(htmlContent,
				"<a href=\"\" role=\"button\"><img src=\"http://lw-fps-img-01.freshportal.nl", "jpg") + "jpg";

		productSalesUnit = StringUtils.substringBetween(htmlContent, "class=\"quantity_per_pack\">", "<");
		productPrice = StringUtils.substringBetween(htmlContent, "class=\"price\">R&#36;", "<");

		System.out.println(productPictureLink);
		System.out.println(productPrice);
		return new ProductBean(productLot, productName, null, productSalesUnit, productPictureLink, avalibaleQty,
				productPrice);
	}

	public String getHtmlContent() {
		return htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		ProductFromHTML.htmlContent = htmlContent;
	}

}
