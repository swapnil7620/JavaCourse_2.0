package com.FIle_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Counting {

	public static void main(String[] args) throws IOException {
		int count =0;
	      File file = new File("ITP/output.txt");
	      FileInputStream fis = new FileInputStream(file);
	      
	      byte[] bytesArray = new byte[(int)file.length()];
	      
	      fis.read(bytesArray);
	      String s = new String(bytesArray);
//	      String [] data = s.split(" ");

	    
	      
	     for (int i = 0; i < s.length(); i++) {
	    	 
	    		// 1) HM Count the total word from file
	         if ( (s.charAt(i)!= ' ' && (s.charAt(i)!=','))) {
	        	 count++;
				
			}
			
	     //  2) count the occurrence of particular word from file
//	    	 if(s.charAt(i)=='a') {
//	    		 count++;
//
//	    	 }
	    	 
	    
		}     
	      System.out.println("Number of characters in the given file are " +count);
		
	      fis.close();
	}

}
