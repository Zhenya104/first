package com.lesson;

import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		
	File file = new File("tmppewfphhp.txt");
	if(file.exists()) {
		file.createNewFile();
	}
	BufferedWriter BufferedWriter = new BufferedWriter(new FileWriter(file)); 
	BufferedWriter.write("str1");
	BufferedWriter.newLine();
	BufferedWriter.write("str2");
	BufferedWriter.newLine();
	BufferedWriter.write("str3");
	BufferedWriter.close();
	
	
	BufferedReader BufReader = new BufferedReader (new FileReader(file));
	while (BufReader.ready()) {
		System.out.println(BufReader.readLine());
	}
	
	}
}

