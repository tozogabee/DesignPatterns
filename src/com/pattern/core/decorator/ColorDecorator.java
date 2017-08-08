package com.pattern.core.decorator;

import java.awt.Color;

public class ColorDecorator extends CarDecorator {

	Color color;
	
	public ColorDecorator(CarInterface decoratedCar,Color color) {
		super(decoratedCar);
		this.color=color;		
	}
	
	@Override
	public void writeoutProperties() {
	      decoratedCar.writeoutProperties();	       
	      setColorBody(decoratedCar);
	   }

	   private void setColorBody(CarInterface decoratedShape){
	      System.out.println("Body Color: "+this.color);
	   }

}
