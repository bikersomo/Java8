package parallelStreams;

import java.util.stream.IntStream;

public class ParallelSumClient {

	public static void main(String args[]) {
// parallel stream failure example
		ParallelSum sum = new ParallelSum();
	 	IntStream.
	 	rangeClosed(1,1000)// perform sum is not returning right value . ACTUAL OUTPUT SHOULD BE 50050
	 	.parallel() // fails to work here -- as we are modifying total variable concurrently as it mutable and will give
		.forEach(sum::performSum);// different output everytime.
		//not to use parallel stream here.
		System.out.println(sum.getTotal());
	} 
}
