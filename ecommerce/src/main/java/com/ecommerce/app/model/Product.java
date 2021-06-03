package com.ecommerce.app.model;

import java.io.Serializable;

/**
 * The Class Product.
 */
public class Product implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private long id;

	/**
	 * Instantiates a new product.
	 *
	 * @param idProduct the id
	 */
	public Product(long idProduct) {
		super();
		this.id = idProduct;
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

}
