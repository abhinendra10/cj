package com.day1.training;

public class RemovingAlternateCharacters {
	public static void main(String[] args) {
		String s = "prolifics";
		char[] array = s.toCharArray();
		for(int i=0; i<array.length; i++) {
			if(i%2==0) {
				System.out.print(array[i]);
			}
		}
	}
}
