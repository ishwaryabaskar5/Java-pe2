package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {
	
	EvenNumber evenNumber;
	@Before
	public void setUp(){
		evenNumber = new EvenNumber();
	}
	
	@After
	public void tearDown(){
		evenNumber = null;
	}
	
	@Test
	public void givenInputshouldreturnFalseForOdd(){
		boolean result = evenNumber.isEven(5);
		assertEquals(false,result);
	}
	
	@Test
	public void givenInputshouldreturnTrueForEven(){
		boolean result = evenNumber.isEven(88);
		assertEquals(true,result);
	}
	
	@Test
	public void givenInputshouldreturnFalseForNegativeOdd(){
		boolean result = evenNumber.isEven(-45);
		assertEquals(false,result);
	}
	
	@Test
	public void givenInputshouldreturnFalseForZero(){
		boolean result = evenNumber.isEven(0);
		assertEquals(false,result);
	}
	
}