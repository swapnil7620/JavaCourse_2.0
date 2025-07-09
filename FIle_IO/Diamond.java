package com.FIle_IO;


//import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Diamond {

	public static void main(String[] args) throws IOException  {

				
		FileOutputStream FOUR = new FileOutputStream("ITP/output1.txt");
		String string ;
		string =("----Diamond Pattern---\n \n");
		 FOUR.write(string.getBytes());
		int k = 0, n;
		n = 10;
		int mid = (n + 1) / 2;
		for (int i = 1; i <= n; i++) {
			if (i <= mid) {
				k++;
			} else {
				k--;
			}

//			for (int j = 1; j <= n; j++) {
//				if (j >= (mid + 1) - k && j <= (mid - 1) + k) {
//					if (i % 2 == 0) {
//						System.out.print(" *");  
//				      	string	= " *";
//			            FOUR.write(string.getBytes());
//			           
//					} else {
//						 System.out.print(" *");
//						  string = " *";
//				            FOUR.write(string.getBytes());
//					}
//				} else {
//					 System.out.print("  "); 
//					 string ="  ";
//					 FOUR.write(string.getBytes());
//				}
//			}
//				
//		     	System.out.println();
//			    string ="\n";
//			    FOUR.write(string.getBytes());
			
			
			
			for (int j = 1; j <= n; j++) {
                if (j >= (mid + 1) - k && j <= (mid - 1) + k) {
                    string = " *";
                    System.out.print(string);
                    FOUR.write(string.getBytes());
                } else {
                    string = "  ";
                    System.out.print(string);
                    FOUR.write(string.getBytes());
                }
            }

            System.out.println();
            FOUR.write("\n".getBytes()); 
        }
		FOUR.close();

	}

	}
	
