package ivan.polovyi.WebBarcodeAppSubstitute.model.beans;

public class ProductBean {

	private String productLot;
	private String productName;
	private String productQuantityOfPacks;
	private String productSalesUnit;
	private String productPictureLink;
	private String avalibaleQty;
	private String productPrice;

	public ProductBean(String productLot, String productName, String productQuantityOfPacks, String productSalesUnit, String productPictureLink, String avalibaleQty,
			String productPrice) {

		this.setProductLot(productLot);
		this.setProductName(productName);
		this.setProductQuantityOfPacks(productQuantityOfPacks);
		this.setProductSalesUnit(productSalesUnit);
		this.setProductPictureLink(productPictureLink);
		this.setAvalibaleQty(avalibaleQty);
		this.setProductPrice(productPrice);
	}

	public String getProductLot() {
		return productLot;
	}

	public void setProductLot(String productLot) {
		this.productLot = productLot;
	}

	public String getProductSalesUnit() {
		return productSalesUnit;
	}

	public void setProductSalesUnit(String productSalesUnit) {
		this.productSalesUnit = productSalesUnit;
	}

	public String getProductPictureLink() {
		return productPictureLink;
	}

	public void setProductPictureLink(String productPictureLink) {
		this.productPictureLink = productPictureLink;
	}

	public String getAvalibaleQty() {
		return avalibaleQty;
	}

	public void setAvalibaleQty(String avalibaleQty) {
		this.avalibaleQty = avalibaleQty;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuantityOfPacks() {
		return productQuantityOfPacks;
	}

	public void setProductQuantityOfPacks(String productQuantityOfPacks) {
		this.productQuantityOfPacks = productQuantityOfPacks;
	}

}
