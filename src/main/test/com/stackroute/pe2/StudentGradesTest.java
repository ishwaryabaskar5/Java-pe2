package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StudentGradesTest {
	
	private StudentGrades studentGrades;
	private PrintStream originalOut = System.out;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
		studentGrades = new StudentGrades();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void tearDown(){
		studentGrades = null;
		System.setOut(originalOut);
	}
	
	@Test
	public void givenInputShouldReturnAvgMinMaxValues(){
		studentGrades.calculateGrade(4,78,56,23,67);
		assertEquals("The average is 56\nThe minimum is 23\nThe maximum is 78",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnEnterValidGradeErrorMessage(){
		studentGrades.calculateGrade(4,104,-67,23,78);
		assertEquals("Please enter valid grades",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnErrorMessage(){
		studentGrades.calculateGrade(4,90,35,59);
		assertEquals("You need to enter 4 grades. But you have entered only 3 grades",outContent.toString());
	}
	
	
}