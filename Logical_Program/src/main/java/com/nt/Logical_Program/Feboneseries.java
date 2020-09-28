package com.nt.Logical_Program;

public class Feboneseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0,n=5;
		 System.out.print(a+",");
		 System.out.print(b+",");
		for(int i=1; i<=n; i++) {
			c=a+b;
			 System.out.print(c+",");
			a=b;
				b=c;
		}
		

	}

}
