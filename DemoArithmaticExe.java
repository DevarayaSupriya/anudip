package com.exe;

public class DemoArithmaticExe {

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 10;
		System.out.println("start  of the pgm");
		// Attempting to perform arithmetic operation
		try {
			c = a / b;

			System.out.println("c=" + c);
//System.out.println("End of the pgm");
			// Accessing an element outside the bounds of the array
			int arr[] = { 1, 2, 3 };
			System.out.println(arr[4]);
			// Catch block for ArithmeticException
		} 
		catch (ArithmeticException ae) {
			System.out.println("Exception caught");
			// Catch block for ArrayIndexOutOfBoundsException
		} 
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Exception caugth");

		}
		// Finally block always executes
		finally {
			System.out.println("End of the pgm");
		}

	}
}
