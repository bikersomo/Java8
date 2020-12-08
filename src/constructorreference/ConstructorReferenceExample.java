package constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import data.Student;

public class ConstructorReferenceExample {
	
static	Supplier<Student>studentSupplier = Student::new;

static Function<String,Student> studentFunction=Student::new; // a student class constructor having an input of String 
															  // has to be present to accept String as a parameter


	public static void main(String args[]) {
		
		System.out.println(studentSupplier.get()); // will print an empty an uninitialized object.
		System.out.println(studentFunction.apply("Sita"));
		
	}

}
