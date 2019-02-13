package ivan.polovyi.AuxiliarySystem.model.utilities.beans;

import javafx.beans.property.SimpleStringProperty;

public class ProductBeanXML extends ProductBean {

	private SimpleStringProperty unit;
	private SimpleStringProperty ipi;
	private SimpleStringProperty EAN;
	private SimpleStringProperty NCM;
	private SimpleStringProperty CFOP;
	private SimpleStringProperty pis;
	private SimpleStringProperty cofins;

	public ProductBeanXML(String productSupplierCode, String productHBLOCode, String productName, String productGrower,
			String productSupplier, String boxQuantity, String quantityPerBox, String productPrice,
			String productStatus, String chave, String billNumber, String lotNumber, String unit, String ipi,
			String EAN, String NCM, String CFOP, String productDiscount, String productTotal, String comment, String pis, String cofins) {
		super(productSupplierCode, productHBLOCode, productName, productGrower, productSupplier, boxQuantity,
				quantityPerBox, productPrice, productStatus, chave, billNumber, lotNumber, productDiscount,
				productTotal, comment);

		this.setCfop(new SimpleStringProperty(CFOP));
		this.setUnit(new SimpleStringProperty(unit));
		this.setIpi(new SimpleStringProperty(ipi));
		this.setEan(new SimpleStringProperty(EAN));
		this.setNcm(new SimpleStringProperty(NCM));
		this.setCfop(new SimpleStringProperty(CFOP));
		this.setPis(new SimpleStringProperty(pis));
		this.setCofins(new SimpleStringProperty(cofins));
	}

	public String getUnit() {
		return unit.get();
	}

	public void setUnit(SimpleStringProperty unit) {
		this.unit = unit;

	}

	public String getIpi() {
		return ipi.get();
	}

	public void setIpi(SimpleStringProperty ipi) {
		this.ipi = ipi;
	}

	public String getEan() {
		return EAN.get();
	}

	public void setEan(SimpleStringProperty EAN) {
		this.EAN = EAN;
	}

	public String getNcm() {
		return NCM.get();
	}

	public void setNcm(SimpleStringProperty NCM) {
		this.NCM = NCM;
	}

	public String getCfop() {
		return CFOP.get();
	}

	public void setCfop(SimpleStringProperty CFOP) {
		this.CFOP = CFOP;
	}

	public String getPis() {
		return pis.get();
	}

	public void setPis(SimpleStringProperty pis) {
		this.pis = pis;
	}

	public String getCofins() {
		return cofins.get();
	}

	public void setCofins(SimpleStringProperty cofins) {
		this.cofins = cofins;
	}
}
