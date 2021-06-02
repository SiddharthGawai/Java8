package com.java8.consumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentTestUsingFuncPredicateConsumer {

	public static void main(String[] args) 
	{
		Function<Studentt, String>f=s->{
			int marks = s.marks;
			String grade="";
			if(marks>=80)grade="A[Dictinction]";
			else if(marks>=60)grade="B[FirstClass]";
			else if(marks>=50)grade="C[SecondClass]";
			else grade="E[Failed]";
			
			return grade;
		};
		
		Predicate<Studentt> p=s->s.marks>=60;
		Consumer<Studentt>c=s1->
		{
			System.out.println("Student Name:"+s1.name);
			System.out.println("Student Marks:"+s1.marks);
			System.out.println("Student Grade:"+f.apply(s1));
			System.out.println();
		};
		
		Studentt[] s = {new Studentt("Mayur", 95),
				new Studentt("Rahul", 65),
				new Studentt("Sunny", 55),
				new Studentt("Sagar", 45),
				new Studentt("Vinny", 25)
		};
		
		for(Studentt s1:s)
		{
			if(p.test(s1))
			{
			c.accept(s1);
			}
		}
	}
	

	

}
