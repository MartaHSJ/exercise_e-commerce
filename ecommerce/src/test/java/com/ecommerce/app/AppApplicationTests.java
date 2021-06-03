package com.ecommerce.app;

import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.app.controller.PriceResponse;

@SpringBootTest
class AppApplicationTests {

	private Logger logger = LoggerFactory.getLogger(AppApplicationTests.class);
	   
	private static final String GET_EMPLOYEE_ENDPOINT_URL = "http://localhost:8080/api/price/{idProduct}/{idBrand}?date={date}";

	private static RestTemplate restTemplate = new RestTemplate();

	@Test
	@DisplayName("Get Price List Query 1")
	public void testGetPriceListQuery1Success() throws URISyntaxException {

		//Test 1: peticion a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
		PriceResponse result = restTemplate.getForObject(GET_EMPLOYEE_ENDPOINT_URL, PriceResponse.class, 35455, 1,
				"2020-06-14-10.00.00");

		logger.info(result.toString());
		
		Assert.assertNotNull(result);
		Assert.assertEquals(35455,result.getProductId());
		Assert.assertEquals(1,result.getPriceList());
		
	}
	
	@Test
	@DisplayName("Get Price List Query 2")
	public void testGetPriceListQuery2Success() throws URISyntaxException {
		
		//Test 2: peticion a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
		PriceResponse result = restTemplate.getForObject(GET_EMPLOYEE_ENDPOINT_URL, PriceResponse.class, 35455, 1,
				"2020-06-14-16.00.00");

		logger.info(result.toString());
		
		Assert.assertNotNull(result);
		Assert.assertEquals(35455,result.getProductId());
		Assert.assertEquals(2,result.getPriceList());
	}
	
	
	@Test
	@DisplayName("Get Price List Query 3")
	public void testGetPriceListQuery3Success() throws URISyntaxException {

		//Test 3: peticion a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
		PriceResponse result = restTemplate.getForObject(GET_EMPLOYEE_ENDPOINT_URL, PriceResponse.class, 35455, 1,
				"2020-06-14-21.00.00");

		logger.info(result.toString());
		
		Assert.assertNotNull(result);
		Assert.assertEquals(35455,result.getProductId());
		Assert.assertEquals(1,result.getPriceList());
	}
	
	
	@Test
	@DisplayName("Get Price List Query 4")
	public void testGetPriceListQuery4Success() throws URISyntaxException {

		//Test 4: peticion a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
		PriceResponse result = restTemplate.getForObject(GET_EMPLOYEE_ENDPOINT_URL, PriceResponse.class, 35455, 1,
				"2020-06-15-10.00.00");

		logger.info(result.toString());
		
		Assert.assertNotNull(result);
		Assert.assertEquals(35455,result.getProductId());
		Assert.assertEquals(3,result.getPriceList());
	}
	
	@Test
	@DisplayName("Get Price List Query 5")
	public void testGetPriceListQuery5Success() throws URISyntaxException {

		//Test 5: peticion a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
		PriceResponse result = restTemplate.getForObject(GET_EMPLOYEE_ENDPOINT_URL, PriceResponse.class, 35455, 1,
				"2020-06-16-21.00.00");

		logger.info(result.toString());
		
		Assert.assertNotNull(result);
		Assert.assertEquals(35455,result.getProductId());
		Assert.assertEquals(4,result.getPriceList());
	}

}
