package com.day1.training;

public class ProlificsPatternStar {

	public static void main(String[] args) {
		String s = "prolifics";
		char[] array = s.toCharArray();
		int length = array.length;
		int i,j,count=0,starCount=1;
		for(i=0; i<length; i++) {
			for(j=0; j<length; j++) {
				if(i!=j) {
					System.out.print("*");
				}
				else{
				System.out.print(array[count]);
				count++;
				}
			}
			System.out.println();
			for(int k=0; k<length; k++) {
				if(starCount<length)
				System.out.print("*");
				
			}
			++starCount;
			System.out.println();
		}
	}
}
