package streamsapi;

import data.StudentDataBase;

public class StreamsMatchExample {

	public static boolean allMatch() {
		
		return StudentDataBase.getAllStudents().stream()
		.allMatch(student->student.getGpa()>=3.5);
	}
	
public static boolean anyMatch() {
		
		return StudentDataBase.getAllStudents().stream()
		.anyMatch(student->student.getGpa()>=4.1); // no sudent has 4.1
	}

public static boolean noneMatch() {
	
	return StudentDataBase.getAllStudents().stream()
	.noneMatch(student->student.getGpa()>=5); // no student has 5
}
	
	public static void main(String[] args) {

		System.out.println(allMatch());
		System.out.println("anymatch: "+anyMatch());
		System.out.println("nonematch: "+noneMatch());
	}

}
