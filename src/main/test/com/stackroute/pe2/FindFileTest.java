package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FindFileTest {
	FindFile findFile;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUp(){
		findFile = new FindFile();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void tearDown(){
		findFile = null;
		System.setOut(originalOut);
	}
	
	@Test
	public void givenInputShouldReturnContentOfFile(){
		findFile.findFileByExtension();
		assertEquals("Hello World", outContent.toString());
	}
	
}