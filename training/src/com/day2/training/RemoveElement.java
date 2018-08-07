package com.day2.training;

import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeOfArray = scan.nextInt();
		int[] array = new int[sizeOfArray];
		int[] finalArray = new int[sizeOfArray-1];
		int number;
		int flag=0;
		for(int i=0; i<sizeOfArray; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("Enter the element you want to remove: ");
		number = scan.nextInt();
		
		for(int i=0; i<sizeOfArray; i++) {
			if(array[i]==number) {
				flag++;
				array[i]=-1;
			}
		}
		if(flag==0) {
			System.out.println("Number not in the array");
		}
		else {
			int j=0;
			for(int i=0; i<sizeOfArray; i++) {
				
				if(array[i]>0) {
					finalArray[j] = array[i];
					j++;
				}
				
			}
		}
		System.out.println("Array after deletion is ");
		for(int e:finalArray) {
			System.out.println(e);
		}
	}
}
