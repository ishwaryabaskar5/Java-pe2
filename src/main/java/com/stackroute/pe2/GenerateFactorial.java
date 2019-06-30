package com.stackroute.pe2;

public class GenerateFactorial {
	public void intFactorial(){
		
		int fact = 1, num;
		int max = Integer.MAX_VALUE;
		
		for(int i = 1; i<30; i++){
			for (int j = i; j >= 1; j--){
				fact = fact * j;
			}
			if(fact <= max && fact > 0 )
				System.out.println("Factorial of "+i+" is "+fact);
			else {
				System.out.println("Factorial of " + i + " is out of range");
				break;
			}
			fact = 1;
		}
	}
	
	public void longFactorial(){
		long fact = 1, num;
		
		for(int i = 1; i<30; i++){
			for (int j = i; j >= 1; j--){
					fact = fact * j;
			}
			if(fact <= Long.MAX_VALUE && fact > 0 )
				System.out.println("Factorial of "+i+" is "+fact);
			else {
				System.out.println("Factorial of " + i + " is out of range");
				return;
			}
			fact = 1;
		}
	}
}
