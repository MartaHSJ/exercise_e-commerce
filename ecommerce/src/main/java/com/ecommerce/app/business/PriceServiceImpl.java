package com.ecommerce.app.business;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.controller.PriceResponse;
import com.ecommerce.app.model.BrandTypeEnum;
import com.ecommerce.app.model.CurrEnum;
import com.ecommerce.app.model.Price;
import com.ecommerce.app.repository.PriceRepository;
import com.ecommerce.app.time.TimeService;

/**
 * The Class PriceServiceImpl.
 */
@Service
public class PriceServiceImpl implements PriceService {

	/** The price repository. */
	@Autowired
	PriceRepository priceRepository;
	
	/** The time service. */
	@Autowired
	private TimeService timeService;
	
	/**
	 * Inits the db.
	 */
	@PostConstruct
    private void init() {
		
		Price price1 = new Price(BrandTypeEnum.ZARA, timeService.getLocalDateTime("2020-06-14-00.00.00"), timeService.getLocalDateTime("2020-12-31-23.59.59"),1, 35455,0,35.50,CurrEnum.EUR);
		savePrice(price1);
		
		Price price2 = new Price(BrandTypeEnum.ZARA, timeService.getLocalDateTime("2020-06-14-15.00.00"), timeService.getLocalDateTime("2020-06-14-18.30.00"),2, 35455,1,25.45,CurrEnum.EUR);
		savePrice(price2);
		
		Price price3 = new Price(BrandTypeEnum.ZARA, timeService.getLocalDateTime("2020-06-15-00.00.00"), timeService.getLocalDateTime("2020-06-15-11.00.00"),3, 35455,1,30.50,CurrEnum.EUR);
		savePrice(price3);
		
	    Price price4 = new Price(BrandTypeEnum.ZARA, timeService.getLocalDateTime("2020-06-15-16.00.00"), timeService.getLocalDateTime("2020-12-31-23.59.59"),4, 35455,1,38.95,CurrEnum.EUR);
		savePrice(price4);
    }

	/**
	 * Save price.
	 *
	 * @param price the price
	 */
	private void savePrice(final Price price) {
		priceRepository.save(price);
	}
	
	/**
	 * Creates the price respose.
	 *
	 * @param price the price
	 * @return the price response
	 */
	@Override
	public PriceResponse createPriceRespose(Price price) {
		PriceResponse response = new PriceResponse((int) price.getProductId(), price.getBrandId().getCode(), price.getPriceList(), price.getApplicablePeriodStart(),
				price.getApplicablePeriodEnd(), price.getPrice());
		return response;
	}

	/**
	 * Gets the price.
	 *
	 * @param idProduct the id product
	 * @param idBrand the id brand
	 * @param date the date
	 * @return the price
	 */
	@Override
	public Price getPrice(long idProduct, int idBrand, String date) {
		
		Price priceData = null;
		
		BrandTypeEnum brandType = BrandTypeEnum.decode(idBrand);
		
		List<Price> priceDataList = priceRepository
				.findByProductIdAndBrandIdAndApplicablePeriodStartBeforeAndApplicablePeriodEndAfterOrderByPriorityDesc(
						idProduct, brandType, timeService.getLocalDateTime(date), timeService.getLocalDateTime(date));

		if (priceDataList != null && !priceDataList.isEmpty()) {
			priceData = priceDataList.get(0);
		}
		
		return priceData;
	}
	
	/**
	 * Gets the all price.
	 *
	 * @return the all price
	 */
	@Override
	public List<Price> getAllPrice(){
		return priceRepository.findAll();
	}

}
