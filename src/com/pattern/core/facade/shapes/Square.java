package com.pattern.core.facade.shapes;

import com.pattern.core.facade.interfaces.ShapeInterface;

public class Square implements ShapeInterface {

	   @Override
	   public void draw() {
	      System.out.println("Square::draw()");
	   }

}
