package com.day5.training.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MergeFileSimultaneously {
	public static void main(String[] args) throws Exception{
		File file1 = new File("t1.txt");
		File file2 = new File("t2.txt");
		File file3 = new File("t4.txt");
		
		BufferedReader  bf1 = new BufferedReader(new FileReader(file1)) ;
		BufferedReader  bf2 = new BufferedReader(new FileReader(file2)) ;
		
		BufferedWriter  bw1 = new BufferedWriter(new FileWriter(file3)) ;
		
		String line1;
		String line2;
		
		while((line1 = bf1.readLine())!=null && (line2 = bf2.readLine())!=null) {
			bw1.write(line1);
			bw1.newLine();
			bw1.write(line2);
			bw1.newLine();
		}
		
		bf1.close();
		bf2.close();
		bw1.close();
	}
}
