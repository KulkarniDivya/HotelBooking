package com.cg.hra.utility;

public class BookedException extends Exception {
	public BookedException()
	{
		System.out.println("Room is already booked");
	}
}
