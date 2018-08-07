package com.day2.training;

import java.util.Scanner;

public class FirstRepeating {
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
			if(array[i]==array[i+1]) {
				System.out.println(array[i] + " is the first repeating element.");
				System.exit(0);
			}
			else 
				flag++;
		}
		if(flag>0) {
			System.out.println("No repeating element in the array found");
		}
	}
}
