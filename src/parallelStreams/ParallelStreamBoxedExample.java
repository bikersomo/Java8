package parallelStreams;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {
	
	public static int sequentialSum(List<Integer>integerList)
	{
		long start=System.currentTimeMillis();
		int sum=integerList.stream()
		.reduce(0,(x,y)->x+y);
		long end= System.currentTimeMillis();
		System.out.println("Duration in seq : "+(end-start) );
		return sum;
	}
	
	public static int parallelSum(List<Integer>integerList)
	{
		long start=System.currentTimeMillis();
		int sum=integerList.stream().parallel()
		.reduce(0,(x,y)->x+y);    // perform the unboxing from Integer to int hence takes longer time than seq stream. 
		long end= System.currentTimeMillis();
		System.out.println("Duration in parallel : "+(end-start) );
		return sum;
	}
	public static void main(String[] args) {

		List<Integer>integerList=IntStream.rangeClosed(1, 10000)
			.boxed()
			.collect(toList());
		
		sequentialSum(integerList);
		parallelSum(integerList);
	}

}
