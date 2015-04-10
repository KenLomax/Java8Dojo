package com.java8.dojo;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;


/*
 * Java 8 Dojo
 * @FunctionalInterfaces are important - what are they
 * AnonymousInnerclasses of FIs - uncessary ceremony - get rid of the fluff with Lambdas and let the compiler infer everything
 * Lambdas: whenever you are about to implement and anonymous innerclaas for an FunctionalInterface write a Labda instead
 * This is just syntactic sugar: Lambdas saves typing
 * Try it 
 */

public class AnonInnerClassesFIAndLambdas {

	@FunctionalInterface
	interface MyInterface {
		public boolean doSomething();
	}
	
	@Test
	public void testSortStringsWithAIAndLambdas() {
		List<String> names = Arrays.asList(  "dd", "a", "bbb", "c");
		
		/*Collections.sort( names, new Comparator<String>(){
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});*/
	
		//Collections.sort ( names, (String a, String b) -> { return a.compareTo(b); });
		//Collections.sort (names, (String a, String b) -> a.compareTo(b) );
		Collections.sort (names, (a,b) -> a.compareTo(b) );
		
		assertEquals( names,  Arrays.asList( "a", "bbb",  "c", "dd" ) );
	}

}
