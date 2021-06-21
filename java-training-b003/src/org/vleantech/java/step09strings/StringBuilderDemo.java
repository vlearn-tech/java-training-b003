package org.vleantech.java.step09strings;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String message = " Hello";
		System.out.println("#" + message.trim() + "#");

		StringBuilder sb = new StringBuilder(message);
		sb.append(" ").append("world  ");

		System.out.println("#" + sb.toString().trim() + "#");
	}
}