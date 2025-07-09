package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) {
	
		
		
		File file = new File("ITP/output.txt");
		
		try {
				
			File  dir = new File("ITP");
			if (!dir.exists()) {
				dir.mkdir();
				System.out.println("Folder has been created....");
				
			}
			if(file.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("Folder is alreday exist");
			}
			
			
			if (file.exists()) {
				System.out.println("file is open.....");
				
				System.out.println("The file name: " +file.getName());
				System.out.println("The  directory name : " +dir.getName());
				
				System.out.println("FilePath : " + file.getPath());
				System.out.println("The absolute path : "+file.getAbsolutePath());
				System.out.println("File Length  : "+file.length());
				System.out.println("is file :  " + file.isFile());
				System.out.println("is Directory :  "+file.isDirectory());
				System.out.println("The can create :   " + file.canRead());
				System.out.println("The can Write :   " + file.canWrite());
			

				
				
			}
			
			
//			if(file.delete()) {
//				System.out.println("file is deleted");
//			}
		} 
		
		
		catch (IOException e) {
			 e.printStackTrace();
		}
		
	}

}
