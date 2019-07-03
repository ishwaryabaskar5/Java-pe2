package com.stackroute.pe2;

public class StudentGrades {
	
	public void calculateGrade(int num, int ...array){
	
//		declaration and initialization
		int avg = 0, sum = 0, temp;
		
//		if num not equal to array length
		if(num != array.length){
			System.out.print("You need to enter "+num+" grades. But you have entered only "+array.length+" grades");
		} else {
			for(int i = 0; i < num; i++){
				sum += array[i];    // sum of array
			}
			
			//sorting
			for(int i = 0; i < num; i++){
				if(array[i]>=0 && array[i]<= 100){
					for (int j = i+1; j < num; j++){
						if(array[i] > array[j]){
							temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				} else {    // not array valid grade
					System.out.print("Please enter valid grades");
					return;
				}
			}
			avg = sum / num;      // average calculation
			System.out.print("The average is "+avg+"\nThe minimum is "+array[0]+"\nThe maximum is "+array[num-1]);
			
		}
	}
}
