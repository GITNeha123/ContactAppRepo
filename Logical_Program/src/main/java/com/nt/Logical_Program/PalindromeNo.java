package com.nt.Logical_Program;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121,temp=n,rem=0,rev=0;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			}
		if(rev==n)
			 System.out.println("palindrom");
        else
       	 System.out.println("not");

		

	}

}
