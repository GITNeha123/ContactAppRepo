package com.nt.Logical_Program;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
         String original=sc.next();
         for(int i= original.length()-1; i>=0; i--) {
        	 rev=rev+original.charAt(i);
        	 
         }
         if(original.equalsIgnoreCase(rev) )    //(original==rev)
        	 System.out.println("palindrom");
         else
        	 System.out.println("not");

	



	}

}
