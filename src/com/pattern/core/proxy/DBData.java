package com.pattern.core.proxy;

public class DBData implements ImageInterface {
	
	private String DBName;
	
	
	public DBData(String DBName)
	{
		this.DBName=DBName;
		loadFromDB(DBName);
	}

	@Override
	public void display() {
		System.out.println("Displaying the "+this.DBName);
	}
	
	private void loadFromDB(String DBName)
	{
		System.out.println("Loading data from "+DBName+" database");
	}

}
