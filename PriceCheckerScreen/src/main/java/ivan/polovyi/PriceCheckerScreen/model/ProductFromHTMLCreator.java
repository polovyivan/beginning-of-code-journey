package ivan.polovyi.PriceCheckerScreen.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.commons.lang3.StringUtils;

public class ProductFromHTMLCreator {

	public static ProductBean createProductFromHTML(String htmlContent) {
		String name = null;
		String stickerPrice = null;
		BigDecimal stickerPriceBD = null;
		BigDecimal stickerPricePlus20 = null;
		BigDecimal stickerPricePlus25 = null;

		if (htmlContent.contains("Preços")) {
			name = StringUtils.substringBetween(htmlContent, "Preços - ", "</h2>");
			stickerPrice = StringUtils.substringBetween(htmlContent, "id=\"STE_RetailPrice\" value=\"", "\" /></td>");

			stickerPriceBD = new BigDecimal(stickerPrice).setScale(2, RoundingMode.HALF_EVEN);

			stickerPricePlus20 = stickerPriceBD.multiply(new BigDecimal(1.2)).setScale(2, RoundingMode.HALF_EVEN);
			stickerPricePlus25 = stickerPriceBD.multiply(new BigDecimal(1.25)).setScale(2, RoundingMode.HALF_EVEN);

		}
		return new ProductBean(name, stickerPriceBD, stickerPricePlus20, stickerPricePlus25);

	}
}
