package com.ecommerce.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Brand.
 */

@Entity
@Table(name = "brand")
public class Brand {

	/** The id. */
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "brandId")
	private long brandId;
	
	/** The price. */
	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private List<Price> price;

	/** The name. */
	@Column(name = "NAME", nullable = false)
    private String name;

	
	/**
	 * Instantiates a new brand.
	 */
	public Brand() {
		super();
	}

	/**
	 * Instantiates a new brand.
	 *
	 * @param brandId the brand id
	 * @param name the name
	 */
	public Brand(long brandId, String name) {
		super();
		this.brandId = brandId;
		this.name = name;
	}

	/**
	 * Gets the brand id.
	 *
	 * @return the brand id
	 */
	public long getBrandId() {
		return brandId;
	}

	/**
	 * Sets the brand id.
	 *
	 * @param brandId the new brand id
	 */
	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public List<Price> getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(List<Price> price) {
		this.price = price;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	
}
