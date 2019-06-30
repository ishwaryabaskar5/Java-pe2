package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {
	
	@Before
	public void setUp(){
	
	}
	
	@After
	public void tearDown(){
	
	}
	
	@Test
	public void oddNumber(){
		boolean result = EvenNumber.isEven(5);
		assertEquals(false,result);
	}
	
	@Test
	public void eveNumber(){
		boolean result = EvenNumber.isEven(88);
		assertEquals(true,result);
	}
	
	@Test
	public void negativeNumber(){
		boolean result = EvenNumber.isEven(-45);
		assertEquals(false,result);
	}
	
	@Test
	public void zero(){
		boolean result = EvenNumber.isEven(0);
		assertEquals(false,result);
	}
	
}