package helloworld;

import java.util.Comparator;

public class SortByname implements Comparator<emp>{

	@Override
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		
		
		return o1.getName().compareTo(o2.getName());
	}

}
