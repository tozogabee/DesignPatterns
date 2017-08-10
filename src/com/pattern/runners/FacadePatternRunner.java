package com.pattern.runners;

import com.pattern.core.facade.maker.CarMakerFacade;
import com.pattern.core.facade.maker.ShapeMakerFacade;

public class FacadePatternRunner {
    
    public static void main(String[] args) {
        ShapeMakerFacade shapeMaker = new ShapeMakerFacade();
        CarMakerFacade carMaker = new CarMakerFacade();
        /*
         * shapeMaker.drawCircle(); shapeMaker.drawRectangle(); shapeMaker.drawSquare();
         */
        shapeMaker.drawAll();
        carMaker.goingAll();
    }
    
}
