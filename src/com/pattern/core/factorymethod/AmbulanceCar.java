package com.pattern.core.factorymethod;

public class AmbulanceCar implements CarInterface {

	   @Override
	   public void showYourself() {
	      System.out.println("Inside AmbulanceCar::showYourself() method. So I am an Ambulance Car.");
	   }
	}
