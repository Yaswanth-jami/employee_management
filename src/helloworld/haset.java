package helloworld;

import java.util.Set;
import java.util.TreeSet;



public class haset {
	
	
	public static void main(String args[])
	{
		Set<emp> studentSet=new TreeSet<emp>(new SortByid());
		studentSet.add(new emp(3, "Pooja"));
		studentSet.add(new emp(1, "Kamesh"));
		studentSet.add(new emp(60, "Zee"));
		studentSet.add(new emp(5, "Priya"));
	 		
	    studentSet.forEach(
	    		(str)->System.out.println(str)
	    		);
		
	}

}
