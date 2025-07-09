package com.FIle_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.nio.file.FileSystemAlreadyExistsException;

public class Serialization {


	public static void main(String[] args) {
		
		
		// serialization 
		Student student = new Student();
		try {
			ObjectOutputStream oopStream = new ObjectOutputStream(
					new FileOutputStream("ITP/Demo.txt"));		
			oopStream.writeObject(student);
			System.out.println("Data is Serailized");
			oopStream.close();			
			
		}
			catch (FileSystemAlreadyExistsException e) {
				
				
			}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
