package com.Multithreading;

class Thread1 extends Thread {

	Table table;

	public Thread1(Table table) {
		this.table = table;
	}

	public void run() {
		table.tablePrinting(19);

	}
}

class Thread2 extends Thread {
	Table table;

	public Thread2(Table table) {
		this.table = table;
	}

	public void run() {
		table.tablePrinting(12);

	}
}

class Thread3 extends Thread {
	Table table;

	public Thread3(Table table) {
		this.table = table;
	}

	public void run() {
		table.tablePrinting(10);
	}
}

public class Synchronization {

	public static void main(String[] args) {

		Table table = new Table();

		Thread1 thread1 = new Thread1(table);
		Thread2 thread2 = new Thread2(table);
		Thread3 thread3 = new Thread3(table);

		thread1.setPriority(2);
		thread2.setPriority(10);
		thread3.setPriority(8);

		thread1.start();
		try {

			thread1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		thread2.start();

		try {
			thread2.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		thread3.start();

		try {

			thread3.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("This is the main thread ...! ");

	}

}
