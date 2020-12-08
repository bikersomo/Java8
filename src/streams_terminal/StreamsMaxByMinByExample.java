package streams_terminal;

import java.util.Comparator;
import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class StreamsMaxByMinByExample {

	public static void main(String[] args) {
		
/*		Comparator<Student> c1 = new Comparator<Student>() {
						@Override
			public int compare(Student o1, Student o2) {
			if(	o1.getGpa()>o2.getGpa())
				return 1;
			if(	o1.getGpa()<o2.getGpa())
				return -1;
			else
				return 0;
			}
		};*/
		
		/*Optional<Student> studentWithHIghestGPA=StudentDataBase.getAllStudents().stream()
				.max(c1);*/ 
		
		//Used comparator -> instead comapring() can be used from Comparator class
		
		Optional<Student> studentWithHIghestGPA=StudentDataBase.getAllStudents().stream()
		.max(Comparator.comparing(Student::getGpa));
				
		Optional<Student> studentWithLoswestGPA=StudentDataBase.getAllStudents().stream()
				.min(Comparator.comparing(Student::getGpa));
						
		
		if(studentWithHIghestGPA.isPresent() && studentWithLoswestGPA.isPresent())
			{
			System.out.println("Highest GPA "+studentWithHIghestGPA.get().getName());
			System.out.println("Lowest GPA "+studentWithLoswestGPA.get().getName());
			}
		else
			System.out.println("not present");
	}

}
