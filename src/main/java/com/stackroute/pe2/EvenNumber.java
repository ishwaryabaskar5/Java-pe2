package com.stackroute.pe2;

//The class will check whether the given number is even or not
public class EvenNumber {

//	parameter: int, return type: boolean
	public static boolean isEven(int number){
	
//		declaration
		boolean result = false;
		
		if(number == 0){    // zero is neither even nor odd number
			result = false;
		}else if(number%2 == 0) {  // condition to check for even number
			result = true;
		}
		return result;
	}
}
