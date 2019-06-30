package com.stackroute.pe2;

//This class will check if the given number is power of four or not
public class PowerOfFour {

//	parameter:int return type:String
	public String checkPowerOfFour(int number){
		
//	declaration and initialization
		String result = "";
		int temp = number;
		
//		Calculate mod if temp is greater than or equal to 4
		if(temp >= 4){
			while (temp >= 4){
				if(temp%4 == 0){
					result = number+" is power of four";
				} else {
					result = number+" is not power of four";
				}
				temp /= 4;
			}
		} else if(temp == 1){
			result = number+" is power of four";
		} else {
			result = number+" is not power of four";
		}
		return result;
	}
}
