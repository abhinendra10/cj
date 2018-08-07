package com.day5.training.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFiles  {
	public static void main(String[] args) throws IOException  {
		
		
			File file1 = new File("t1.txt");
			File file2 = new File("t2.txt");
			File file3 = new File("t3.txt");
			
			BufferedReader  bf1 = new BufferedReader(new FileReader(file1)) ;
			BufferedReader  bf2 = new BufferedReader(new FileReader(file2)) ;
			
			BufferedWriter  bw1 = new BufferedWriter(new FileWriter(file3)) ;
			
//			System.out.println(bf1.readLine());
			bw1.write("msdhafkjh");
//			String line;
//			
//			while((line = bf1.readLine())!=null) {
//				bw1.write(line);
//				bw1.newLine();
//			}
//			
//			while((line = bf2.readLine())!=null) {
//				bw1.write(line);
//				bw1.newLine();
//			}
//			
			bf1.close();
			bf2.close();
			bw1.close();
	}
}
