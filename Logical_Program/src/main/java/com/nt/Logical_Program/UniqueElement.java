package com.nt.Logical_Program;

import java.util.Arrays;

public class UniqueElement {
	public static int findSum(int arr[], int n) { 
		Arrays.sort(arr); 
        
        int sum = arr[0]; 
        for (int i = 0; i < n-1; i++) { 
            if (arr[i] != arr[i + 1]) { 
                sum = sum + arr[i+1]; 
            } 
        } 
  
        return sum; 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		int  res=a.length;
    	System.out.print("Sum of unique elements = " );
    	 System.out.println(findSum(a, res)); 
    	
		


	}

}
