package com.voterapp.exceptions;

import com.voterapp.service.NotEligibleException;

public class UnderAgeException extends NotEligibleException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnderAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
