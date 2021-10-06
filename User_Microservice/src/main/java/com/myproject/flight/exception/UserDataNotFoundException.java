package com.myproject.flight.exception;

public class UserDataNotFoundException extends Exception {
	
	public UserDataNotFoundException() {
	}

	public UserDataNotFoundException(String s) {
		super(s);
	}

	public UserDataNotFoundException(Exception e) {
		super(e);
	}

	public UserDataNotFoundException(String s, Exception e) {
		super(s, e);
	}

}
