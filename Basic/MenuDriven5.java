package com.Basic;

public class MenuDriven5 {

	public static void main(String[] args) {
		    float pi = 3.141f;
		   int choice , Radius , Square , Length , breath , Area_Of_Recangle , Area_Of_Square ;
		   float Area_Of_Circle;
		   

		   System.out.println("-------------Menu------------\n");
		   System.out.println(" 1) to calculate the radius of circle\n");
		   System.out.println(" 2) to calculate the radius of rectangle\n");
		   System.out.println(" 3) to calculate the radius of square\n");
		   System.out.println("Enter the Choice\n");
		   choice = 2;

		   if (choice == 1)
		   {
			   System.out.println("Enter the value of radius\n");
		      Radius = 5;
		      System.out.println("After Entering the Number "+ 5);
		      Radius = Radius * Radius;
		      Area_Of_Circle = pi * Radius;
		      System.out.println("Area of Circle is = "+ Area_Of_Circle);
		   }
		   else if (choice == 2)
		   {
			   System.out.println("Enter the Length and breath\n");
		     Length = 10;
		     breath = 20;
		      Area_Of_Recangle = Length * breath;
		      System.out.println("After Entering Length = "+ 10 + " , Breath = "+20 );
		      System.out.println("\n Area of Rectangle is = "+ Area_Of_Recangle);
		   }

		   else if (choice == 3)
		   {

			   System.out.println("\n Enter the Value to calculate square \n  ");
		      Square = 5;
		      System.out.println("After Entering the Square = "+ 5);
		      Area_Of_Square = Square * Square;
		      System.out.println("\nArea_of_Square = "+ Area_Of_Square);

		   }
		   else
		   {
			   System.out.println("Invalid choice");
		   }


	}

}
