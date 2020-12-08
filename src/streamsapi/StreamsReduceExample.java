package streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class StreamsReduceExample {

	
	public static int performMultiplication(List<Integer>integerList) {
		
		return integerList.stream()
				.reduce(1, (a,b)->a*b);
	}
	
public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer>integerList) {
		
		return integerList.stream()
				.reduce((a,b)->a*b);
	}

public static Optional<Student> highestGPA(){
	
return	StudentDataBase.getAllStudents().stream()
	.reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);}
	
public static void main(String[] args) {

		
		List<Integer>integerList =  Arrays.asList(1,3,5,7);
		System.out.println(performMultiplication(integerList));
		
		List<Integer>integer1 = new ArrayList<>();
		Optional<Integer>result =performMultiplicationWithoutIdentity(integer1);
		System.out.println("----------------"+result.isPresent());
		System.out.println(highestGPA());
		
	}

}
