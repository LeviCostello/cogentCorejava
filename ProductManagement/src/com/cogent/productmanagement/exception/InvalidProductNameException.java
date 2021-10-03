package com.cogent.productmanagement.exception;

import lombok.ToString;

@ToString
public class InvalidProductNameException extends RuntimeException{

	public InvalidProductNameException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
