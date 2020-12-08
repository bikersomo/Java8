package streamsapi;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsFilterExample {
	
	public static List<Student> filterStudents(){
		return StudentDataBase.getAllStudents().stream()//Stream Student
		.filter(student->student.getGender().equals("female")) 
		//filters and sends only the students whose gender is female
		.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		filterStudents().forEach(System.out::println);
	}

}
