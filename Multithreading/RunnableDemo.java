package com.Multithreading;

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		
//		RunnableInterface RI = new RunnableInterface();
//		Thread t1 = new Thread(RI);
//		t1.start();
		
		
		  RunnableInterface r1 = new RunnableInterface();
		  RunnableInterface r2 = new RunnableInterface();
		  
		 
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.setName("MyThread-1");
		t2.setName("MyThread-2");
		
		t1.start();
		System.out.println("-----------");
		t2.start();
		
//		System.out.println(" Main Thread is completed its execution ...! ");

	}

}
