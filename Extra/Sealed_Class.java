package com.Extra;

/*------------ Sealed Class------------ */ 

// Use in design application  
// sealed class are use to  permit some child class to  extends its property

sealed class Parent permits Chiled1, Chiled2 {

	public void M1() {
		System.out.println("Method one from Parent class");
	}
}

// Child class  those have permits must be extends parent class //
// child class must be declare with sealed , non-sealed , final
// non sealed means any on can access 

non-sealed class Chiled1 extends Parent {
	public void M1() {
		System.out.println("Method one from child1 class");
	}
}

//  non other class can extends

final class Chiled2 extends Parent {
	public void M4() {
		System.out.println("Method one from child2 class no other class can inherite");
	}
}

class Chiled3 extends Chiled1 {

}

// Interface either can be sealed or non- sealed because they cannot be final


sealed interface X permits Y {
	
	public void m2();

}

non-sealed interface Y extends X {
	
	 default void m2() {
		System.out.println("m2 from Interface Y");

	}

	default  void m3() {
		System.out.println("m3 From interface z");
	}
	
	public void M5();
}

final class Chiled4 implements Y  {

	@Override
	public void M5() {
		System.out.println("M5 from Chiled4 class");
		
	}
	
	
}

public class Sealed_Class  {

	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.M1();

		Chiled1 child1 = new Chiled1();
		child1.M1();

		Chiled2 chiled2 = new Chiled2();
		chiled2.M4();

		Chiled3 chiled3 = new Chiled3();
		chiled3.M1();
				
		Chiled4  chiled4 = new Chiled4();
	     
	    chiled4.m2();
	    chiled4.m3();
	    chiled4.M5();
	  
		
		

	}

}
