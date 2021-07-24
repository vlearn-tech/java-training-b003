package org.vlearntech.java.step19polymorphism;

public class AreaOfTriangle {
	// Equilateral
	public static Double areaOfTriangle(Integer side) {
		return Math.pow(side, 2) * Math.pow(3, 0.5) / 4;
	}

	// Right Angled
	public static Double areaOfTriangle(Integer base, Integer height) {
		return 0.5 * base * height;
	}

	// Scalene
	public static Double areaOfTriangle(Integer side1, Integer side2, Integer side3) {
		Double semiPerimeter = 0.5 * (side1 + side2 + side3);
		return Math.pow(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3),
				0.5);
	}

	public static void main(String[] args) {
		System.out.println("Area of triangle is : " + areaOfTriangle(10));
		System.out.println("Area of triangle is : " + areaOfTriangle(10, 10));
		System.out.println("Area of triangle is : " + areaOfTriangle(10, 15, 20));

	}

}
