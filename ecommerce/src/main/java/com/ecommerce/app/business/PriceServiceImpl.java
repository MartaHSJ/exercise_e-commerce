package com.ecommerce.app.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.model.Brand;
import com.ecommerce.app.model.Price;
import com.ecommerce.app.repository.BrandRepository;
import com.ecommerce.app.repository.PriceRepository;

/**
 * The Class PriceServiceImpl.
 */
@Service
public class PriceServiceImpl implements PriceService {

	/** The price repository. */
	@Autowired
	PriceRepository priceRepository;
	
	/** The brand repository. */
	@Autowired
	BrandRepository brandRepository;
	
	/**
	 * Gets the all price.
	 *
	 * @return the all price
	 */
	@Override
	public List<Price> getAllPrice(){
		return (List<Price>) priceRepository.findAll();
	}

	/**
	 * Gets the brand by id.
	 *
	 * @param id the id
	 * @return the brand by id
	 */
	@Override
	public Brand getBrandById(long id) {
		return brandRepository.findById(id).get();
	}

}
