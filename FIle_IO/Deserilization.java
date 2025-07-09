package com.FIle_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class  Deserilization {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ITP/Demo.txt"));
			
		Student s= (Student) objectInputStream.readObject();
		
		System.out.println("---------Data-----------");
		
		System.out.println("ID : "+ s.id);
		System.out.println("Name : "+ s.Name);
		objectInputStream.close();
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
