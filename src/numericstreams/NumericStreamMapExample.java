package numericstreams;

import java.util.stream.IntStream;

import  java.util.List;

import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {

	public static List<Integer> mapToObj() {
	return	IntStream.rangeClosed(1, 5)
		.mapToObj((i)->{
			return new Integer(i);
		})
		.collect(toList());
		
	}
	
	public static Long mapToLong() {
	return	IntStream.rangeClosed(1, 5)
		.mapToLong((i)->i
		)
		.sum();
		
	}
	
	public static Double mapToDouble() {
	return	IntStream.rangeClosed(1, 5)
		.mapToDouble((i)->i
		)
		.sum();
		
	}
	
	
	
	public static void main(String[] args) {

		System.out.println("Map to Obj "+mapToObj());
		
		System.out.println("Map to Long "+mapToLong());
		
		System.out.println("Map to Double "+mapToLong());
		
	}

}
