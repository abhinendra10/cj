package com.day3.training;

public class HiHello {
	public static void main(String[] args) {
		Hi hi = new Hi();
		Hello hello = new Hello();
		
		Thread hiThread = new Thread(hi);
		Thread helloThread = new Thread(hello);
		
		hiThread.start();
		helloThread.start();
		
		
	}

}

class Hi implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Hiii!!!");
			try{Thread.sleep(5000);} catch(Exception e) {}
		}
	}
	
}


class Hello implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++)
		System.out.println("Helloo!!!");
	}
	
}
