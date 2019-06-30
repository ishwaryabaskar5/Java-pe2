package com.stackroute.pe2;

public class StudentGrades {
	
	public void calculateGrade(int n, int ...a){
	
//		declaration and initialization
		int avg = 0, sum = 0, temp;
		
//		if n not equal to array length
		if(n != a.length){
			System.out.print("You need to enter "+n+" grades. But you have entered only "+a.length+" grades");
		} else {
			for(int i = 0; i < n; i++){
				sum += a[i];    // sum of array
			}
			
			//sorting
			for(int i = 0; i < n; i++){
				if(a[i]>=0 && a[i]<= 100){
					for (int j = i+1; j < n; j++){
						if(a[i] > a[j]){
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				} else {    // not a valid grade
					System.out.print("Please enter valid grades");
					return;
				}
			}
			avg = sum / n;      // average calculation
			System.out.print("The average is "+avg+"\nThe minimum is "+a[0]+"\nThe maximum is "+a[n-1]);
			
		}
	}
}
