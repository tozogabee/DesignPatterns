package com.pattern.runners;

import com.pattern.core.decorator.CarInterface;
import com.pattern.core.decorator.ColorDecorator;
import com.pattern.core.decorator.Mercedes;

import java.awt.Color;

import com.pattern.core.decorator.Audi;
import com.pattern.core.decorator.Bmw;
import com.pattern.core.decorator.RedBodyDecorator;
import com.pattern.core.decorator.SpeedDecorator;

public class DecoratorPatternRunner {

	public static void main(String[] args) {
		CarInterface audi = new Audi();
		CarInterface redAudi = new RedBodyDecorator(new Audi());
		CarInterface redBmw = new RedBodyDecorator(new Bmw());

		CarInterface bmwM550i=new SpeedDecorator(new Bmw(), 300);
		CarInterface mercedesS55AMG=new SpeedDecorator(new ColorDecorator(new Mercedes(), Color.BLACK),360);
		
		System.out.println("Audi with normal body");
		audi.writeoutProperties();

		System.out.println("\nAudi with red body");
		redAudi.writeoutProperties();

		System.out.println("\nBmw with red body");
		redBmw.writeoutProperties();
		
		System.out.println("\nBmw M550i final velocity");
		bmwM550i.writeoutProperties();
		
		System.out.println("\nMercedes S55 AMG");
		mercedesS55AMG.writeoutProperties();

	}

}
