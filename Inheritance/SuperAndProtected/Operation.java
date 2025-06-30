package com.Inheritance.SuperAndProtected;

public class Operation {
	public int a , b ;

	public Operation()
	{
		this.a = 10 ;
		this.b = 10 ;		
		System.out.println("public Operation()");
	}
	
	public Operation(int a , int b )
	{
		this.a = a ;
		this.b = b ;
		System.out.println("public Operation(int , int )");		
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

}
