package com.day1.training;

public class SumOfEnds {
	public static void main(String[] args) {
		int startPoint = 100;
		int endPoint = 999;
		for(int i = startPoint; i<=endPoint; i++) {
			if((i%10)+(i/100)==(i/10)%10) {
				System.out.println(i);
			}
		}
	}
}
