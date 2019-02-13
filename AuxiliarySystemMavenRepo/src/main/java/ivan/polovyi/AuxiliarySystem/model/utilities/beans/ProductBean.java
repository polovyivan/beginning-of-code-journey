package ivan.polovyi.AuxiliarySystem.model.utilities.beans;

import javafx.beans.property.SimpleStringProperty;

public class ProductBean {
	private SimpleStringProperty chave;
	private SimpleStringProperty productSupplierCode;
	private SimpleStringProperty productHBLOCode;
	private SimpleStringProperty productName;
	private SimpleStringProperty productGrower;
	private SimpleStringProperty billNumber;
	private SimpleStringProperty lotNumber;
	private SimpleStringProperty boxQuantity;
	private SimpleStringProperty quantityPerBox;
	private SimpleStringProperty productSupplier;
	private SimpleStringProperty productPrice;
	private SimpleStringProperty productTotal;
	private SimpleStringProperty productDisc;
	private SimpleStringProperty productStatus;
	private SimpleStringProperty comment;
	// private static String productSize;

	public ProductBean(String productSupplierCode, String productHBLOCode, String productName, String productGrower,
			String productSupplier, String boxQuantity, String quantityPerBox, String productPrice,
			String productStatus, String chave, String billNumber, String lotNumber, String productDisc, String productTotal, String comment) {
		this.setProductSupplierCode(new SimpleStringProperty(productSupplierCode));
		this.setProductHBLOCode(new SimpleStringProperty(productHBLOCode));
		this.setProductName(new SimpleStringProperty(productName));
		this.setProductGrower(new SimpleStringProperty(productGrower));

		this.setProductSupplier(new SimpleStringProperty(productSupplier));

		this.setBillNumber(new SimpleStringProperty(billNumber));
		this.setLotNumber(new SimpleStringProperty(lotNumber));

		this.setChave(new SimpleStringProperty(chave));

		this.setBoxQuantity(new SimpleStringProperty(boxQuantity));
		this.setQuantityPerBox(new SimpleStringProperty(quantityPerBox));
		this.setProductPrice(new SimpleStringProperty(productPrice));
		this.setProductStatus(new SimpleStringProperty(productStatus));
		
		this.setProductTotal(new SimpleStringProperty(productTotal));
		this.setProductDisc(new SimpleStringProperty(productDisc));
		this.setComment(new SimpleStringProperty(comment));
		

	}

	public String getChave() {
		return chave.get();
	}

	public void setChave(SimpleStringProperty chave) {
		this.chave = chave;
	}

	public String getProductSupplierCode() {
		return productSupplierCode.get();
	}

	public void setProductSupplierCode(SimpleStringProperty productSupplierCode) {
		this.productSupplierCode = productSupplierCode;
	}

	public String getProductHBLOCode() {
		return productHBLOCode.get();
	}

	public void setProductHBLOCode(SimpleStringProperty productHBLOCode) {
		this.productHBLOCode = productHBLOCode;
	}

	public String getProductName() {

		return productName.get();
	}

	public void setProductName(SimpleStringProperty productName) {

		this.productName = productName;
	}

	public String getProductGrower() {
		return productGrower.get();
	}

	public void setProductGrower(SimpleStringProperty productGrower) {
		this.productGrower = productGrower;
	}

	public String getBillNumber() {

		return billNumber.get();
	}

	public void setBillNumber(SimpleStringProperty billNumber) {

		this.billNumber = billNumber;
	}

	public String getLotNumber() {

		return lotNumber.get();
	}

	public void setLotNumber(SimpleStringProperty lotNumber) {

		this.lotNumber = lotNumber;
	}

	public String getBoxQuantity() {
		return boxQuantity.get();
	}

	public void setBoxQuantity(SimpleStringProperty boxQuantity) {
		this.boxQuantity = boxQuantity;
	}

	public String getQuantityPerBox() {
		return quantityPerBox.get();
	}

	public void setQuantityPerBox(SimpleStringProperty quantityPerBox) {
		this.quantityPerBox = quantityPerBox;
	}

	public String getProductPrice() {
		return productPrice.get();
	}

	public void setProductPrice(SimpleStringProperty productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductStatus() {
		return productStatus.get();
	}

	public void setProductStatus(SimpleStringProperty productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductSupplier() {

		return productSupplier.get();
	}

	public void setProductSupplier(SimpleStringProperty productSupplier) {

		this.productSupplier = productSupplier;
	}

	public String getProductTotal() {

		return productTotal.get();
	}

	public void setProductTotal(SimpleStringProperty productTotal) {

		this.productTotal = productTotal;
	}
	
	public String getProductDisc() {

		return productDisc.get();
	}

	public void setProductDisc(SimpleStringProperty productDisc) {

		this.productDisc = productDisc;
	}
	public String getComment() {

		return comment.get();
	}

	public void setComment(SimpleStringProperty comment) {

		this.comment = comment;
	}
	
}