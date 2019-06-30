package com.stackroute.pe2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//It will read the content of the file
public class ReadFileContent {
	public void readFileContent(String fileName) {
	
//		declaration and initialization
		String str = "";
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(fileName));
//			read a file lines until it is null
				while ((str=br.readLine())!= null)
				{
					System.out.print(str.toUpperCase());  //convert a file contents into upper case
				}
			br.close();
		} catch (IOException e){
			System.out.print("IO Exception");
		}
	}
}
