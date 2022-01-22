package helloworld;



import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Streamex {
	
	
	public static void main(String args[]) {
		
		
		
		
		Stream<Integer> stream = Stream.empty();
		
		Collection<Integer> collection =Arrays.asList(1000,29399,200,38737,200);
		
		Stream<Integer> cos = collection.stream();
		
		
		Long count =cos
				.filter(value->value ==200)
				
				.count();
		System.out.println(count);
	}

}
