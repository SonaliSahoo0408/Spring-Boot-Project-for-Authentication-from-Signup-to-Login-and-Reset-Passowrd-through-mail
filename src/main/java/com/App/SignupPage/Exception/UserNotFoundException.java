package com.App.SignupPage.Exception;

public class UserNotFoundException extends RuntimeException {
	private static final long SerialVersionUID = 1;

	public UserNotFoundException(String mesg) {
		super(mesg);
	}
}