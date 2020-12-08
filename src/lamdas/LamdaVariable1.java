package lamdas;

import java.util.function.Consumer;

public class LamdaVariable1 {
	
	public static void main(String args[]) {

		int i = 0;
		// can't use the same i variable like we can in the case of a regular java method.
		// we need to consider taking a new local variable in a lambda.
		Consumer<Integer> c1 = (i1)->{
			System.out.println("Value is : "+i);
		};
		
	}

}
