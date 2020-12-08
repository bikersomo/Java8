package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static Optional<Integer> findMaxValueOptional(List<Integer>integerList) {
				Optional<Integer>maxValue=integerList.stream().reduce((x,y)->x>y?x:y);
				return maxValue;
	}
	
	public static Optional<Integer> findMinValue(List<Integer>integerList) {
		Optional<Integer>minValue=
		 integerList.stream().reduce((x,y)->x<y?x:y);
		return  minValue;
	}
	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
		Optional<Integer> maxValue=findMaxValueOptional(integerList);
		if(maxValue.isPresent()) {
			System.out.println("Maxvalue is "+maxValue.get());
		}
		else {
			System.out.println("NO max value");
		}
		Optional<Integer>minValue=findMinValue(integerList);
		if(minValue.isPresent()) {
			System.out.println("Minvalue is "+minValue.get());
		}
		else {
			System.out.println("NO min value");
		}
	}

}
