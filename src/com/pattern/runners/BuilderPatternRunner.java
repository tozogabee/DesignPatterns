package com.pattern.runners;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import com.pattern.core.builder.Car;
import com.pattern.core.builder.Person;
import com.pattern.core.builder.Student;

public class BuilderPatternRunner {

	public static void main(String[] args) {
		  Student pumpedStudent = new Student.StudentBuilder()
					.name("mkyong")
					.age(18)
					.language(Arrays.asList("chinese","english"))
					.build();
		  
		  System.out.println(pumpedStudent);
		  
		  Car audiA8=new Car.CarBuilder()
				  		.name(Optional.of("Audi A8"))
				  		.speed(Optional.of(400))
				  		.color(Optional.of(Color.black))
				  		.gear(Optional.of(6))
				  		.persons(Optional.of(Arrays.asList(new Person("Toth Gabor",30,1))))
				  		.performance(Optional.of(380))
				  		.build();
		  
		  Car arteon=new Car.CarBuilder()
			  		.speed(Optional.of(350))
			  		.gear(Optional.of(6))
			  		.performance(Optional.of(278))
			  		.build();
		  
		  System.out.println(audiA8);
		  System.out.println(arteon);
	}

}
