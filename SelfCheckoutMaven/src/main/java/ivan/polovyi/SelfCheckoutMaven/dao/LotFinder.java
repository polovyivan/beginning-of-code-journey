package ivan.polovyi.SelfCheckoutMaven.dao;

import org.apache.commons.lang3.StringUtils;

public class LotFinder {

	public static String getLotFronHTML(String webPageHTMLContent) {

		String lotNumber = null;

		if (webPageHTMLContent.contains("/STI_ID/")) {
			lotNumber = StringUtils.substringBetween(webPageHTMLContent, "/STI_ID/", "/");
		}

		return lotNumber;
	}
}