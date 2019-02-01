package ivan.polovyi.PriceCheckerScreen.model;

import java.math.BigDecimal;

public class ProductBean {
	private String name;
	private BigDecimal stickerPrice;
	private BigDecimal stickerPricePlus20;
	private BigDecimal stickerPricePlus25;

	public ProductBean(String name, BigDecimal stickerPrice, BigDecimal stickerPricePlus20, BigDecimal stickerPricePlus25) {
		
		this.setName(name);
		this.setStickerPrice(stickerPrice);
		this.setStickerPricePlus20(stickerPricePlus20);
		this.setStickerPricePlus25(stickerPricePlus25);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getStickerPrice() {
		return stickerPrice;
	}

	public void setStickerPrice(BigDecimal stickerPrice) {
		this.stickerPrice = stickerPrice;
	}

	public BigDecimal getStickerPricePlus20() {
		return stickerPricePlus20;
	}

	public void setStickerPricePlus20(BigDecimal stickerPricePlus20) {
		this.stickerPricePlus20 = stickerPricePlus20;
	}

	public BigDecimal getStickerPricePlus25() {
		return stickerPricePlus25;
	}

	public void setStickerPricePlus25(BigDecimal stickerPricePlus25) {
		this.stickerPricePlus25 = stickerPricePlus25;
	}

	
}
