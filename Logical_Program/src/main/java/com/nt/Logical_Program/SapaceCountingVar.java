package com.nt.Logical_Program;

/**
 * Hello world!
 *
 */
public class SapaceCountingVar
{
    public static void main( String[] args )
    {
    	String n="My name is Neha Sahu.";
    	int cnt=0;
    	for(int i=1; i<n.length(); i++) {
    		if(n.charAt(i)==' ')
    			cnt++;
    			
    	}
        System.out.println( "No of space= " +cnt);
    }
}
