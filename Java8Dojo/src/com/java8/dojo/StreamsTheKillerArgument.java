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

import org.junit.Before;
import org.junit.Test;

import com.java8.dojo.support.Person;


/*
 * Java 8 Dojo
 	Streams: 

	Flowing with Streams:
		Get your Stream from Array | Collection | IOStream | Files | InifiniteGenerated
			.stream()
			File.lines(...)
			Stream.iterate(), 
			Stream.generate(S)
		Apply 0 or more Lazy Non Terminal Operations
			filter (P)
			map (F)
1			flatMap()
			limit (n)
1			distinct()
2			parallel()
		Apply a Terminal Operation
			allMatch(P)
			anyMatch(P)
			forEach(C)     
			summaryStatistics()	
			collect(Collectors.toList)
			collect(Collectors.groupingBy( P ? : )
			reduce (F) - note this returns an optional

		Predicates  (and F, C, S) 
			can be chained, and passed around
 */

public class StreamsTheKillerArgument {

	List<Person> persons;
	
	@Before	
	public void setUp(){
		Person p1 = new Person("Jack", 31, true, "Sailing", "Cycling");
		Person p2 = new Person("Benjamin", 12, true, "Playing Piano");
		Person p3 = new Person("Suse", 37, false, "Sailing", "Swimming");
		Person p4 = new Person("R2D2", 37, false, "KillingPeople", "Drinking");
		Person p5 = new Person("Spock", 37, false, "Saying Live long and prosper", "Beaming");
		persons = Arrays.asList(p1, p2, p3, p4, p5);
	}
	
	
	@Test
	public void streams101() {			
		
		persons.stream().flatMap( p -> p.getHobbies().stream() ).distinct().forEach(System.out::println);
		
		System.out.println(persons.stream().parallel().map( Person::findReactionTimeMS).reduce( (a,b) -> a + b) );
		
//		.flatMap( Person::getHobbies ).distinct().forEach(Sys)
		
		persons.stream()
				.filter( (Person p) -> p.isMale())
				.forEach( p -> System.out.println(p));
		
		
		
		
	}

}
