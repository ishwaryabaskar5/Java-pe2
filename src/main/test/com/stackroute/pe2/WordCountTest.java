package com.stackroute.pe2;

import org.junit.Test;

public class WordCountTest {
	
	WordCount wordCount;
	
	@Test
	public void countWordsTest(){
	 wordCount = new WordCount();
	 wordCount.countWords();
	}
}