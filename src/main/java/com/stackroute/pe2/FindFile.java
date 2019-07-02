package com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindFile{
	
	public void findFileByExtension(){

//		declaration and initialization
		String path = "/home/ishwarya/IdeaProjects/Java-PE2/src/main/java/com/stackroute/pe2";
		File folder = new File(path);
		File[] files = folder.listFiles();
		String targetFile = "", str = "";
		BufferedReader br;
		
		try {
			for (File a: files) {
				if (a.getName().endsWith(".doc") == true) {
					targetFile = a.getName();
					br = new BufferedReader(new FileReader(path+"/"+targetFile));
//	                read a file lines until it is null
					while ((str=br.readLine())!= null)
					{
						System.out.print(str);
					}
					br.close();
				}
			}
			} catch (IOException e){
				System.out.print("IO Exception");
			}
		
	
	}

}

