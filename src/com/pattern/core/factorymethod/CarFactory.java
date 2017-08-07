package com.pattern.core.factorymethod;


public class CarFactory {
	
	   //use getShape method to get object of type shape 
	   public CarInterface getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equals("RCAR")){
	         return new RaceCar();
	         
	      } else if(shapeType.equals("TRUCK")){
	         return new Truck();
	         
	      } else if(shapeType.equals("ACAR")){
	         return new AmbulanceCar();
	      }
	      
	      return null;
	   }
	}
