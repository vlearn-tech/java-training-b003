package org.vleantech.java.step99practiceprograms;

import java.util.Random;

public class NextNumber {

	public static int addition(int num) {
		Random random = new Random();
		return num + 1 + random.nextInt(100);
	}

	public static void main(String[] args) {
		System.out.println(addition(-3));
	}
}
