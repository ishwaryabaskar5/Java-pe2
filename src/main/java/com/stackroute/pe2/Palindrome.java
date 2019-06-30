package com.stackroute.pe2;

//This class will return whether the given input is palindrome or not
public class Palindrome {

//	Accepts generic and returns string
	public <E> String checkPalindrome(E element){
	
//		declaration and initialization
		String result = "";
		String str = ""+element;
		StringBuilder rev = new StringBuilder();
		
		rev.append(str);    // Conerts a string to stringbuilder by append
		rev.reverse();      // Reverse a string
		
//		Check whether the rev is equals to str or not
		if (str.equals(rev.toString())) {
			result = str + " is palindrome";
		} else {
			result = str + " is not a palindrome";
		}
		return result;
	}
}
