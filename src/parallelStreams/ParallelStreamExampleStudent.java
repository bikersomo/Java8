package parallelStreams;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class ParallelStreamExampleStudent {

public static List<String>	sequentialStudentActivities(){
	long begintime = System.currentTimeMillis();
	List<String> seqActivities=StudentDataBase.getAllStudents()
			.stream()
			.map(Student::getActivities)
	.flatMap(List::stream)// This will return Stream<String>, flattening the requirement
	.distinct() // returns only unique values
	.sorted()// sorte list
	.collect(toList());
	long endtime = System.currentTimeMillis();
	System.out.println("Duration of seqential : " + (endtime-begintime));
	return seqActivities;
}

public static List<String>	parallelStudentActivities(){
	long begintime = System.currentTimeMillis();
	List<String> parallelActivities= StudentDataBase.getAllStudents()
			.stream()
			.parallel()
	.map(Student::getActivities)
	.flatMap(List::stream)
	.distinct()
	.sorted()
	.collect(Collectors.toList());
	long endtime = System.currentTimeMillis();
	System.out.println("Duration of parallel : " + (endtime-begintime));
	return parallelActivities;
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sequentialStudentActivities();
		
		parallelStudentActivities();
	}

}
