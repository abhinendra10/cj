package com.day1.training;

public class RepetativeCharacterCount {
	public static void main(String[] args) {
		String s = "chinna";
		char[] array = s.toCharArray();
		int i,j, count=1;
		for(i=0; i<array.length; i++) {
			for(j=i+1; j<array.length; j++) {
				if(array[i]==array[j]) {
					count++;
					System.out.println(array[i] + " is repeated " + count + " times");
					count = 1;
				}
			}
		}
	}
}
