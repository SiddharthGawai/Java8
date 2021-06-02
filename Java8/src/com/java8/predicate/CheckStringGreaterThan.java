package com.java8.predicate;

import java.util.function.Predicate;

public class CheckStringGreaterThan {

	public static void main(String[] args) 
	{
		String[] s = {"AAA","BBBB","Siddharth","Sunny","Suresh","Durga"};
		
		/*
		Predicate<String> p = s1->s1.length()>5;
		for(String s2:s)
		{
			if(p.test(s2))
			{
				System.out.println(s2);
			}
		}
		*/
		
		/*check the string is even or not*/
		
		Predicate<String> p1 = s1->s1.length()%2==0;
		for(String s2:s)
		{
			if(p1.test(s2))
			{
				System.out.println(s2);
			}
		}
		
	}

}
