package com.pattern.runners;

import com.pattern.core.proxy.ImageInterface;
import com.pattern.core.proxy.ProxyDBData;
import com.pattern.core.proxy.ProxyImage;

public class ProxyPatternRunner {

	public static void main(String[] args) {
		ImageInterface image = new ProxyImage("testImage.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
		
		ImageInterface db=new ProxyDBData("Oracle");
		db.display();
		System.out.println("\n\n");
		db.display();
		
		
	}

}
