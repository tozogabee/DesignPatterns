package com.pattern.core.builder;

import java.awt.Color;
import java.util.List;
import java.util.Optional;

public class Car {
	
	private Optional<String> name;
	private Optional<Integer> speed;
	private Optional<Color> color;
	private Optional<Integer> gear;
	private Optional<List<Person>> persons;
	private Optional<Integer> performance;
	
	private Car(CarBuilder builder)
	{
		this.name=builder.name;
		this.speed=builder.speed;
		this.color=builder.color;
		this.gear=builder.gear;
		this.persons=builder.persons;
		this.performance=builder.performance;
	}

	
	
	



	@Override
	public String toString() {
		return "Car [name=" + name + ", speed=" + speed + ", color=" + color + ", gear=" + gear + ", persons=" + persons
				+ ", performance=" + performance +"LE"+"]";
	}







	public static class CarBuilder
	{
		private Optional<String> name;
		private Optional<Integer> speed;
		private Optional<Color> color;
		private Optional<Integer> gear;
		private Optional<List<Person>> persons;
		private Optional<Integer> performance;
		
		public CarBuilder name(Optional<String> name)
		{
			this.name=name;
			if(!this.name.isPresent())
				System.out.println("Missing name property");
			return this;
		}
		
		public CarBuilder speed(Optional<Integer> speed)
		{
			this.speed=speed;
			if(!this.speed.isPresent())
				System.out.println("Missing speed property");
			return this;
		}
		
		public CarBuilder color(Optional<Color> color)
		{
			this.color=color;
			if(!this.color.isPresent())
				System.out.println("Missing color property");
			return this;
		}
		
		public CarBuilder gear(Optional<Integer> gear)
		{
			this.gear=gear;
			if(!this.gear.isPresent())
				System.out.println("Missing gear property");
			return this;
		}
		
		public CarBuilder persons(Optional<List<Person>> persons)
		{
			this.persons=persons;
			if(!this.persons.isPresent())
				System.out.println("Missing persons property");
			return this;
		}
		
		public CarBuilder performance(Optional<Integer> performance)
		{
			this.performance=performance;
			if(!this.performance.isPresent())
				System.out.println("Missing performance property");
			return this;
		}
		
		public Car build()
		{
			return new Car(this);
		}
		
		
		
		
	}

}
