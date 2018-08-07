package com.day2.training;

import java.util.Arrays;

public class MergeNSort {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,5,6,6};
		int[] array2 = {4,5};
		int[] finalArray = new int[array1.length+array2.length];
		
		for(int i=0; i<finalArray.length;) {
			for(int e:array1) {
				finalArray[i]=e;
				i++;
			}
			for(int e:array2) {
				finalArray[i]=e;
				i++;
			}
		}
		System.out.println("Before sorting of merged array:");
		for(int e:finalArray)
			System.out.print(e + ",");
			
		Arrays.sort(finalArray);
		
		System.out.println("\nAfter sorting of merged array:");

			
		for(int e:finalArray)
				System.out.print(e + ",");
	}
}
