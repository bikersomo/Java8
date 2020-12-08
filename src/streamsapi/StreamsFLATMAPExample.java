package streamsapi;

import java.util.List;

import data.Student;
import data.StudentDataBase;

import static java.util.stream.Collectors.toList;

public class StreamsFLATMAPExample {

	
	public static List<String> flatMapExample()
			{
		
		return StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream)// This will return Stream<String>, flattening the requirement
				.distinct() // returns only unique values
				.sorted()// sorte list
				.collect(toList());
		
		
			}
	
	public static Long getStudentActivityCount()
	{

return StudentDataBase.getAllStudents().stream().map(Student::getActivities)
		.flatMap(List::stream)// This will return Stream<String>, flattening the requirement
		.distinct() // returns only unique values
		.count(); // total number of activities


	}
			
	
	public static void main(String[] args) {

		System.out.println(flatMapExample());
		
		System.out.println("Number of distinct activities are:  "+getStudentActivityCount());
	}

}
