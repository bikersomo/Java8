package funtionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class BiFunctionExample {

	
	static Predicate<Student> predicateStudentGPA =(student)->	student.getGpa()>=3.9;
	
	 static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> bifunc = ((students, studentPredicate)
			 ->{
				 Map<String,Double> studentMap = new HashMap<>();
				 students.forEach(student->{
					if( studentPredicate.test(student))
					studentMap.put(student.getName(), student.getGpa());
				 });
				 return studentMap;
				 
			 });
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student>studentList = StudentDataBase.getAllStudents();
		
		System.out.println(bifunc.apply(studentList, predicateStudentGPA));
	}

}
