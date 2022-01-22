package helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class emp implements Comparable<emp>{
	
	public int id;
	public String name;
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(emp s1) {
		// TODO Auto-generated method stub
		return  this.getName().compareTo(s1.getName());
	}
	
	
}


public class Student {
	public static void main(String args[]) {
		
	List<emp> list	 = new ArrayList<emp>();  
	list.add(new emp(1, "hi"));
	list.add(new emp(2,"fejd"));
	list.add(new emp(3, "rtyhgf"));
	list.add(new emp(4,"oeiddf"));
	
	
	
	
	
	System.err.println("before");
	for(emp l:list) {
		System.out.println(l);
		
	}

	Collections.sort(list);
	System.err.println("after");
	for(emp l:list) {
		System.out.println(l);
		
		
	}
	
	
	}
}

