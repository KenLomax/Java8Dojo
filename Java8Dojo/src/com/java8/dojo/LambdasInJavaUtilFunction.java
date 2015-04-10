package com.java8.dojo;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;


/*
 * Java 8 Dojo
 * https://docs.oracle.com/javase/8/docs/api/ - java.util.function contains many new FunctionalInterfaces
 * 4 types: Supplier, Producer, Function, Predicate - we need to know these and how to express them with Lambdas - because STREAMS use these
 * Try it
 */

public class LambdasInJavaUtilFunction {

	@Test
	public void testSortStringsWithAIAndLambdas() {		
		Consumer c = new Consumer(){
			@Override
			public void accept(Object t) {
				// Do something..
				System.out.println("Boo"+t); 
			}
		};
		c = (t) -> System.out.println("Boo"+t);
		
		Supplier<String> s = new Supplier<String>(){
			@Override
			public String get() {
				return "Hi there";
			}
		};
		s = () -> "Hi there";
		
		Function<Integer, Integer> f = new Function<Integer, Integer>(){
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		};
		f = (a) -> a* a; 
		
		Predicate<Integer> p= new Predicate<Integer>(){
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			}
		};
		p = (a)->a%2==0;

	}

}
