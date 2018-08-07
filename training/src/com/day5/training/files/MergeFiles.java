package com.day5.training.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MergeFiles  {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\ayadav\\eclipse-workspace\\training\\src\\com\\day5\\training\\files\\res\\data.txt");
		
		Files.lines(path).forEach(System.out::println);
		
	}
}
