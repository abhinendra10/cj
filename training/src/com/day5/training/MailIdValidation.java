package com.day5.training;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MailIdValidation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mailId = scan.next();
		scan.close();
		
		if(Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9_.]+@[a-zA-Z0-9]+([.][a-zA-Z]+)+", mailId)) {
			System.out.println("Email Id accepted");
		}
		
		else {
			System.out.println("Invalid Email Id");
		}
		
	}
}
