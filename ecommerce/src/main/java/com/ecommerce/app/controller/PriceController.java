package com.ecommerce.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.business.PriceService;
import com.ecommerce.app.model.Price;

/**
 * The Class PriceController.
 */
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class PriceController {

	/** The price service. */
	@Autowired
	private PriceService priceService;

	/**
	 * Gets the all price.
	 *
	 * @return the all price
	 */
	@GetMapping("/allprices")
	public List<Price> getAllPrice() {
		return priceService.getAllPrice();
	}

	/**
	 * Gets the prices by id.
	 *
	 * @param idProduct the id product
	 * @param idBrand the id brand
	 * @param date the date
	 * @return the prices by id
	 */
	@GetMapping("/price/{idProduct}/{idBrand}")
	@ResponseBody
	public ResponseEntity<PriceResponse> getPrice(@PathVariable("idProduct") long idProduct,
			@PathVariable("idBrand") int idBrand, @RequestParam("date") String date) {

		try {
			Price priceData = priceService.getPrice(idProduct, idBrand, date);
			if (priceData != null) {
				PriceResponse response = priceService.createPriceRespose(priceData);
				return new ResponseEntity<PriceResponse>(response, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
