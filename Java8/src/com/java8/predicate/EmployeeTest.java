package com.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Siddharth", 1000));
		l.add(new Employee("Durga", 2000));
		l.add(new Employee("Shiva", 4000));
		l.add(new Employee("Ravi", 5000));
		l.add(new Employee("Adrash",6000));
		l.add(new Employee("Sagar", 3000));
		
		Predicate<Employee> p=e1->e1.salary>3000;
		for(Employee e1:l)
		{
			if(p.test(e1))
			{
				System.out.println(e1.name+":"+e1.salary);
			}
		}
	}

}
