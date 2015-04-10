package com.java8.dojo;

import static org.junit.Assert.*;

import org.junit.Test;


/*
 * Default methods allow for old APIs to be modified without breaking backwards compatibility - eg Java8's java.util.Collection addition of Stream()
 * Allows Multiple Inheritance of Behaviour
 * Diamond inheritance problem is still caught by the compiler
 * Class' method overrides interface implementations
 */
public class UberInterface implements SomeInterface {

	@Override
	public String sayHi(){
		return "Burp";
	}
	
	
	@Test
	public void hiThere(){
		SomeInterface ui = new UberInterface();
		assertEquals( "Hi", ui.sayHi()	);
	}

}

// Provides more room for backwards compatibility and for multiple inheritance
interface SomeInterface {
	default String sayHi() {
		return "Hi";
	}
	
}
