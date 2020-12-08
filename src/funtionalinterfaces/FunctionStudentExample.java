package funtionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class FunctionStudentExample {


	static Function<List<Student>,Map<String,Double>> functionStudent =(students)->{
		
		Map<String,Double> mapStudents= new HashMap<String,Double>();
		students.forEach((student)->{
			if(FunctionStudentExample.predicate.test(student)) {
			mapStudents.put(student.getName(), student.getGpa());
			}
		});
		return mapStudents;
	};
	
	static Predicate<Student> predicate =(student)->student.getGradeLevel()>=3;
	
	public static void main(String[] args) {
// Used predicate to carry out more filtration logic
		System.out.println(functionStudent.
				apply(StudentDataBase.getAllStudents()));
	}

}
