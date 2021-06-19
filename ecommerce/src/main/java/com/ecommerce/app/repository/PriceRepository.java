package com.ecommerce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.app.model.Price;

/**
 * The Interface PriceRepository.
 */
public interface PriceRepository extends JpaRepository<Price, Long> {

}
