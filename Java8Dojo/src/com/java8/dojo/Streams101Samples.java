package com.java8.dojo;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;


/*
 * Java 8 Dojo
 	Streams: 
 		
 		An abstraction - a view on to immutable collections, without the fluff of explicit iterations, messy mutations, concurrency headaches, ..
		Collections are about data, streams are about computations
		Streams let you say what not how 
		Streams have a bynch of *higher order function* - 
			that themselves take Lambdas as arguments
		no more explicit, hand-coded iteration, aka "external iteration"
		do not need all data in memory
		no more looping and modifying data - streams work on immutable data
		no more difficult concurrency challenges

	Flowing with Streams:
		Get your Stream from Array | Collection | IOStream | Files | InifiniteGenerated
			.stream()
			File.lines(...)
6			Stream.iterate(), 
			Stream.generate(S)
		Apply 0 or more Lazy Non Terminal Operations
4			filter (P)
5			map (F)
			flatMap()
			limit (n)
		Apply a Terminal Operation
3			allMatch(P)
			anyMatch(P)
1			forEach(C)     
			summaryStatistics()	
			collect(Collectors.toList)
2			collect(Collectors.groupingBy( P ? : )
8			reduce (F) - note this returns an optional
			sorted()
		Predicates  (and F, C, S) 
7			can be chained, and passed around
 */

public class Streams101Samples {

	@Test
	public void streams101() {		
		List<Integer> input = Arrays.asList(1, 2, 3);
		System.out.println(input.stream().reduce((i,j) -> i + j ) );
		
		Stream.iterate( 0, i -> i+1 ).limit(10).forEach( System.out::println);
	}

}
