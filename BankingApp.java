package com.exe;

public class BankingApp {
int accountNo;
int balance;

public BankingApp(int accountNo, int balance) {
	super();
	this.accountNo = accountNo;
	this.balance = balance;
}
//for depositing amt to the Account
void deposit(int amt) {
	balance+=amt;
	System.out.println(" Deposited:"+amt);
	System.out.println("Now Balance: " + balance);
}
//for withdrawing amount
void withdraw(int amt) throws InsufficientBalanceException {
	if(balance<=amt) {
		balance-=amt;
		System.out.println("Withdrawn: " + amt);
		System.out.println("Now Balance: " + balance);
	}
	else
		 accountNo = amt - balance;
	// If withdrawal amount exceeds balance, throw InsufficientBalanceException
		throw new InsufficientBalanceException("Insufficient Balance Cannot withdraw " + amt);
}
	public static void main(String[] args) {
		BankingApp b=new BankingApp(3216532,10000);
		// Depositing 5000
b.deposit(5000);
try {
	b.withdraw(18000);
	// Attempting to withdraw 18000
	
}
catch(InsufficientBalanceException e) {
	System.out.println("Exception caught: " + e.getMessage());
}
	}

}
