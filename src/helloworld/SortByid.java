package helloworld;

import java.util.Comparator;

public class SortByid implements Comparator<emp>{

	@Override
	public int compare(emp s1, emp s2) {
		
		if(s1.getId()>s2.getId())
		{
		return 1;	
		}
		else if(s1.getId()<s2.getId())
		{
			return -1;
		}
		else
		{
		 return 0;	
		}
		
	}

	
	
	

}