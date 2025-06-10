package com.OOPS;

import java.util.Scanner;

class Vechicle {

 private String Number;
private	String vechicleName;
private	int VechicelPrice;
private  String VechicelRTO ="Jalgaon";
	

	public void Accept( Scanner scanner) {
		
		System.out.println("Enter the Number_of_Vechicel ");
		Number = scanner.next();
		
		System.out.println("Enter the Vechile Name ");
		vechicleName = scanner.next();
		
		System.out.println("Enter the VechicelPrice  ");
		VechicelPrice = scanner.nextInt();

	}
	public void Display() {

		System.out.println("---------Details of Vechicle----- \n");
		System.out.println("Vechicle Number is : " + Number);
		System.out.println("Vechicle Name is : " + vechicleName);
		System.out.println("Vechicle Price is : " + VechicelPrice);
		System.out.println("Vechicle RTO is : " + VechicelRTO  +"\n");
	}
}
public class VechicleDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Vechicle v1Details = new Vechicle();
		Vechicle v2Details = new Vechicle();

		v1Details.Accept(scanner);
		v2Details.Accept(scanner);
		v1Details.Display();
		v2Details.Display();
	
	}

}

/*
 MH196368
Vechicle Name is : Mahindra_Maximo
Vechicle Price is : 3500000
Vechicle Number is : MH19DU0764
Vechicle Name is : Honda_Shine
Vechicle Price is : 100000
 * 

*/