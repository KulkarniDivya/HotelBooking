package com.cg.hra.utility;

public class InvalidMobileNoException extends Exception {
	public InvalidMobileNoException()
	{
		System.out.println("Length of Mobile Number should be 10");
	}
}
