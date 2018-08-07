package com.day1.training;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.next();
		scan.close();
		if(password.length()>=8 && password.length()<=16){
		       boolean valid = true;
               String upperCaseChars = "(.*[A-Z].*)";
               if (!password.matches(upperCaseChars ))
               {
                       valid = false;
               }
               String lowerCaseChars = "(.*[a-z].*)";
               if (!password.matches(lowerCaseChars ))
               {
                       valid = false;
               }
               String numbers = "(.*[0-9].*)";
               if (!password.matches(numbers ))
               {
                       valid = false;
               }
               String specialChars = "(.*[!,@,#,$,%,^,&,*,(,)].*)";
               if (!password.matches(specialChars ))
               {
                       valid = false;
               }
               if (valid)
               {
                       System.out.println("Password is valid.");
               }
		}
		else 
			System.out.println("Password should contain atleast 8 Characters");
	}
}
