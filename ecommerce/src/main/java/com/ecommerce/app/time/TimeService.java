package com.ecommerce.app.time;

import java.text.DateFormat;
import java.time.LocalDateTime;

/**
 * The Interface TimeService.
 */
public interface TimeService {

	/**
	 * Gets the local date time.
	 *
	 * @param date the date
	 * @return the local date time
	 */
	public LocalDateTime getLocalDateTime(String date);
	
	/**
	 * Gets the local date time.
	 *
	 * @param dateTime the date time
	 * @return the local date time
	 */
	public String getLocalDateTime(DateFormat dateTime);
	
}
