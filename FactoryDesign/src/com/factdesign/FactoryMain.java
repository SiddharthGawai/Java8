package com.factdesign;

public class FactoryMain 
{
	public static void main(String[] args) 
	{
		connection cjc = FactoryMethod.getClasses("oracle");
		cjc.commit();
		cjc.rollback();
	}
	
}
