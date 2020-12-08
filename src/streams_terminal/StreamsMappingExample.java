package streams_terminal;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String[] args) {

	List<String>namesList=	StudentDataBase.getAllStudents().stream() //using mapping
		.collect(mapping(Student::getName,toList()));
	
	System.out.println("namelist : "+namesList);
	
	Set<String>nameSet= StudentDataBase.getAllStudents().stream() // using mapping
			.collect(mapping(Student::getName,toSet()));
	
	Set<String>namesUsingMap= StudentDataBase.getAllStudents().stream() //using map
			.map(Student::getName)
			.collect(Collectors.toSet());
	
	System.out.println("nameSet : "+nameSet);
	System.out.println("nameSetUsingMapInsteadOfMapping : "+namesUsingMap);
	}

}
