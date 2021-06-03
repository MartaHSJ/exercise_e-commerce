package com.ecommerce.app.controller;

import java.time.LocalDateTime;

/**
 * The Class PriceResponse.
 */
public class PriceResponse {

	/** The product id. */
	private long productId;

	/** The brand. */
	private int brand;

	/** The price list. */
	private int priceList;

	/** The applicable period start. */
	private LocalDateTime applicablePeriodStart;

	/** The applicable period end. */
	private LocalDateTime applicablePeriodEnd;

	/** The price. */
	private double price;
	
	public PriceResponse() {
		super();
	}

	/**
	 * Instantiates a new price response.
	 *
	 * @param productId the product id
	 * @param brand the brand
	 * @param priceList the price list
	 * @param applicablePeriodStart the applicable period start
	 * @param applicablePeriodEnd the applicable period end
	 * @param price the price
	 */
	public PriceResponse(int productId, int brand, int priceList, LocalDateTime applicablePeriodStart,
			LocalDateTime applicablePeriodEnd, double price) {
		super();
		this.productId = productId;
		this.brand = brand;
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
	 * Gets the brand.
	 *
	 * @return the brand
	 */
	public int getBrand() {
		return brand;
	}

	/**
	 * Sets the brand.
	 *
	 * @param brand the new brand
	 */
	public void setBrand(int brand) {
		this.brand = brand;
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

	@Override
	public String toString() {
		return "PriceResponse [productId=" + productId + ", brand=" + brand + ", priceList=" + priceList
				+ ", applicablePeriodStart=" + applicablePeriodStart + ", applicablePeriodEnd=" + applicablePeriodEnd
				+ ", price=" + price + "]";
	}
	
}
