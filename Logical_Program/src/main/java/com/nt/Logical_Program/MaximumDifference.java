package com.nt.Logical_Program;

public class MaximumDifference {
	public static int getMaximumDifference(int[] a, int total) {
		int max=a[0], min=a[0],res=0;
		for(int i=1; i<total; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
				}// for 
		
		res=max-min;
		
		
		return res;
			
	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {9, 2, 12, 5, 4, 7, 3, 19, 5};
		int len=input.length;
		System.out.print("Maximum Difference = "+getMaximumDifference(input,len) );

	}

}
