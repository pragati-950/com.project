package com.example.demo.exception;

public class CustomerException extends Exception{
	private String msg;
	public CustomerException(String msg) {
		super(msg);
	}

}
