package com.ClassesAndObjects;



class Sample{
	int b;
	 final public int a;
		{
			
			a= 10;
			b=a;
			b= 20;
		}
}
public class FinalKeyword {
	

	public static void main(String[] args) {
   Sample sample = new Sample();
   System.out.println("a Value : " +sample.a);
   System.out.println("a Value : " +sample.b);
		
	}

}
