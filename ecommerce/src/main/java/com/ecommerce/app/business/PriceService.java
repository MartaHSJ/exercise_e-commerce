package com.ecommerce.app.business;

import java.util.List;

import com.ecommerce.app.	model.Brand;
import com.ecommerce.app.model.Price;

/**
 * The Interface PriceService.
 */
public interface PriceService {

	/**
	 * Gets the all price.
	 *
	 * @return the all price
	 */
	List<Price> getAllPrice();

	/**
	 * Gets the brand by id.
	 *
	 * @param idBrand the id brand
	 * @return the brand by id
	 */
	Brand getBrandById(long idBrand);

}
