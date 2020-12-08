package funtionalinterfaces;

public class FunctionExample1 {

	public static void performConcat(String str) {
		
		
		System.out.println(FunctionExample.addSomeString.apply(str));
	}
	
	public static void main(String[] args) {
		
		new	FunctionExample1().performConcat("Suck: ");
		
	}

}
