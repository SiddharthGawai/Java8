package com.factdesign;

public class MySql implements connection
{

	@Override
	public void commit() {
		System.out.println("Mysql commit");
		
	}

	@Override
	public void rollback() {
		System.out.println("Mysql rollback");
		
	}
	
}
