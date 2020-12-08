package streams_terminal;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;

import java.util.Comparator;
import  java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import data.Student;
import data.StudentDataBase;

public class StreamsGroupByExample {

	public static void groupByGender() {
		
		Map<String,List<Student>>studentGenderMap=StudentDataBase.getAllStudents().stream()
		.collect(groupingBy(Student::getGender));
		
		System.out.println(studentGenderMap);
	}
	
public static void groupByCustomised() {
		
		Map<String,List<Student>>studentCustomised=StudentDataBase.getAllStudents().stream()
		.collect(groupingBy(student->student.getGpa()>=3.8?"Outstanding":"Average"));
		
		System.out.println(studentCustomised);
	}


public static void twoLevelGrouping_1() {
	Map<Integer,Map<String,List<Student>>> studentMaps=
	StudentDataBase.getAllStudents().stream()
	.collect(groupingBy(Student::getGradeLevel,groupingBy(student->student.getGpa()>=3.8?"Outstanding":"Average")));
	
	System.out.println(studentMaps);
}

public static void twoLevelGrouping_2() {
	Map<String,Integer> studentMaps=
	StudentDataBase.getAllStudents().stream()
	.collect(groupingBy(Student::getName,
			summingInt(Student::getNotebooks)));
	
	System.out.println(studentMaps);
}
	

public static void threeArgumentGroupBy() {
	LinkedHashMap<String, Set<Student>> studentLinkedHashMap=
	StudentDataBase.getAllStudents().stream().collect(groupingBy(Student::getName,LinkedHashMap::new,toSet()));
	
	System.out.println("-------------"+studentLinkedHashMap);
}


public static void calCulateTopGPA() {
	Map<Integer,Optional<Student>> topGPA=
	StudentDataBase.getAllStudents().stream()
	.collect(groupingBy(Student::getGradeLevel,	maxBy(Comparator.comparing(Student::getGpa))));
	
	System.out.println("+++++++++++++++-"+topGPA);
	
	Map<Integer,Student>studentOptional=
	StudentDataBase.getAllStudents().stream().collect(groupingBy(Student::getGradeLevel,collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
	
	System.out.println("///////"+ studentOptional);
}


public static void calCulateLeastGPA() {
	
	Map<Integer,Student>studentOptionalMin=
	StudentDataBase.getAllStudents().stream().collect(groupingBy(Student::getGradeLevel,collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
	
	System.out.println("|||||||||||||||||"+ studentOptionalMin);
}

	public static void main(String args[]) {
		
		//groupByGender();
		//groupByCustomised();
		
		twoLevelGrouping_1();
		
		twoLevelGrouping_2();
		
		threeArgumentGroupBy();
		calCulateTopGPA();
		
		calCulateLeastGPA();
	}
}
