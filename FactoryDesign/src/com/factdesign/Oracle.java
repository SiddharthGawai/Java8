package com.factdesign;

public class Oracle implements connection
{

	@Override
	public void commit() {
		System.out.println("Oracle commit");
		
	}

	@Override
	public void rollback() {
		System.out.println("Oracle rollback");
		
	}
	
}
