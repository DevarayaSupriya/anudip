package com.exe;
public class FactorialNumber  {
	int number;
	 // Method to compute factorial of a number
public synchronized void factorial(int n) {
	//Store the number in the variable
	this.number=n;
	int factorial = 1;
	 for (int i = 1; i <= number; i++) {
		// Calculate factorial
		 factorial*=i;
     }
	// Print the result in a synchronized block
     System.out.println("Factorial of " + number + " is: "+factorial  );
}
	
	public static void main(String[] args) {
FactorialNumber f=new FactorialNumber();
// Create a new thread to calculate factorial
Thread t1 = new Thread() {
	public void run() {
		// Compute factorial of 7
		 f.factorial(7);
	}
};
//Start the thread
 t1.start();

	};
	
}

