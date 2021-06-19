package com.ecommerce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.app.model.Brand;

/**
 * The Interface BrandRepository.
 */
public interface BrandRepository extends JpaRepository<Brand, Long> {
	
	 /**
 	 * Find by brand id.
 	 *
 	 * @param id the id
 	 * @return the brand
 	 */
 	Brand findByBrandId(long id);
	 
}
