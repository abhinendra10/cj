package com.day1.training;

public class ReverseArray {
	
	public static void main(String[] args) {
		String s = "prolifics";
		char array[] = s.toCharArray();
		char counter;
		int length = array.length;
		
		for(int i=0; i<length/2; i++) {
			counter = array[i];
			array[i] = array[length-i-1];
			array[length-i-1] = counter;
		}
		System.out.println(array);
	}

}
