package com.pattern.runners;

import com.pattern.core.singleton.SingleObject;

public class SingletonPatternRunner {

	public static void main(String[] args) {
		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingleObject object = SingleObject.getInstance();

		// show the message
		object.showMessage();
		object.showYourName();
	}

}
