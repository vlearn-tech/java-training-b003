package org.vlearntech.java.step22multithreading;

public class ParallelProcessingWithLambda {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> executeTheTask(1));
		Thread t2 = new Thread(() -> executeTheTask(2));
		Thread t3 = new Thread(() -> executeTheTask(3));

		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();

		t2.join();
		t3.start();
	}

	private static void executeTheTask(int taskNumber) {
		System.out.println("\nTask " + taskNumber + " Started");

		for (int i = 100 * taskNumber; i < 100 * (1 + taskNumber); i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nTask " + taskNumber + " Completed");
	}

}
