package com.ecommerce.app.controller;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
import com.ecommerce.app.model.Brand;
import com.ecommerce.app.model.Price;
import com.ecommerce.app.time.TimeService;

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
	
	/** The service controller. */
	@Autowired
	private ServiceController serviceController;

	/** The time service. */
	@Autowired
	private TimeService timeService;

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
	 * @param idBrand   the id brand
	 * @param date      the date
	 * @return the prices by id
	 */
	@GetMapping("/price/{idProduct}/{idBrand}")
	@ResponseBody
	public ResponseEntity<PriceResponse> getPrice(@PathVariable("idProduct") long idProduct,
			@PathVariable("idBrand") int idBrand, @RequestParam("date") String date) {

		try {
			LocalDateTime queryDate = timeService.getLocalDateTime(date);
			Brand brand = priceService.getBrandById(idBrand);
			if (brand!=null) {
				List<Price> priceList = brand.getPrice().stream()
						.filter(p -> p.getProductId() == idProduct && p.isBetween(queryDate)).collect(Collectors.toList());
				if (priceList != null && !priceList.isEmpty()) {
					Collections.reverse(priceList);
					PriceResponse response = new PriceResponse(priceList.get(0));
					return new ResponseEntity<PriceResponse>(response, HttpStatus.OK);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
