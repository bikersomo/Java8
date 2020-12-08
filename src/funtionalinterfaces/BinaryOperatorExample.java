package funtionalinterfaces;

import java.util.Comparator;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	public static Comparator<Integer> compareInteger = (a,b) -> a.compareTo(b);
	
	public static BinaryOperator<Integer>binaryOperator = (number1,number2)->{
		return(number1*number2);
	};
	
	static	BinaryOperator<Integer>binaryOperatormax = (num1,num2)->
		BinaryOperator.maxBy(compareInteger).apply(num1, num2);
	
		static	BinaryOperator<Integer>binaryOperatormin = (num1,num2)->
		BinaryOperator.minBy(compareInteger).apply(num1, num2);
	
	
	
	// Both approached will work
	//static BinaryOperator<Integer>binaryOperator = (number1,number2)-> number1* number2;
	

	public static void main(String[] args) {
		
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		Integer number1 = scan.nextInt();
		Integer num2 = scan.nextInt();
		System.out.println("Multiplied value is: "+binaryOperator.apply(number1, num2));
		System.out.println("Max value is: "+binaryOperatormax.apply(number1, num2));
		System.out.println("Min value is: "+binaryOperatormin.apply(number1, num2));
		scan.close();
		
	}

}
