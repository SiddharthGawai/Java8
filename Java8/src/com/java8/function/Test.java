package com.java8.function;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) 
	{
		/*
	Function<Integer, Integer>f=i->i*i;
	
	System.out.println(f.apply(4));
	System.out.println(f.apply(5));
	*/
	
		/*
	Function<String, Integer>f=s->s.length();
	System.out.println(f.apply("Siddharth"));
	*/
		
	Function<String, String>f=s->s.toUpperCase();
	System.out.println(f.apply("siddharth_gawai"));
	
	}

}
