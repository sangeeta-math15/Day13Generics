package com.bridge.maxnum;

/***********************************
 * Given three integer to find maximum number using generic class and method
 * 
 * @author Sangeeta Math
 *
 * @param <T>
 ************************************/

public class MaximunNumber {
	public static <T> void printMax(T a, T b, T c, T max) {
		System.out.println("First Number=>" + a);
		System.out.println("Sec Number=>" + b);
		System.out.println("Three Number=>" + c);
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

	public static void main(String[] args) {
		System.out.println("Welcome to Maximum Problem using Generics");
		System.out.println();
		System.out.println(testMaxInteger(90, 20, 10));
		System.out.println();
		System.out.println(testMaxInteger(27, 94, 19));
		System.out.println();
		System.out.println(testMaxInteger(8, 16, 45));

	}
}
