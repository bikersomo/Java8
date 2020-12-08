package streams_terminal;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

import data.Student;
import data.StudentDataBase;

public class StreamsSumAvgExample {

	
	public static int sum() {
		
		int totalNoteboks=StudentDataBase.getAllStudents().stream()
		.collect(summingInt(Student::getNotebooks));
		
		return totalNoteboks;
	}
	
public static double average() {
		
		double avgnotebooks=StudentDataBase.getAllStudents().stream()
		.collect(averagingInt(Student::getNotebooks));
		
		return avgnotebooks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Total number of notebooks " +sum());
		System.out.println("AVG number of notebooks " +average());
	}

}
