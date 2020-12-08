package streamsapi;

import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class StreamsFindFirstFindAny {

	public static Optional<Student> findAny(){
		return
		StudentDataBase.getAllStudents().stream()
		.filter(student->student.getGpa()>=3.9)
		.findAny();
	}
	
	public static Optional<Student> findFirst(){
		return
		StudentDataBase.getAllStudents().stream()
		.filter(student->student.getGpa()>=3.9)
		
		
		.findFirst();
	}
	
	public static void main(String[] args) {

		Optional<Student> studentPresent= findAny();
		if(studentPresent.isPresent())
		{
			System.out.println(studentPresent.get());
		}
		else {
			System.out.println("NO student");
		}
		
		Optional<Student> studentFirst=	findFirst();
		if(studentFirst.isPresent()){
			System.out.println(studentFirst.get());
		}
		else {
			System.out.println("NO student");
		}
		
	}

}
