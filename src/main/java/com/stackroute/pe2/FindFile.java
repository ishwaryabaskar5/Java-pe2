package com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindFile{
	
	public void findFileByExtension(){

//		declaration and initialization
		File folder = new File("/home/ishwarya/IdeaProjects/Java-PE2/src/main/java/com/stackroute/pe2");
		File[] files = folder.listFiles();
		
		for (File a: files){
			tar = a.getName().toLowerCase().endsWith(".doc");
		}
	
	}

}
