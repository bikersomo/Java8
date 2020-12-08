package streams_terminal;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class StreamsPartioningByExample {

	
	public static void partitionby_1() {
		
		Predicate<Student> predicateGPA= (student)->student.getGpa()>=3.8;
		Map<Boolean,List<Student>> partitioningMap=StudentDataBase.getAllStudents().stream()
		.collect(partitioningBy(predicateGPA));// partitioning returns boolean and List 
		
		System.out.println("partioning Map : "+ partitioningMap);
		
	}
	
public static void partitionby_2() {
		
		Predicate<Student> predicateGPA= (student)->student.getGpa()>=3.8;
		Map<Boolean,Set<Student>> partitioningMapSet=StudentDataBase.getAllStudents().stream()
		.collect(partitioningBy(predicateGPA,toSet()));// overload partitioning method to return a set instead of lost
		
		System.out.println("partioning Map to Set : "+ partitioningMapSet);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partitionby_1();
		
		partitionby_2();
	}

}
