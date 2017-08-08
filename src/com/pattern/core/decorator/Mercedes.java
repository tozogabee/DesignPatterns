package com.pattern.core.decorator;

import com.pattern.core.decorator.CarInterface;

public class Mercedes implements CarInterface {

	@Override
	public void writeoutProperties() {
		System.out.println("Type: Mercedes");
		
	}

	
}
