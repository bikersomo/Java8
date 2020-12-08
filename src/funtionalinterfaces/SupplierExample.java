package funtionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import data.Student;
import data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Student> studentSupplier =()->{
			return new Student("Ravi", 3, 3.9, "male", Arrays.asList("biking","dance"));
		};
		
			Supplier<List<String>>studentActivities =()->{
			
			List<String>studentActiv = new ArrayList<>();
			
		
					StudentDataBase.getAllStudents().forEach((student)->studentActiv.addAll(student.getActivities()));
					return 	studentActiv; 
		};
		
			
		
		System.out.println(studentSupplier.get());
		
		System.out.println("--------------------"+studentActivities.get());
	}

}
