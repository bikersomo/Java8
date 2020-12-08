package lamdas;

import java.util.function.Consumer;

public class LambdaVariable2v {

	static int value;
	public static void main(String[] args) {

		Consumer <Integer> varableCon = (i)->{
			value++;
	//		value++; --- will throw complier error , local variables cant be accessed from lambda
			// only instance variable/class variable can be accessed from lambda expresion
			
			System.out.println(i+value);
		};
		
		varableCon.accept(5);
	}

}
