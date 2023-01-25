package com.lesson;

import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		File file = new File("tmppewfphhp.txt");
		file.createNewFile();
			FileWriter fw = new FileWriter(file);
			fw.write("str1\n");
			fw.write("str2\n");
			fw.write("str3\n");
			fw.flush();
			//fw.close();
			//char[] arraychar = new char[20];
			FileReader fr = new FileReader(file);
			//fr.read(arraychar);fvdsvdsvdsvx sdv
			//System.out.print(arraychar);
			
			BufferedWriter BW = new BufferedWriter(fw);
			BW.write("str3");
			BW.newLine();
			BW.write("str4");
			BW.flush();
			BW.close();
			
			BufferedReader BR = new BufferedReader(fr);
			while(BR.ready()) {
				System.out.println(BR.readLine());
			}
	}
	
}
