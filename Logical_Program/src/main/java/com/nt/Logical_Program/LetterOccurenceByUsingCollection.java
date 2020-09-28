package com.nt.Logical_Program;

import java.util.HashMap;
import java.util.Map;

public class LetterOccurenceByUsingCollection {
	public static void charCount(String str) {
		Map<Character,Integer> map=new HashMap();
		char[] ch=str.toCharArray();
	/*	for(int i=1; i<ch.length;i++) {*/
		for(char c:ch) {
		//	if(c=='o') {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				}
			else {
				map.put(c, 1);
				}
			//}
		}
		System.out.println(map);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charCount("hello");

	}

}
