package ivan.polovyi.SelfCheckoutMaven.beanclasses;

import java.util.ArrayList;

public class ChecklistBean {

	private String checkListId;
	private String orderNumber;
	private String customerName;
	private ArrayList<ProductBean> products;
	private String checkListTotal;

	public ChecklistBean(String checkListId, String orderNumber, String customerName, ArrayList<ProductBean> products,
			String checkListTotal) {

		this.checkListId = checkListId;
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.products = products;
		this.checkListTotal = checkListTotal;
	}

	public String getCheckListId() {
		return checkListId;
	}

	public void setCheckListId(String checkListId) {
		this.checkListId = checkListId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ArrayList<ProductBean> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<ProductBean> products) {
		this.products = products;
	}

	public String getCheckListTotal() {
		return checkListTotal;
	}

	public void setCheckListTotal(String checkListTotal) {
		this.checkListTotal = checkListTotal;
	}

	

}
