import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Imperativevsdeclarative {

	
	public static void main(String args[]) {
		
		List<Integer> integerList= Arrays.asList(1,2,2,3,3,3,4,5,6,6,7,7,7,9,10);
		
		List<Integer>uniqueList=integerList.stream().distinct().collect(Collectors.toList());
		System.out.println("UniqueList"+uniqueList);
	}
}
