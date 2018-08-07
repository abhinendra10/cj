package com.day2.training;

import java.util.Scanner;

public class CheckingDuplicateValuesInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeOfArray = scan.nextInt();
		int[]  numArray = new int[sizeOfArray];
		int flag = 0;
		for(int i=0; i<sizeOfArray; i++) {
			numArray[i] = scan.nextInt();
		}
		
		scan.close();
		
		for(int i=0; i<sizeOfArray; i++){
			for(int j=i+1; j<sizeOfArray; j++) {
				if(numArray[i]==numArray[j]) {
					flag++;
				}
			}
			if(flag>0) {
				System.out.println(numArray[i] + " is repeated.");
				flag = 0;
			}
		}
		
	}
}
