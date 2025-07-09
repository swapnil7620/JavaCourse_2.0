package com.Multithreading;

//static synchronized  
//common resource

class Table implements Runnable {
	synchronized  public void tablePrinting(int n) { // method synchronization  // we can make  synchronize class by using static keyword to method 

//	synchronized (this)	{ // block synchronization
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(n + "*" + i + "=" + (n * i));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}