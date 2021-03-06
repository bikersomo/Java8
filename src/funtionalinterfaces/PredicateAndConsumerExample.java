package funtionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateAndConsumerExample {
	
	Predicate<Student>	studentGradCond = (student)->student.getGradeLevel()>=3;
	Predicate<Student>	studentGPAcond = (student)->student.getGpa()>=3.9;
	
	BiConsumer<String,List<String>> studentNameAndActivities = (name,activities) ->{
		System.out.println("Student Name is: "+name+" and activites are: "+activities);
	};
	
	Consumer<Student> studentConsumer = (student)->{
		if(studentGradCond.and(studentGPAcond).test(student)) {
			studentNameAndActivities.accept(student.getName(),student.getActivities() );
		}
	};
	
	public void printNameActivities(List<Student>studentList) {
		
		studentList.forEach((student)->{
			studentConsumer.accept(student);
		});
		
		System.out.println("----------------------------------------");
		//the above code snippet can also be written as below
		
		studentList.forEach(studentConsumer);
	}
	
	public static void main(String args[]) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		PredicateAndConsumerExample example = new PredicateAndConsumerExample();
		example.printNameActivities(studentList);
	
	}
}
