package funtionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerExample {
	static Consumer<Student> c2 = (student)->{System.out.println(student.getActivities());};
	static Consumer<Student> c3Activities = (student) ->{System.out.println(student.getActivities());};
	static Consumer<Student> c3Names =(student)->{System.out.print(student.getName());}; 
	
	public static void printName() {
	List<Student>studentList=	StudentDataBase.getAllStudents();
	
		studentList.forEach(c2);
		studentList.forEach((student) -> 
				c3Names.andThen(c3Activities)
		);
System.out.println("-----------------------------------------------------------");		
		studentList.forEach((student) -> {
			if (student.getGradeLevel() >= 3) {
				c3Names.andThen(c3Activities).accept(student);
			}
			;
		});
	}

	
	
	public static void main(String args[]) {
		Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
		c1.accept("xyz");
		ConsumerExample.printName();
		
	}
	

}
