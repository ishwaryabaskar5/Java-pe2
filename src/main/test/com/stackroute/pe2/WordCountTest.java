package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class WordCountTest {
	
	WordCount wordCount;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUp(){
		wordCount = new WordCount();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void tearDown(){
		wordCount = null;
		System.setOut(originalOut);
	}
	
	@Test
	public void givenInputShouldReturnWordCountOfTextFile(){
		String path = "/home/ishwarya/IdeaProjects/Java-PE2/src/main/java/com/stackroute/pe2/FileDemo.txt";
		wordCount.countWords(path);
		assertEquals( "i: 3\nam: 1\na: 2\nman: 1\nlike: 1\nto: 1\nsleep: 1\nhave: 1\nhome: 1\n",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnWordCountOfDoc(){
		String path = "/home/ishwarya/IdeaProjects/Java-PE2/src/main/java/com/stackroute/pe2/HelloWorld.doc";
		wordCount.countWords(path);
		assertEquals( "Hello: 1\nWorld: 1\n",outContent.toString());
	}
}