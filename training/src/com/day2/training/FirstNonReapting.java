package com.day2.training;

import java.util.Scanner;

public class FirstNonReapting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeOfArray = scan.nextInt();
		int[] array = new int[sizeOfArray];
		int flag=0;
		
		//Inserting elements
		for(int i=0; i<sizeOfArray; i++) {
			array[i] = scan.nextInt();
		}
		
		scan.close();
		
		for(int i=0; i<sizeOfArray-1; i++) {
			if(array[i]!=array[i+1]) {
				flag++;
			}
			else
				++i;
			if(flag>0) {
				System.out.println(array[i]);
				break;
			}
		}
	}
}
