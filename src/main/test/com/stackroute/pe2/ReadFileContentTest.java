package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ReadFileContentTest {
	
	ReadFileContent readFile;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUp(){
		readFile = new ReadFileContent();
//		set a new output print stream
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void tearDown(){
//		Reassigns System.out as a print stream
		System.setOut(originalOut);
		readFile = null;
	}
	
	@Test
	public void givenInputShouldReturnFileContent(){
		readFile.readFileContent("/home/ishwarya/IdeaProjects/Java-PE2/src/main/java/com/stackroute/pe2/test.txt");
		assertEquals("HELLO WORLD", outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnEmptyString(){
		readFile.readFileContent("/home/ishwarya/IdeaProjects/Java-PE2/src/main/java/com/stackroute/pe2/empty.txt");
		assertEquals("", outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnIoExceptionMessage(){
		readFile.readFileContent("/home/ishwarya/IdeaProjects/Java-PE2/src/main/java/com/stackroute/empty.txt");
		assertEquals("IO Exception", outContent.toString());
	}
	
}