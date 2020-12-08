package streams_terminal;

import static java.util.stream.Collectors.joining;

import java.util.stream.Collectors;

import data.StudentDataBase;

public class StreamsJoiningExample {
// joining just joins the outpur of the collections
	// different overloaded join methods
	
	public static String joining_1() {

		return StudentDataBase.getAllStudents().stream().map(student -> student.getName())
				.collect(Collectors.joining());
	}
	
	public static String joining_2() {

		return StudentDataBase.getAllStudents().stream().map(student -> student.getName())
				.collect(Collectors.joining("-"));
	}

	public static String joining_3() {

		return StudentDataBase.getAllStudents().stream().map(student -> student.getName())
				.collect(Collectors.joining("-","(",")"));
	}
	
	public static String joining_4() {

		return StudentDataBase.getAllStudents().stream().map(student -> student.getName())
				.collect(joining());
	}

	public static void main(String args[]) {
		
		System.out.println("JOining 1: "+joining_1());
		System.out.println("JOining 2: "+joining_2());
		System.out.println("JOining 3: "+joining_3());
	}
}
