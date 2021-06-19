package com.ecommerce.app.controller;

import java.time.LocalDateTime;

import com.ecommerce.app.model.Price;

/**
 * The Class PriceResponse.
 */
public class PriceResponse {

	/** The product id. */
	private long productId;

	/** The brand name. */
	private String brandName;

	/** The price list. */
	private int priceList;

	/** The applicable period start. */
	private LocalDateTime applicablePeriodStart;

	/** The applicable period end. */
	private LocalDateTime applicablePeriodEnd;

	/** The price. */
	private double price;

	/**
	 * Instantiates a new price response.
	 * 
	 * @param price
	 */
	public PriceResponse(Price price) {
		super();
		this.productId = price.getProductId();
		this.brandName = price.getBrand().getName();
		this.priceList = price.getPriceList();
		this.applicablePeriodStart = price.getApplicablePeriodStart();
		this.applicablePeriodEnd = price.getApplicablePeriodEnd();
		this.price = price.getPrice();

	}

	/**
	 * Instantiates a new price response.
	 *
	 * @param productId             the product id
	 * @param brand                 the brand
	 * @param priceList             the price list
	 * @param applicablePeriodStart the applicable period start
	 * @param applicablePeriodEnd   the applicable period end
	 * @param price                 the price
	 */
	public PriceResponse(long productId, String brand, int priceList, LocalDateTime applicablePeriodStart,
			LocalDateTime applicablePeriodEnd, double price) {
		super();
		this.productId = productId;
		this.brandName = brand;
		this.priceList = priceList;
		this.applicablePeriodStart = applicablePeriodStart;
		this.applicablePeriodEnd = applicablePeriodEnd;
		this.price = price;
	}

	/**
	 * Gets the product id.
	 *
	 * @return the product id
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * Sets the product id.
	 *
	 * @param productId the new product id
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}

	/**
	 * Gets the brand name.
	 *
	 * @return the brand name
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * Sets the brand name.
	 *
	 * @param brandName the new brand name
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * Gets the price list.
	 *
	 * @return the price list
	 */
	public int getPriceList() {
		return priceList;
	}

	/**
	 * Sets the price list.
	 *
	 * @param priceList the new price list
	 */
	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}

	/**
	 * Gets the applicable period start.
	 *
	 * @return the applicable period start
	 */
	public LocalDateTime getApplicablePeriodStart() {
		return applicablePeriodStart;
	}

	/**
	 * Sets the applicable period start.
	 *
	 * @param applicablePeriodStart the new applicable period start
	 */
	public void setApplicablePeriodStart(LocalDateTime applicablePeriodStart) {
		this.applicablePeriodStart = applicablePeriodStart;
	}

	/**
	 * Gets the applicable period end.
	 *
	 * @return the applicable period end
	 */
	public LocalDateTime getApplicablePeriodEnd() {
		return applicablePeriodEnd;
	}

	/**
	 * Sets the applicable period end.
	 *
	 * @param applicablePeriodEnd the new applicable period end
	 */
	public void setApplicablePeriodEnd(LocalDateTime applicablePeriodEnd) {
		this.applicablePeriodEnd = applicablePeriodEnd;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "PriceResponse [productId=" + productId + ", brandName=" + brandName + ", priceList=" + priceList
				+ ", applicablePeriodStart=" + applicablePeriodStart + ", applicablePeriodEnd=" + applicablePeriodEnd
				+ ", price=" + price + "]";
	}

}
