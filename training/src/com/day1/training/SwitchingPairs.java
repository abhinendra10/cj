package com.day1.training;

public class SwitchingPairs {
	public static void main(String[] args) {
		String s = "prolifics";
		char[] array = s.toCharArray();
		char counter;
		for(int i=0; i<array.length-1; i+=2) {
			counter = array[i];
			array[i] = array[i+1];
			array[i+1] = counter;
		}
		System.out.println(array);
	}
}
