package com.day1.training;

public class ProlificsPattern {

	public static void main(String[] args) {
		
		String s = "prolifics";
		int length = s.length();
		int i,j,k;
		char array[] = s.toCharArray();
		for( i=0; i<length; i++) {
			for(j=0; j<=i; j++) {
				System.out.print(array[j]);
			}
			for(k=j; k<length; k++) {
				System.out.print("1");
			}
			System.out.println();
		}
		
	}
}
