package com.nt.Logical_Program;

public class SecondHigestNo {
	public static int getSecondMaxElements(int[] a, int total) {
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
	         
	 return a[total-2];  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1, 2, 5, 9, 6, 4, 7, 2};
		int len=input.length;
		System.out.print("Max  = "+getSecondMaxElements(input,len) +" ");
		
		}

}
