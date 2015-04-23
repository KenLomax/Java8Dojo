package com.java8.lunchtalk;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

import com.java8.dojo.support.Person;

public class Java8LovelyFunctionalCode {

	/**
	 * Streams are an abstraction above Collections, that take:
	 *    perhaps a sequence LAZY operations and
	 *    one final operation
	 */
		
	@Test
	public void modifyingDataToUpperCase() {
		// Get the Data
		Stream<String> myData = Stream.of("i", "love", "icke");
		
		// Do something with the Data
		List<String> myModifiedData = null;
		
		// Check the answer
		assertEquals(myModifiedData, Arrays.asList("I", "LOVE", "ICKE"));
	}

	@Test
	public void filteringData() {
		// Get the Data
		Stream<String> myData = Stream.of("lin", "cant", "play", "football");
		
		// Do something with the Data
		List<String> myModifiedData = null;

		
		// Check the answer
		assertEquals(myModifiedData, Arrays.asList("cant", "play" , "football"));
	}

	/**
	 * Look at the Stream Flow Table and use that as a guideline
	 */

	@Test
	public void toLowerCaseAndThenFilter() {
		// Get the Data
		Stream<String> myData = Stream.of("Angela", "Merkel", "Is","Sexy");
		
		// Do something with the Data
		List<String> myModifiedData = null;

		
		// Check the answer
		assertEquals(myModifiedData, Arrays.asList("angela","merkel","sexy"));
	}

	@Test
	public void sortingData() {
		// Get the Data
		List<String> myList = Arrays.asList("lilits", "beautiful", "green", "piggy");
		Stream<String> myData = myList.stream();
		
		// Do something with the Data
		List<String> myModifiedData = null;

		// Check the answer
		assertEquals(myModifiedData, Arrays.asList("piggy", "lilits", "green", "beautiful"));
	}

	@Test
	public void aggregatingDataCheckAllAreOdd() {
		// Get the Data
		List<Integer> myList = Arrays.asList(1, 3, 5, 7, 9, 12);
		Stream<Integer> myData = myList.stream();

		// Do something with the Data
		boolean allOdd = true;
		
		// Check the answer
		assertFalse(allOdd);	
	}
	
	@Test
	public void aggregatingDataIntoEvenAndOdd() {
		// Get the Data
		List<Integer> myList = Arrays.asList(1, 3, 5, 7, 9, 12);
		Stream<Integer> myData = myList.stream();

		// Do something with the Data
		Map m = null;
		
		// Check the answer
		assertEquals(m.get("odd"), Arrays.asList(1,3,5,7,9));
		assertEquals(m.get("even"), Arrays.asList(12));
	}

	@Test 
	public void summingACollection(){
		// Get the Data
		List<Integer> myData = Arrays.asList(1, 3, 5, 7, 9, 12);
		
		// Do something with the Data
		int total = 0;
		
		// Check the answer
		assertEquals( total, 37 );
		
	}

	/////////////////////////////////////////////////////////
	// What's going on?
	// Flowing with Streams - Get, Lazy Ops, Terminal Ops..
	// The 4 Types of math functions we can apply to Streams
	// Functional Interfaces, compiler, Lambdas
	// Lazy non terminal methods
	/////////////////////////////////////////////////////////
	
	@Test
	public void infiniteStreams(){
		// Get an infinite Stream (no out of memory, no taking for ever..)
		//  Stream.iterate( 0, a->a+1 ).		
		fail();		// To implement

		// Lazy functions 
		
		// Peeks
		
		// Combining and passing Predicates...
	}
	
	@Test 
	public void summaryStats(){
		fail();		// To implement
	}
	
	@Test 
	public void debuggingLazinessWithPeak(){ // See these lazy bastards in action
		fail();		// To implement
	}
	
	@Test
	public void someThingWithFlatMap(){	
		Stream.of( 
				new Person("Jack", 31, true, "Sailing", "Cycling"),
				new Person("Benjamin", 12, true, "Playing Piano"),
				new Person("Suse", 37, false, "Sailing", "Swimming")
				); 
		fail();		// To implement
	}
	
	
	@Test
	public void parallelStreams(){ // The killer argument

		System.out.println( Stream.of( 
				new Person("Jack", 31, true, "Sailing", "Cycling"),
				new Person("Benjamin", 12, true, "Playing Piano"),
				new Person("Suse", 37, false, "Sailing", "Swimming")
				).
				map(p -> p.findReactionTimeMS()).
				reduce(0l,(x,y)->x+y)
		);
		fail();		// To implement

	}
	
}
