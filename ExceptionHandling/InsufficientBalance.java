package com.ExceptionHandling;

public class InsufficientBalance extends Exception
{
	public InsufficientBalance(String msg)
	{
		super(msg);   
	}
}