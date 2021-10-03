package com.cogent.productmanagement.exception;

import lombok.ToString;

@ToString
public class InvalidProductIdException extends Exception{

	public InvalidProductIdException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
