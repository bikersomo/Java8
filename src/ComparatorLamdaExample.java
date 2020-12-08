import java.util.Comparator;

public class ComparatorLamdaExample {

	public static void main(String args[]) {
		
		
		Comparator<Integer>comaprator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer arg0, Integer arg1) {
				
				return arg0.compareTo(arg1);
			}
		};
		System.out.println("Result of comparator is :"+comaprator.compare(3, 2));
		
		Comparator<Integer>compLambda =(Integer a, Integer b)-> a.compareTo(b);
		System.out.println("Result of comparatorLamda is :"+compLambda.compare(3, 2));
		//NO need to even mention datatype
		Comparator<Integer>compLambda2ndExample =( a,  b)-> a.compareTo(b);
		System.out.println("Result of compLambda2ndExample is :"+compLambda2ndExample.compare(3, 2));
	}
}
