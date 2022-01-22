package helloworld;

import java.util.*;
import java.util.stream.Collectors;

class company{
	
	
	private String name;
	private int year;
	private int eps;
	
	
	public company(String name, int year, int eps) {
		super();
		this.name = name;
		this.year = year;
		this.eps = eps;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getEps() {
		return eps;
	}


	public void setEps(int eps) {
		this.eps = eps;
	}


	@Override
	public String toString() {
		return "company [name=" + name + ", year=" + year + ", eps=" + eps + "]";
	}


	public int compareTo(company j) {
		// TODO Auto-generated method stub
		if(this.getEps() >j.getEps()) {
			return 1;
		}
		else if (this.getEps()<j.getEps()) {
			return -1;
		}
		
		return 0;
	}

	
	
}





public class Companies {
	
	public static void main(String args[]) {
		
		List<company> ls=new ArrayList<company>();
		ls.add(new company("AMAZON",1995,22344));
		ls.add(new company("FB",2005,62344));
		ls.add(new company("INSTAGRAM",2010,34544));
		ls.add(new company("SNAPCHAT",2007,18344));
		ls.add(new company("WHATSAPP",2010,0));
		ls.add(new company("GOOGLE",1995,56473));
		ls.add(new company("1+",2011,12344));
	
		
		//ex-1
		
		List<String> ls1=ls.stream() 
				.filter(company->company.getYear()>=2000)
				.map(s->s.getName()) 
				.collect(Collectors.toList());
		ls1.forEach(s->System.out.println(s));
		
		
		System.out.println("-----------------------");
		//ex-2
		Long count1 = ls.stream() .filter(company -> company.getYear()>2000)
		 .map(s->s.getName()) .count(); System.out.println(count1);
		
		 
		 System.out.println("-----------------------");
		//ex-3
		 
		 Optional<company> maxeps = ls.stream().max((i,j)->i.compareTo(j));
		System.out.println( maxeps.get());
		
		
		System.out.println("-----------------------");
		//ex-4

		Optional<company> mineps = ls.stream().min((i,j)->i.compareTo(j));
		System.out.println( mineps.get());
		
		System.out.println("-----------------------");
		//ex-5
		
		
		
		Collection<company> ascOrder = ls.stream().sorted(new Comparator<company>(){

			@Override
			public int compare(company arg0, company arg1) {
				// TODO Auto-generated method stub
				return arg0.getName().compareTo(arg1.getName());
			}
		}).collect(Collectors.toList());
		System.out.println(" Asc order by company name "+ascOrder);
		
		
		System.out.println("-----------------------");
		//ex-6
		
		Collection<Integer> dist = ls.stream().map(company->company.getYear()).distinct().collect(Collectors.toList());
		
		System.out.println(dist);

}
}
