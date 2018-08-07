package com.day2.training;

public class FindindMaxNMin {
	
	public static void main(String[] args) {
		int[] rotatedSortedArray = {4,5,1,2,3};
		int length = rotatedSortedArray.length;
		int max = rotatedSortedArray[0];
		int min = rotatedSortedArray[0];
		System.out.println(findMax(rotatedSortedArray, max));
	}
	
	static int findMax(int[] array, int max) {
		for(int i=0; i<array.length-1; i++) {
			if(array[i]>array[i+1]  ) {
				max = array[i];
			}
			else if(array[i]<array[i+1]) {
				max = array[i+1];
			}
		}
		return max;
	}

}
