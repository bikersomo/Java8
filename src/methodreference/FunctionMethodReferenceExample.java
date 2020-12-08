package methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	public static Function<String,String> toUpperCaseLamda = (s)-> s.toUpperCase();
	
	
	// Method Reference is another way to represent lambda expressions where 
	// a class's method can be called by the below example.
	// Class String has toUpperCase method, hence it can be written in that way.
	
	public static Function<String,String> toUpperCaseLamdaMethodRef = String::toUpperCase;
	
	public static void main(String args[]) {
		
		System.out.println(toUpperCaseLamda.apply("java8"));
		
		System.out.println(toUpperCaseLamdaMethodRef.apply("java8"));
	}
}
