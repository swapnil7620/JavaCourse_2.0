package com.Multithreading;


public class ThreadDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
//		MyThread MT =new MyThread();
//		MyThread MT1 =new MyThread();
//		MT.start();
//		MT1.start();
//		MT.Run(); // Not recommended  because its behave like normal method


		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setName("CustomThread-1");
		t1.setPriority(10);
		t1.start();
		t2.setName("CustomThread-2");
		t2.setPriority(6);
		t2.start();
		t3.setName("CustomThread-3");
		t3.setPriority(2);
		t3.start();
		
		
		
		System.out.println("------------------------ ");
	
		System.out.println("------------------------ ");
		
		
//		System.out.println("This is the main thread ...! ");
		
		
		
		
		
	}

}
