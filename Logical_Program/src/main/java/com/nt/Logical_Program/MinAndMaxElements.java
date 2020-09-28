package com.nt.Logical_Program;

public class MinAndMaxElements {
	public static int getMaxElements(int[] a, int total) {
		int max=a[0],min=a[0];
		for(int i=1; i<total; i++) {
			if(a[i]>max) {
				max=a[i];
			}
	}
		return max;
		}//m
	public static int getMinElements(int[] a, int total) {
		int min=a[0];
		for(int i=1; i<total; i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
	}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1, 2, 5, 5, 6, 6, 7, 2};
		int len=input.length;
		System.out.print("Max  = "+getMaxElements(input,len) +" ");
		System.out.print("Min = "+getMinElements(input,len) );

	}

}
