package streamsapi;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample {
	
	private static int noOfNotebooks() {
		 int numberOfNotebooks=StudentDataBase.getAllStudents().stream()
		.filter(student->student.getGradeLevel()>=3)
		.filter(student->student.getGender().equals("female"))
		.map(Student::getNotebooks)
		.reduce(0,Integer::sum);
		 return numberOfNotebooks;
	}
	public static void main(String[] args) {

		System.out.println("total number of notebooks "+noOfNotebooks());
	}

}
