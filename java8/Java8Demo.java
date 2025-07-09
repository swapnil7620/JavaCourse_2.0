package com.java8;



interface Printer{
	
	void print();
}

interface Addition{
	 int add(int a,int b);
}


interface Reverse{
	 String reverse(String s);
}
public class Java8Demo {
	
	
	public static void main(String[] args) {
		
		// An interface that has only one abstract method is called a functional interface." 
		
		/// for Printer interface
		Printer printer = () ->System.out.println("This is method of Printer Interface");
		printer.print();
		
		// for addition interface
		Addition addition = (a,b) ->a + b;
		int sum = addition.add(100, 200);
		System.out.println("The addition of a and b : " +sum);
		
		// Reverse string
		
		Reverse sr =(s) ->{
			String r ="";
		   for (int i = s.length() -1 ; i>= 0; i--) {
			   r +=s.charAt(i);
			
		}
			return r;
			
		};
		
		String rev = sr.reverse("Lamda");
		System.out.println("reverse String is : " + rev);
		
	}
	

}
