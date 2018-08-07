package com.day2.training;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeOfArray = scan.nextInt();
		int[] array = new int[sizeOfArray];
		int numberOfDuplicates = 0;
		int finalIndex=0;
		
		//Inserting elements
		for(int i=0; i<sizeOfArray; i++) {
			array[i] = scan.nextInt();
		}
		
		//Finding number of duplicates
		for(int i=0; i<sizeOfArray; i++){
			for(int j=i+1; j<sizeOfArray; j++) {
				if(array[i]==array[j]) {
					numberOfDuplicates++;
				}
			}
			System.out.print("..." + array[i]);
			if(numberOfDuplicates==1) {
				i+=1;
			}
			numberOfDuplicates=0;
		}
		
		//Moving Duplicates in new array
//		int[] finalArray = new int[numberOfDuplicates];
//		numberOfDuplicates = 0;
//		for(int i=0; i<sizeOfArray; i++){
//			for(int j=i+1; j<sizeOfArray; j++) {
//				if(array[i]==array[j]) {
//					numberOfDuplicates++;
//				}
//			}
//			if(numberOfDuplicates!=1) {
//				finalArray[finalIndex] = array[i];
//				finalIndex++;
//			}
//			else if(numberOfDuplicates==1) {
//				i+=1;
//			}
//			numberOfDuplicates=0;
//		}
		
//		for(int e:finalArray) {
//			System.out.print(e + "...");
//		}
//		
	}
}
