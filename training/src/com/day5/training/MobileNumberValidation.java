package com.day5.training;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumberValidation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		scan.close();
		if(Pattern.matches("[789][0-9]{9}", number)) {
			System.out.println("Phone number accepted.");
		}
		else {
			System.out.println("Invalid Number.");
		}
	}
}
