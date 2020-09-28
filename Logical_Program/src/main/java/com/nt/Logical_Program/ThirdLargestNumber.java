package com.nt.Logical_Program;

public class ThirdLargestNumber {
	public static int getThirdLargest(int[] a, int total) {
		if(total<3) {
				System.out.println("Invalid Input, array size is less than 3");
				return 0;
				}
		else { 	
			
			int temp;  
			for (int i = 0; i < total; i++)   
			        {  
			            for (int j = i + 1; j < total; j++)   
			            {  
			                if (a[i] > a[j])   
			                {  
			                    temp = a[i];  
			                    a[i] = a[j];  
			                    a[j] = temp;  
			                }  
			            
			            }
			        }  
			 return a[total-3];  
	}
			       
			}
			           

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 6, 8, 1, 9, 2, 1, 10};
		int len=input.length;
		System.out.print("ThirdLargestNumber= "+getThirdLargest(input,len) );


	}

}
