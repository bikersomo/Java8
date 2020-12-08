package funtionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	static Predicate<Integer> p1 = (a)-> {return a%2==0;};
	static Predicate<Integer> p2 = (a)-> a%2==0;
	static Predicate<Integer> p3 = (a)-> a%5==0;
	
	public static void predicateAnd() {
		
		System.out.println("Predicate and the result is: "+p2.and(p3).test(10));
		System.out.println("Predicate and the result is: "+p2.and(p3).test(8));
	}
	
public static void predicateOr() {
		
		System.out.println("Predicate and the result is: "+p2.or(p3).test(10));
		System.out.println("Predicate and the result is: "+p2.or(p3).test(8));
	}

public static void predicateNegate() {
	
	System.out.println("Predicate and the result is: "+p2.or(p3).negate().test(10));
	System.out.println("Predicate and the result is: "+p2.or(p3).negate().test(8));
}


	public static void main(String args[]) {
		
		
		System.out.println("Result is "+p1.test(20));
		
		System.out.println("Result is "+p2.test(20));
		
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
