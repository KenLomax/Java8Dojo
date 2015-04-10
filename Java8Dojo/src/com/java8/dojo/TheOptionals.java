package com.java8.dojo;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

/*
 * Helps design more-comprehensible APIs so that by just reading the signature of a method, you can tell whether you can expect an optional value. 
 */
public class TheOptionals  {

	@Test
	public void optionals(){
		
		Optional<String> optional = Optional.of("bam");

		assertTrue( optional.isPresent() );           // true
		assertEquals( "bam", optional.get()) ;                 // "bam"
		assertEquals( "bam",  optional.orElse("fallback"));    // "bam"

	}

}
