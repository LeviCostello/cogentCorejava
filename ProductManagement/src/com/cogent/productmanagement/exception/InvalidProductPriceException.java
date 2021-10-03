package com.cogent.productmanagement.exception;

import lombok.ToString;

@ToString
public class InvalidProductPriceException extends Exception{

	public InvalidProductPriceException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
