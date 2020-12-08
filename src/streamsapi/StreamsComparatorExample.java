package streamsapi;

import java.util.Comparator;
import java.util.List;

import data.Student;
import data.StudentDataBase;
import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

	public static List<Student> sortStudentsByName(){
	return	StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(toList());
	}
	
	public static List<Student> sortStudentsByGPA(){
	return	StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(toList());
	}
	
	public static List<Student> sortStudentsByGPADesc(){
		return	StudentDataBase.getAllStudents().stream()
			.sorted(Comparator.comparing(Student::getGpa).reversed()) // reversed method reverses the order
			.collect(toList());
		}
	public static void main(String[] args) {

		System.out.println("Student sorted by name");
		sortStudentsByName().forEach(System.out::println);
		
		System.out.println("Student sorted by GPA");
		sortStudentsByGPA().forEach(System.out::println);
		
		System.out.println("Student sorted by GPA in desc");
		sortStudentsByGPADesc().forEach(System.out::println);
	}

}
