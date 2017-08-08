package com.pattern.core.decorator;

import com.pattern.core.decorator.*;

public class SpeedDecorator extends CarDecorator {

	private int speed;
	
	public SpeedDecorator(CarInterface decoratedCar,int speed) {
		super(decoratedCar);
		this.speed=speed;
	}
	
	@Override
	   public void writeoutProperties() {
	      decoratedCar.writeoutProperties();	       
	      setSpeedBody(decoratedCar);
	   }

	   private void setSpeedBody(CarInterface decoratedShape){
	      System.out.println("Final speed is "+speed);
	   }
	

	

}
