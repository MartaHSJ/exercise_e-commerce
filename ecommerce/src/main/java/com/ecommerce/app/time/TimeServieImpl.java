package com.ecommerce.app.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

/**
 * The Class TimeServieImpl.
 */
@Service
public class TimeServieImpl implements TimeService {

	/** The simple date format. */
	private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");

	/**
	 * Gets the local date time.
	 *
	 * @param date the date
	 * @return the local date time
	 */
	public LocalDateTime getLocalDateTime(String date) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss");
		return LocalDateTime.parse(date, formatter);

	}

	/**
	 * Gets the local date time.
	 *
	 * @param dateTime the date time
	 * @return the local date time
	 */
	public String getLocalDateTime(DateFormat dateTime) {

		String formattedDateTime = dateTime.format(simpleDateFormat);
		return formattedDateTime;
	}

}
