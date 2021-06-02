package com.factdesign;

public class FactoryMethod 
{
	public static connection  getClasses(String classtype)
	{
		if(classtype=="null")
		{
			System.out.println("Class not available");
			return null;
		}
		else if (classtype.equalsIgnoreCase("mysql"))
		{
			return new MySql();
		}
		else if (classtype.equalsIgnoreCase("oracle"))
		{
			return new Oracle();
		}
		return null;
	}
}
