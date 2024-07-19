package com.exe;

import java.util.Scanner;

public class StudentEnrollApp {
	//we enroll the student if income is less than they 50000 and they must complete the degree
	void enroll(int income,String status) throws Exception {
		
		
		if(income>50000)
			throw new ConditionNotSatisfiedException ("Condition not Satisfied");
		else if(status.equalsIgnoreCase("no"))
			throw new ConditionNotSatisfiedException ("Condition not Satisfied");
		System.out.println("Student Enrolled into the Batch");
	}


	public static void main(String[] args ) throws Exception {
		Scanner sc=new Scanner(System.in);
		StudentEnrollApp stu=new StudentEnrollApp();
		System.out.println("Enter Annual income:");
		int income=sc.nextInt();
		System.out.println("Is your Degree completed:yes/no");
		String status=sc.next();
		try {
		stu.enroll(income,status);
		}catch(ConditionNotSatisfiedException e) {
			System.out.println("You are  not Eligible for Enrollment");
		}
	}
	
}
