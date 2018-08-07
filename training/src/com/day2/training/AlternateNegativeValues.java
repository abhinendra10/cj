package com.day2.training;

public class AlternateNegativeValues {
	public static void main(String[] args) {
		int[] array = {2,4,5,6,5,3,5};
		for(int e:array) {
			System.out.print(e+ ",");
		}
		for(int i=0; i<array.length; i++) {
			if(i%2!=0) {
				array[i] -= 2*array[i]; 
			}
		}
		System.out.println();
		for(int e:array) {
			System.out.print(e + ",");
		}
	}
}
