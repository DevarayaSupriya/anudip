package com.exe;
//Define a class for calculating factorial
public class Factorial {

//Synchronized method to calculate and print factorial
static synchronized void printFactorial(int number) {
 int fact = 1;
 for (int i = 1; i <= number; i++) {
     try {
         Thread.sleep(500); // Simulate some processing time
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     fact = fact * i;
 }
 System.out.println("Factorial of " + number + " is: " + fact);
}
}

//Define a thread class to print factorial
class FactorialThread extends Thread {
Factorial factorial;

//Constructor to initialize with a Factorial object
public FactorialThread(Factorial factorial) {
 super();
 this.factorial = factorial;
}

//Overriding the run method of Thread class
public void run() {
 factorial.printFactorial(4);
}

public static void main(String[] args) {
 Factorial f = new Factorial();

 // Create two instances of FactorialThread threads, both using the same Factorial object
 FactorialThread ft1 = new FactorialThread(f);
 FactorialThread ft2 = new FactorialThread(f);

 ft1.start();
 ft2.start();
}
}