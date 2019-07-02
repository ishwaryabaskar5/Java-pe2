package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
	
	PowerOfFour powerOfFour;
	
	@Before
	public void setUp(){
		powerOfFour = new PowerOfFour();
	}
	
	@After
	public void tearDown(){
		powerOfFour = null;
	}
	
	@Test
	public void givenInputShouldReturnPowerOfFour(){
		String result = powerOfFour.checkPowerOfFour(64);
		assertEquals("Test1 Passed","64 is power of four",result);
	}
	
	@Test
	public void givenInputShouldReturnNotPowerOfFour(){
		String result = powerOfFour.checkPowerOfFour(6);
		assertEquals("Test2 Passed","6 is not power of four",result);
	}
	
	@Test
	public void givenInputShouldReturnNotPowerOfFourWhenInputIsOne(){
		String result = powerOfFour.checkPowerOfFour(1);
		assertEquals("Test3 Passed","1 is power of four",result);
	}
	
	@Test
	public void givenInputShouldReturnNotPowerOfFourWhenInputIsZero(){
		String result = powerOfFour.checkPowerOfFour(0);
		assertEquals("Test3 Passed","0 is not power of four",result);
	}
	
	@Test
	public void givenInputShouldReturnNotPowerOfFourWhenInputLessThanFour(){
		String result = powerOfFour.checkPowerOfFour(3);
		assertEquals("Test3 Passed","3 is not power of four",result);
	}
	
	@Test
	public void checkWithNegativeNumber(){
		String result = powerOfFour.checkPowerOfFour(-64);
		assertEquals("Test3 Passed","-64 is not power of four",result);
	}
}