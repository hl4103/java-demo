package com.hlql.exception;

public class myException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
	private double amount;

	public myException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
