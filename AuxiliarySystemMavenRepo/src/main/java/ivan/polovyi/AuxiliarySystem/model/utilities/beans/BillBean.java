package ivan.polovyi.AuxiliarySystem.model.utilities.beans;

import javafx.beans.property.SimpleStringProperty;

public class BillBean {

	private SimpleStringProperty billNumber;
	private SimpleStringProperty billBarcodeKey;
	private SimpleStringProperty billDate;
	private SimpleStringProperty supplierName;
	private SimpleStringProperty supplierCNPJ;
	private SimpleStringProperty subsidiaryCNPJ;
	private SimpleStringProperty billDescount;
	private SimpleStringProperty billTotal;
	private SimpleStringProperty billDest;

	// private static String productSize;

	public BillBean(String billNumber, String billBarcodeKey, String billDate, String supplierName, String supplierCNPJ,
			String subsidiaryCNPJ, String billDescount, String billTotal, String billDest) {
		this.setBillNumber(new SimpleStringProperty(billNumber));
		this.setBillBarcodeKey(new SimpleStringProperty(billBarcodeKey));
		this.setBillDate(new SimpleStringProperty(billDate));
		this.setSupplierName(new SimpleStringProperty(supplierName));
		this.setSupplierCNPJ(new SimpleStringProperty(supplierCNPJ));
		this.setSubsidiaryCNPJ(new SimpleStringProperty(subsidiaryCNPJ));
		this.setBillDescount(new SimpleStringProperty(billDescount));
		this.setBillTotal(new SimpleStringProperty(billTotal));
		this.setBillDest(new SimpleStringProperty(billDest));
	}

	public String getBillNumber() {
		return billNumber.get();
	}

	public void setBillNumber(SimpleStringProperty billNumber) {
		this.billNumber = billNumber;
	}

	public String getBillDate() {
		return billDate.get();
	}

	public void setBillDate(SimpleStringProperty billDate) {
		this.billDate = billDate;
	}

	public String getSupplierName() {
		return supplierName.get();
	}

	public void setSupplierName(SimpleStringProperty supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierCNPJ() {
		return supplierCNPJ.get();
	}

	public void setSupplierCNPJ(SimpleStringProperty supplierCNPJ) {
		this.supplierCNPJ = supplierCNPJ;
	}

	public String getSubsidiaryCNPJ() {
		return subsidiaryCNPJ.get();
	}

	public void setSubsidiaryCNPJ(SimpleStringProperty subsidiaryCNPJ) {
		this.subsidiaryCNPJ = subsidiaryCNPJ;
	}

	public String getBillDescount() {
		return billDescount.get();
	}

	public void setBillDescount(SimpleStringProperty billDescount) {
		this.billDescount = billDescount;
	}

	public String getBillTotal() {
		return billTotal.get();
	}

	public void setBillTotal(SimpleStringProperty billTotal) {
		this.billTotal = billTotal;
	}

	public String getBillDest() {
		return billDest.get();
	}

	public void setBillDest(SimpleStringProperty billDest) {
		this.billDest = billDest;
	}

	public String getBillBarcodeKey() {
		return billBarcodeKey.get();
	}

	public void setBillBarcodeKey(SimpleStringProperty billBarcodeKey) {
		this.billBarcodeKey = billBarcodeKey;
	}

}