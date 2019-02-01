package ivan.polovyi.SelfCheckoutMaven.beanclasses;

public class OrderBean {
	private String checkListId;
	private String checkListOrderNumber;
	private String customerName;
	private String pdfContent;
	private boolean printed;

	public OrderBean(String checkListId, String checkListOrderNumber, String customerName, boolean printed) {

		this.setCheckListId(checkListId);
		this.setCheckListOrderNumber(checkListOrderNumber);
		this.setCustomerName(customerName);
		this.setPrinted(printed);
	}

	public String getCheckListOrderNumber() {
		return checkListOrderNumber;
	}

	public void setCheckListOrderNumber(String checkListOrderNumber) {
		this.checkListOrderNumber = checkListOrderNumber;
	}

	public String getCheckListId() {
		return checkListId;
	}

	public void setCheckListId(String checkListId) {
		this.checkListId = checkListId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPdfContent() {
		return pdfContent;
	}

	public void setPdfContent(String pdfContent) {
		this.pdfContent = pdfContent;
	}

	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean printed) {
		this.printed = printed;
	}

}
