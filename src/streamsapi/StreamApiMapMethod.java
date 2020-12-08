package streamsapi;

import java.util.List;
import java.util.Set;

import data.Student;
import data.StudentDataBase;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamApiMapMethod {

	public static List<String> namesList(){
	return	StudentDataBase.getAllStudents().stream().map(Student::getName)// map method converts one datatypr to anaother
			.map(String::toUpperCase)// can add more maps to change the output
			.collect(toList());
	}
	
	public static Set<String> namesSet(){
		return	StudentDataBase.getAllStudents().stream().map(Student::getName)// map method converts one datatypr to anaother
				.map(String::toUpperCase)// can add more maps to change the output
				.collect(toSet());// returns Set
		}
		
		
		public static void main(String[] args) {
					
			System.out.println(namesList());
			
	}

}
