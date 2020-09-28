package com.nt.Logical_Program;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	final List<String> list= new ArrayList<String>();
		
		int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    

	}

}
