package com.stackroute.pe2;

import org.junit.Test;

public class GenerateFactorialTest {
	GenerateFactorial generateFactorial;
	
	@Test
	public void countWordsTest(){
		generateFactorial = new GenerateFactorial();
		generateFactorial.intFactorial();
		generateFactorial.longFactorial();
	}
}