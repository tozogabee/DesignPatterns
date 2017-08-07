package com.pattern.core.factorymethod;

public class Truck implements CarInterface {

	   @Override
	   public void showYourself() {
		   System.out.println("Inside AmbulanceCar::showYourself() method. So I am a Truck.");
	   }
	}
