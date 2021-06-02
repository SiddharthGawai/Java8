package com.java8.function;

import java.util.function.Function;

public class StudentTest {

	public static void main(String[] args) 
	{
		Function<Student, String>f=s->{
			int marks = s.marks;
			String grade="";
			if(marks>=80)grade="A[Dictinction]";
			else if(marks>=60)grade="B[FirstClass]";
			else if(marks>=50)grade="C[SecondClass]";
			else grade="E[Failed]";
			
			return grade;
		};
		
		Student[] s = {new Student("Siddharth",100),
				new Student("Sunny",65),
				new Student("Bunny",55),
				new Student("Bunny",45),
				new Student("Bunny",25),
		};
		
		for(Student s1:s)
		{
			System.out.println("Student Name:"+s1.name);
			System.out.println("Student Marks:"+s1.marks);
			System.out.println("Student Grade:"+f.apply(s1));
			System.out.println();
		}
	}

}
