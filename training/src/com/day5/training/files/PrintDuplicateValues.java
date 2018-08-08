package com.day5.training.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class PrintDuplicateValues {

	public static void main(String[] args) throws Exception {
		File fileOriginal = new File("original.txt");
		File fileModified = new File("onlyduplicate.txt");

		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileOriginal));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileModified));

		HashSet<String> set2 = new HashSet();
		ArrayList<String> list = new ArrayList<>();
		
		String line;

		while((line=bufferedReader.readLine())!=null) {
			list.add(line);
		}
		
		for(String s:list) {
			if(!set2.add(s)) {
				bufferedWriter.write(s);
				bufferedWriter.newLine();
				
			}
		}
		
		bufferedReader.close();
		bufferedWriter.close();
	}

}
