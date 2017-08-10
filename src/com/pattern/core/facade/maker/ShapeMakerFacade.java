package com.pattern.core.facade.maker;

import com.pattern.core.facade.interfaces.ShapeInterface;
import com.pattern.core.facade.shapes.Circle;
import com.pattern.core.facade.shapes.Diamond;
import com.pattern.core.facade.shapes.Rectangle;
import com.pattern.core.facade.shapes.Square;

public class ShapeMakerFacade {
    private ShapeInterface circle;
    private ShapeInterface rectangle;
    private ShapeInterface square;
    private ShapeInterface diamond;
    
    public ShapeMakerFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        diamond = new Diamond();
    }
    
    public void drawAll() {
        circle.draw();
        rectangle.draw();
        square.draw();
        diamond.draw();
    }
    
    public void drawCircle() {
        circle.draw();
    }
    
    public void drawRectangle() {
        rectangle.draw();
    }
    
    public void drawSquare() {
        square.draw();
    }
    
    public void drawDiamond() {
        diamond.draw();
    }
    
}
