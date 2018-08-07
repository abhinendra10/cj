package com.day5.training;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaIdentifierValidation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int count = 0;
		scan.close();
		
		String[] keywords = {"abstract" ,"boolean", "break", "byte", "case", "catch", "char", "class", "continue",
							"defaullt", "do", "double", "else", "enum", "extends", "final", "finally", "float",
							"for", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", 
							"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
							"super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void",
							"volatile", "while", "true", "null", "false"};

		if(Pattern.matches("[a-zA-Z$_]+[a-zA-Z0-9$_]*", input)) {
			for(String s:keywords) {
				if(input.equals(s)) {
					System.out.println("Invalid identifier");
					count++;
				}
			}
			if(count==0) {
				System.out.println("Identifier accepted");
			}
		}
		
		else {
			System.out.println("Invalid identifier");
		}
	}
}
