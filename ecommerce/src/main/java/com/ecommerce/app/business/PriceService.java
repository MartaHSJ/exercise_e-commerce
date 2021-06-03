package com.ecommerce.app.business;

import java.util.List;

import com.ecommerce.app.controller.PriceResponse;
import com.ecommerce.app.model.Price;

/**
 * The Interface PriceService.
 */
public interface PriceService {

	/**
	 * Creates the price respose.
	 *
	 * @param price the price
	 * @return the price response
	 */
	PriceResponse createPriceRespose(Price price);

	/**
	 * Gets the price.
	 *
	 * @param idProduct the id product
	 * @param idBrand the id brand
	 * @param date the date
	 * @return the price
	 */
	Price getPrice(long idProduct, int idBrand, String date);

	/**
	 * Gets the all price.
	 *
	 * @return the all price
	 */
	List<Price> getAllPrice();

}
