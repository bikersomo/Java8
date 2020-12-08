package funtionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateStudetntExample {
	
	
	static Predicate<Student> predicateStudent =(student)->	student.getGradeLevel()>=3;
	static Predicate<Student> predicateStudent2nd =(student)->	student.getGpa()>=3.9;
	//static Predicate<Student> predicateStudent2nd =(student)->	student.getGpa()>=3.9;
	public static void filterStudentByGradeLevel() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(student->{
		if(	predicateStudent.test(student)) { // the predicate is a  conditional one and hence requires a condition
			System.out.println("Student: "+student.getName()); // evaluator like an if block.
		}
		});	}
	
public static void filterStudentByGPA() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(student->{
		if(	predicateStudent2nd.test(student)) { // the predicate is a  conditional one and hence requires a condition
			System.out.println("Student: "+student.getName()); // evaluator like an if block.
		}
		});
		
		}

public static void filterStudentByGradeLevelAndGPA() {
	
	List<Student> studentList = StudentDataBase.getAllStudents();
	
	studentList.forEach(student->{
	if(	predicateStudent.or(predicateStudent2nd).test(student)) { // the predicate is a  conditional one and hence requires a condition
		System.out.println("Student: "+student.getName()); // evaluator like an if block.
	}
	});	}
	
	public static void main(String args[]) {
		filterStudentByGradeLevel();
		System.out.println("--------------------------------------------");
		filterStudentByGPA();
		System.out.println("**********************************************");
		filterStudentByGradeLevelAndGPA();
	}

}
