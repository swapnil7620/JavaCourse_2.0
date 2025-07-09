package com.Multithreading;

public class MyThread extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println(" i = " + i);
			try {
				MyThread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());

		}

}	}

