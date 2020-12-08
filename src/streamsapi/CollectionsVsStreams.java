package streamsapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

	public static void main(String args[]) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Jim");
		names.add("Adam");
		names.add("Jenny");

		for (String name : names) {
			System.out.println(name);
		}
		for (String name : names) {
			System.out.println(name);
		}
		names.remove(0);

		System.out.println(names);
			
		
		Stream<String> nameStream= names.stream();
		nameStream.forEach(System.out::println);
		nameStream.forEach(System.out::println)
		;
		
		// Streams doesnt have add/remove method hence proving that stream objects cant
		// be modified.
		// Streams can only be accessed in sequence, it is not possible to get an object
		// using get.
		// Streams are lazily constructed which means without the terminal opration such
		// as collect it will not return any value
		// Collections can be traversed N number of times, unlike streams

	}

}
