package methodreference;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class MethodReferenceConsumerExample {

	
	static Consumer<Student> c3Names =System.out::println; // out is calling println method to print the objects being sent -> method referencing
	
	static Consumer<Student> c3Activities = Student::printListOfActivities; // we can call any method of Student class
																			// Here method is printListOfActivities
																			// PLease Note the syntax, "Class" followed by
																			// "::" method of that class.
	
	
	public static void main(String[] args) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		//studentList.forEach(c3Names);
		studentList.forEach(c3Activities);
		

	}

}
