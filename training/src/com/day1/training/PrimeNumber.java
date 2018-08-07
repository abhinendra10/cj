package com.day1.training;

public class PrimeNumber {
	public static void main(String[] args) {
		int i,j,count = 0;
		for(i=2; i<1000; i++) {
			for(j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
			count = 0;
		}
	}
}
