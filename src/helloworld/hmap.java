package helloworld;

import java.io.*;
import java.util.*;


public class hmap {

	
	public static void main(String args[])
	{
		
		HashMap< String,Integer> hm1 = new HashMap<>();

		
		HashMap<Integer, String> hm2= new HashMap<Integer, String>();

		
		hm1.put("one",1);
		hm1.put("two",2);
		hm1.put("three",3);
		Set<String> keys = hm1.keySet();
		
//		Collections<emp> values =hm1.values();
		
		hm2.put(4, "four");
		hm2.put(5, "five");
		hm2.put(6, "six");
		
		System.out.println("Mappings of HashMap hm1 are : "+ hm1);

		
		System.out.println("Mapping of HashMap hm2 are : "+ hm2);
	}
}
