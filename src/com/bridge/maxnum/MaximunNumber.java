package com.bridge.maxnum;

/***********************************
 * Given three integer to find maximum number using generic class and method
 * 
 * @author Sangeeta Math
 *
 * @param <T>
 ************************************/

public class MaximunNumber<T> {

	public static <T> void printMax(T a, T b, T c, T max) {
		System.out.println("First Number=>" + a);
		System.out.println("Sec Number=>" + b);
		System.out.println("Thrird Number=>" + c);
		System.out.println("Maximum Value is=>" + max);

	}

	/*
	 * UC1-Find max number among three integer value
	 */
	public static Integer testMaxInteger(Integer a, Integer b, Integer c) {
		Integer max = a;// assume x is initially largest
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		printMax(a, b, c, max);
		return max;

	}

	/*
	 * UC2-Find max number among three double value
	 */
	public static Double testMaxDouble(Double a, Double b, Double c) {
		Double max = a;// assume x is initially largest
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		printMax(a, b, c, max);
		return max;

	}

	public static <T> void main(String[] args) {
		System.out.println(testMaxInteger(90, 20, 10));
		System.out.println();
		System.out.println(testMaxInteger(94, 27, 19));
		System.out.println();
		System.out.println(testMaxInteger(8, 45, 16));
		System.out.println();
		System.out.println(testMaxDouble(90.5, 20.6, 10.7));
		System.out.println();
		System.out.println(testMaxDouble(94.3, 27.4, 19.2));
		System.out.println();
		System.out.println(testMaxDouble(8.9, 45.7, 16.3));
		System.out.println();
	}
}
