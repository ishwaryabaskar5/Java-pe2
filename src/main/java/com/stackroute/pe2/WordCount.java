package com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Class for counting words in a file
public class WordCount {
	
	//	parameter: void, return type: void
	public void countWords() {
	
//		declaration and initialization
		File file = new File("/home/ishwarya/IdeaProjects/Java-PE2/src/main/java/com/stackroute/pe2/FileDemo.txt");
		String str = "",word = "";
		BufferedReader br;
		int counter = 1;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
//			Reads the file lines until eof
			while ((str = br.readLine()) != null) {
				word = word.concat(str);
			}
			
//			Replace both comma and dot with whitespace
			word = word.replace(',',' ');
			word = word.replace('.',' ');
			
//			Split the string using space
			String[] words = word.split("\\s+");
	
//			Compare the words and if they are same words increase the counter
			for (int i = 0; i < words.length; i++){
				for(int j = i+1; j < words.length; j++){
					if(words[i] != null && words[i].equals(words[j]) ){
						counter++;
						words[j] = null; //replace the repeated word with null
					}
				}
				
//				displays the count of the words
				if(words[i] != null)
				System.out.println(words[i]+": "+counter);
				counter = 1;
			}
			br.close();
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}
}
