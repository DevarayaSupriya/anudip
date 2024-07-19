package com.exe;

public class TraficSignal {

	public static void main(String[] args) {
Signals sig=new Signals();
Thread t=new Thread() {
	 public void run() {
		try {
			sig.green("red");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
};
t.start();
Thread t2=new Thread() {
	 public void run() {
		
			sig.red("green");
		
	}
};
t2.start();
	}

}
