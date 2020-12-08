package streamsapi;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		
		Predicate<Student>studentPredicateGrade =(student)->student.getGradeLevel()>=3;
		Predicate<Student>studentPredicateGPA =(student)->student.getGpa()>=3.9;
		//student name and activities in a map
		
	Map<String,List<String>> studentNameAndActivitiesMap=	StudentDataBase.getAllStudents().stream()
			.peek(student->System.out.println(student))
			.filter(studentPredicateGrade)
			.peek(student->System.out.println("after 1st filter"+student))// prints what is being passed by streams, used for debugging
			.filter(studentPredicateGPA)
			.peek(student->System.out.println("after 2nd filter"+student))//// will return stream of students 
			//or 
			//.filter(student ->student.getGradeLevel()>=3)// use of filter(predicate ) to add condtions while 
			.collect(Collectors.toMap(Student::getName,Student::getActivities));// getting the desired collection object
	System.out.println(studentNameAndActivitiesMap);	
	// without collect ,method streams are useless and cannot be used.
	}

}



