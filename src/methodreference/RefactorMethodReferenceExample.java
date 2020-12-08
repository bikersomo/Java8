package methodreference;

import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class RefactorMethodReferenceExample {

	
	static Predicate<Student> predicateStudent =RefactorMethodReferenceExample::greaterThanGradeLevel;
	
	public static boolean greaterThanGradeLevel(Student student) {
		
	return	student.getGradeLevel()>=3;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(predicateStudent.test(StudentDataBase.studentSupp.get()));
	}

}
