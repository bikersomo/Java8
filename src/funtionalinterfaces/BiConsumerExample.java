package funtionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class BiConsumerExample {

	public static void nameAndActivities() {
		
		BiConsumer< String, List<String>> biConsStudnt = (name,activities) ->{
			System.out.println("Name: " +name + " Activities:" +activities);
		};
		List<Student>studentList=	StudentDataBase.getAllStudents();
		
		studentList.forEach((student)->{
			biConsStudnt.accept(student.getName(), student.getActivities());
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("a:" + a + " b:" + b);
		};
		biConsumer.accept("Java7", "Java8");
		
		
		
		BiConsumer <Integer, Integer> biConsumerMultiply = (inta, intb)->{
			System.out.println("Multiplication result:"+(inta * intb));
		};
		BiConsumer <Integer, Integer> biConsumerDiv = (inta, intb)->{
			System.out.println("Division result:"+(inta / intb));
		};

		biConsumerMultiply.andThen(biConsumerDiv).andThen(biConsumerMultiply).
		
		accept(20, 10);;
		
		nameAndActivities();
		
	}
	
	
}
