package funtionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryExample {

	
    static UnaryOperator<String> unaryTest = (st1)-> st1.concat(" :Hello");
	public static void main(String[] args) {
		
		System.out.println(unaryTest.apply("Canada"));
	}

}
