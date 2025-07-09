package com.FIle_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIODemo {


	public static void main(String[] args) throws IOException {
	
		/*	  
		  Stream -: 
		  
		  1) character 
		  2) bytes
		  Reader , Writer
		  	  
		 */
		
		// 1) HM Count the total word from file
		// 2) count the occurrence of particular word from file
		 // 3) print the diamond pattern into file
		
//		FileWriter fileWriter = new FileWriter("ITP.output.txt");
//		fileWriter.write("This is line from .java file");
//		fileWriter.append("FileIODemo");
//		System.out.println("Your data has been printed");
//		fileWriter.close();
		
//		FileInputStream fInputStream = new FileInputStream("ITP/output.txt");
		FileOutputStream FOUR = new FileOutputStream("ITP/output.txt");
		
//		PrintWriter printWriter = new PrintWriter("ouput.txt");
//		printWriter.
//		
		
		int i, num, n, count;
		System.out.println("Enter the range: ");
		n = 100;
		System.out.println("After Enter the range: " + 50);

		System.out.println("The prime numbers in between the range 1 to  " + n);
		for (num = 1; num <= n; num++) {
			count = 0;
			for (i = 2; i <= num /2 ; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
//				System.out.print(num+ ",");
				String string = Integer.toString(num) + ", ";
	            FOUR.write(string.getBytes());
	           
	      
                System.out.print(num + " ");
		
			
			}
			
          
			
		}
		      
		FOUR.close(); 
		}
		
		
		
		 
		
		
		
	}


