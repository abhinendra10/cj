package com.day5.training.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

public class ValidPhoneNumberInFiles {
	
	public static void main(String[] args) throws Exception {
		
		File phnList = new File("phoneNumbers.txt");
		File validPhnNo = new File("validPhn.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader(phnList));
		BufferedWriter writer = new BufferedWriter(new FileWriter(validPhnNo));
		
		String line;
		
		
		
		while((line=reader.readLine())!=null) {
			if(Pattern.matches("[789][0-9]{9}", line)) {
				
				System.out.println(line);
				writer.write(line);
				writer.newLine();
			}
		}
		
		reader.close();
		writer.close();
	}

}
