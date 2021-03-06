package com.day5.training.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DeleteDuplicateInFile {
	public static void main(String[] args) throws Exception {
		File fileOriginal = new File("original.txt");
		File fileModified = new File("modified.txt");

		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileOriginal));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileModified));

		HashSet<String> set = new HashSet();
		String line;

		while((line=bufferedReader.readLine())!=null) {
			set.add(line);
		}
		for(String e:set) {
			bufferedWriter.write(e);
			bufferedWriter.newLine();
		}
		
		
		bufferedReader.close();
		bufferedWriter.close();
	}
}
