package com.ecommerce.app.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Price.
 */
@Entity
@Table(name = "PRICE_LIST")
public class Price {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	/** The brand id. */
	@Column(name = "BRAND_ID", nullable = false)
	private BrandTypeEnum brandId;

	/** The applicable period start. */
	@Column(name = "START_DATE", nullable = false)
	private LocalDateTime applicablePeriodStart;

	/** The applicable period end. */
	@Column(name = "END_DATE", nullable = false)
	private LocalDateTime applicablePeriodEnd;

	/** The price list. */
	@Column(name = "PRICE_LIST", nullable = false)
	private int priceList;

	/** The product id. */
	@Column(name = "PRODUCT_ID", nullable = false)
	private long productId;

	/** The priority. */
	@Column(name = "PRIORITY", nullable = false)
	private int priority;

	/** The price. */
	@Column(name = "PRICE", nullable = false)
	private double price;

	/** The curr. */
	@Enumerated(value = EnumType.STRING)
	@Column(name = "CURR", nullable = false)
	private CurrEnum curr;

	
	/**
	 * Instantiates a new price.
	 */
	public Price() {
		super();
	}

	/**
	 * Instantiates a new price.
	 *
	 * @param brandId the brand id
	 * @param applicablePeriodStart the applicable period start
	 * @param applicablePeriodEnd the applicable period end
	 * @param priceList the price list
	 * @param productId the product id
	 * @param priority the priority
	 * @param price the price
	 * @param curr the curr
	 */
	public Price(BrandTypeEnum brandId, LocalDateTime applicablePeriodStart, LocalDateTime applicablePeriodEnd,
			int priceList, long productId, int priority, double price, CurrEnum curr) {
		super();
		this.brandId = brandId;
		this.applicablePeriodStart = applicablePeriodStart;
		this.applicablePeriodEnd = applicablePeriodEnd;
		this.priceList = priceList;
		this.productId = productId;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the brand id.
	 *
	 * @return the brand id
	 */
	public BrandTypeEnum getBrandId() {
		return brandId;
	}

	/**
	 * Sets the brand id.
	 *
	 * @param brandId the new brand id
	 */
	public void setBrandId(BrandTypeEnum brandId) {
		this.brandId = brandId;
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
	 * Gets the priority.
	 *
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * Sets the priority.
	 *
	 * @param priority the new priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
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
	 * Gets the curr.
	 *
	 * @return the curr
	 */
	public CurrEnum getCurr() {
		return curr;
	}

	/**
	 * Sets the curr.
	 *
	 * @param curr the new curr
	 */
	public void setCurr(CurrEnum curr) {
		this.curr = curr;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Price [id=" + id + ", brandId=" + brandId + ", applicablePeriodStart=" + applicablePeriodStart
				+ ", applicablePeriodEnd=" + applicablePeriodEnd + ", priceList=" + priceList + ", productId="
				+ productId + ", priority=" + priority + ", price=" + price + ", curr=" + curr + "]";
	}

}
