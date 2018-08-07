package com.day3.training;

public class ThreeTasks {
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		new Thread(primeNumber).start();
//		Thread thread1 = new Thread(primeNumber);
//		thread1.start();
		Factorial factorial = new Factorial();
		Thread thread2 = new Thread(factorial);
		thread2.start();
	}
}

class PrimeNumber implements Runnable{

	@Override
	public void run() {
		int i,j,count = 0;
		for(i=2; i<100; i++) {
			for(j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i + " is prime");
			}
			count = 0;
			if(i==7) {
				try{new PrimeNumber().wait();} catch(Exception e) {}
			}
		}
	}
	
}

class AmstrongNumber implements Runnable{

	@Override
	public void run() {
	}
	
}

class Factorial implements Runnable{

	@Override
	public void run() {
		long  fact=1;
		for(int i=1; i<10; i++) {
			for(int j=i; j>1; j--) {
				fact *= j;
			}
			System.out.println(i + " factorial is: " + fact);
		}
		new Factorial().notifyAll();
	}
	
}
