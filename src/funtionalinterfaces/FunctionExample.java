package funtionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

	static Function <String,String> func = (name)-> name.toUpperCase();
	
	static Function <String,String> addSomeString = (name)-> name+"default";
	
	public static void main(String args[]) {
		
		System.out.println("using only single function");
		System.out.println("Result is:" +func.apply("Java8"));
		System.out.println("-----------------------------------");
		System.out.println("Using multiple functions using addSomething and apply");
		System.out.println("Result is "+func.andThen(addSomeString).apply("Java9:"));
	
		
	}
	
}
