package org.vleantech.java.step21abstraction;

public interface Loveable {
	void makesCuteSounds();

	default void cuddles() {
		System.out.println("Cuddles and sleeps near you... You will feel so happy and warm");
	}

	void doesNotHarm();
}
