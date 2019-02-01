package ivan.polovyi.SelfCheckoutMaven.checklist;

import org.apache.commons.lang3.StringUtils;

import ivan.polovyi.SelfCheckoutMaven.beanclasses.OrderBean;

public class Order {

	public static OrderBean createOrder(String htmlContent) {

		String customer = StringUtils.substringBetween(htmlContent, "data-original-title=\"", "\"");
		String orderNumber = StringUtils.substringBetween(htmlContent, "Número do pedido:</th><td class=\"right\">",
				"</td>");

		try {

			customer = customer.replaceAll(" ", "\\+");

		} catch (Exception e) {
			e.printStackTrace();

		}
		return new OrderBean(null, orderNumber, customer, false);
	}
}
