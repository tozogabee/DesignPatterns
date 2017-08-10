package com.pattern.core.facade.shapes;

import com.pattern.core.facade.interfaces.ShapeInterface;

public class Diamond implements ShapeInterface {
    
    // private final static Logger logger = Logger.getLogger(Diamond.class);
    
    @Override
    public void draw() {
        System.out.println("Diamond::draw()");
        
    }
    
}
