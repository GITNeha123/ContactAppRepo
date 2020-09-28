package com.nt.Logical_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();   
		map.put("Gujarat", "Gandhi Nagar");               
		map.put("Uttar Pradesh", "Lucknow");   
		map.put("Sikkim", "Ganagtok");   
		for (String State : map.keySet())   //using keyset() method for iteration over keySet  
		System.out.println("State: " + State);   
		for (String Capital : map.values())         //using values() for iteration over keys  
		System.out.println("Capiatl: " + Capital);   
		

	}

}
