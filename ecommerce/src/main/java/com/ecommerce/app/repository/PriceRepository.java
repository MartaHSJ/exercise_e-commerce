package com.ecommerce.app.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.app.model.BrandTypeEnum;
import com.ecommerce.app.model.Price;

/**
 * The Interface PriceRepository.
 */
public interface PriceRepository extends JpaRepository<Price, Long> {

  /**
   * Find by product id and brand id and applicable period start before and applicable period end after order by priority desc.
   *
   * @param productId the product id
   * @param brandId the brand id
   * @param startDate the start date
   * @param endDate the end date
   * @return the list
   */
  List<Price> findByProductIdAndBrandIdAndApplicablePeriodStartBeforeAndApplicablePeriodEndAfterOrderByPriorityDesc(long productId, BrandTypeEnum brandId, LocalDateTime startDate, LocalDateTime endDate);
	
}
