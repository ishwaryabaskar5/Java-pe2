package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class GenerateFactorialTest {
	GenerateFactorial generateFactorial;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUp(){
		generateFactorial = new GenerateFactorial();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void tearDown(){
		generateFactorial = null;
		System.setOut(originalOut);
		
	}
	
	@Test
	public void givenInputShouldReturnFactorialOfIntType(){
		generateFactorial.intFactorial();
		assertEquals("Factorial of 1 is 1\n" +
				"Factorial of 2 is 2\n" +
				"Factorial of 3 is 6\n" +
				"Factorial of 4 is 24\n" +
				"Factorial of 5 is 120\n" +
				"Factorial of 6 is 720\n" +
				"Factorial of 7 is 5040\n" +
				"Factorial of 8 is 40320\n" +
				"Factorial of 9 is 362880\n" +
				"Factorial of 10 is 3628800\n" +
				"Factorial of 11 is 39916800\n" +
				"Factorial of 12 is 479001600\n" +
				"Factorial of 13 is 1932053504\n" +
				"Factorial of 14 is 1278945280\n" +
				"Factorial of 15 is 2004310016\n" +
				"Factorial of 16 is 2004189184\n" +
				"Factorial of 17 is out of range\n",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnNotNullInIntFact(){
		generateFactorial.intFactorial();
		assertNotNull(outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnFactorialOfLongType(){
		generateFactorial.longFactorial();
		assertEquals("Factorial of 1 is 1\n" +
				"Factorial of 2 is 2\n" +
				"Factorial of 3 is 6\n" +
				"Factorial of 4 is 24\n" +
				"Factorial of 5 is 120\n" +
				"Factorial of 6 is 720\n" +
				"Factorial of 7 is 5040\n" +
				"Factorial of 8 is 40320\n" +
				"Factorial of 9 is 362880\n" +
				"Factorial of 10 is 3628800\n" +
				"Factorial of 11 is 39916800\n" +
				"Factorial of 12 is 479001600\n" +
				"Factorial of 13 is 6227020800\n" +
				"Factorial of 14 is 87178291200\n" +
				"Factorial of 15 is 1307674368000\n" +
				"Factorial of 16 is 20922789888000\n" +
				"Factorial of 17 is 355687428096000\n" +
				"Factorial of 18 is 6402373705728000\n" +
				"Factorial of 19 is 121645100408832000\n" +
				"Factorial of 20 is 2432902008176640000\n" +
				"Factorial of 21 is out of range\n",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnNotNullInLongFact(){
		generateFactorial.intFactorial();
		assertNotNull(outContent.toString());
	}
}