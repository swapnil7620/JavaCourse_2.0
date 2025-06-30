package com.Inheritance.SuperAndProtected;

public class MathematicalOperations extends Operation{
	
//	private int result ;
	private int side ;
	
	public MathematicalOperations()
	{
//		this.result = 0 ;
		System.out.println("public MathematicalOperations()");
	}

	public void add()
	{
		System.out.println("the Addition is : = "+(super.a+super.b));
	}
	
	public MathematicalOperations(int side , int a , int b )
	{
		super(a,b);
		this.side = side ;
		System.out.println("public MathematicalOperations(int side , int a , int b )");
	}
	public void areaOfSquare()
	{
		System.out.println("The area of Square is : = "+side*side);
	}
}
