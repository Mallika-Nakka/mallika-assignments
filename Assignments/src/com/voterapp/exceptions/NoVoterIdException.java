package com.voterapp.exceptions;

import com.voterapp.service.NotEligibleException;

public class NoVoterIdException extends NotEligibleException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoVoterIdException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoVoterIdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}