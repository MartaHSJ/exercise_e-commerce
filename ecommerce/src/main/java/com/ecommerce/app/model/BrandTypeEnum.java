package com.ecommerce.app.model;

import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The Enum BrandTypeEnum.
 */
public enum BrandTypeEnum {
	
	/** The zara. */
	ZARA (1);
	
	/** The code. */
	private int code;
	
	/**
	 * Instantiates a new brand type enum.
	 *
	 * @param code the code
	 */
	private BrandTypeEnum(int code) {
		this.code=code;
	}
	
	/**
	 * Decode.
	 *
	 * @param code the code
	 * @return the brand type enum
	 */
	@JsonCreator
	public static BrandTypeEnum decode(final int code) {
		return Stream.of(BrandTypeEnum.values()).filter(brandEnum -> brandEnum.code==code).findFirst().orElse(null);
	}
	
	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	@JsonValue
	public int getCode() {
		return code;
	}
}
