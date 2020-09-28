package com.nt.Logical_Program;

import java.util.HashMap;
import java.util.Map;

public class RetrivingElementByMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		 map.put(1,"A");
		 map.put(2,"B");
		 map.put(3,"C");
		 for(Map.Entry<Integer,String> entry:map.entrySet()) {
			 System.out.println(entry.getKey()+" "+entry.getValue());
			 
		 }

	}

}
