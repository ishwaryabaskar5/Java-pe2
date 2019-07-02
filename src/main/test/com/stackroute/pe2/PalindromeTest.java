package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
	
	Palindrome palindrome;
	
	@Before
	public void setUp(){
		palindrome = new Palindrome();
	}
	
	@After
	public void tearDown(){
		palindrome = null;
	}
	
//	Test with valid palindrome string
	@Test
	public void givenInputShouldReturnPalindromeForString(){
		String result = palindrome.checkPalindrome("madam");
		assertEquals("Test1 Passed","madam is palindrome",result);
	}
	
//	Test with invalid palindrome string
	@Test
	public void givenInputShouldReturnNotPalindromeForString(){
		String result = palindrome.checkPalindrome("hello");
		assertEquals("Test2 Passed","hello is not a palindrome",result);
	}

//	Test with a valid palindrome number
	@Test
	public void givenInputShouldReturnPalindromeForNumber(){
		String result = palindrome.checkPalindrome("12321");
		assertEquals("Test3 Passed","12321 is palindrome",result);
	}

//	Test with invalid palindrome number
	@Test
	public void givenInputShouldReturnNotPalindromeForNumber(){
		String result = palindrome.checkPalindrome("133.7");
		assertEquals("Test4 Passed","133.7 is not a palindrome",result);
	}
}