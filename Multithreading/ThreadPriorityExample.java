package com.Multithreading;

public class ThreadPriorityExample {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out
						.println("Thraed : 1 is running with the priority : = " + Thread.currentThread().getPriority());
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out
						.println("Thraed : 2 is running with the priority : = " + Thread.currentThread().getPriority());
			}
		});
		
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.MAX_PRIORITY); // 10 
		t1.start();
		t2.start();

		System.out.println("The priority of the main Thraed is : = "+Thread.currentThread().getPriority());
	}

}
