package com.pattern.core.proxy;

public class ProxyDBData implements ImageInterface {
	
	private DBData dbData;
	private String dbName;
	
	

	public ProxyDBData(String dbName) {
		this.dbName = dbName;
	}



	@Override
	public void display() {
		if(this.dbData==null)
			dbData=new DBData(dbName);
		
		dbData.display();

	}

}
