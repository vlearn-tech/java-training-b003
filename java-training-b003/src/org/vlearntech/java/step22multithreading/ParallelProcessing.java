package org.vlearntech.java.step22multithreading;

public class ParallelProcessing {
	public static void main(String[] args) throws InterruptedException {
		ThreadedTask t1 = new ThreadedTask(1); // Employee Header
		RunnableTask rt2 = new RunnableTask(); // Department
		Thread t2 = new Thread(rt2);
		ThreadedTask t3 = new ThreadedTask(3); // Employee History

		t1.setPriority(Thread.MAX_PRIORITY); // Only an advice/request. May or may not be granted
		t2.setPriority(Thread.MIN_PRIORITY); // Only an advice/request. May or may not be granted
		t3.setPriority(Thread.NORM_PRIORITY); // Default.

		t1.start();
		t2.start();

		t1.join(); // T1 has to complete fully before we start t3
		t2.join();
		t3.start();

	}

}

class ThreadedTask extends Thread {

	int taskNumber;

	public ThreadedTask(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	@Override
	public void run() {
		executeTheTask();
	}

	void executeTheTask() {
		System.out.println("\nTask " + this.taskNumber + " Started");

		for (int i = 100 * taskNumber; i < 100 * (1 + taskNumber); i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nTask " + this.taskNumber + " Completed");
	}
}

class RunnableTask implements Runnable {

	@Override
	public void run() {
		executeTheTask();
	}

	void executeTheTask() {
		System.out.println("\nTask 2 Started");

		for (int i = 200; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nTask 2 Completed");
	}
}
