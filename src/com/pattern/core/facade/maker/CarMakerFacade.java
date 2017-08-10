package com.pattern.core.facade.maker;

import com.pattern.core.facade.interfaces.CarInterface;
import com.pattern.core.facade.objects.Lada;
import com.pattern.core.facade.objects.Polski;
import com.pattern.core.facade.objects.Trabant;

public class CarMakerFacade {
    
    private CarInterface lada;
    private CarInterface polski;
    private CarInterface trabant;
    
    public CarMakerFacade() {
        
        this.lada = new Lada();
        this.polski = new Polski();
        this.trabant = new Trabant();
    }
    
    public void goingAll() {
        lada.goingAsAssHole();
        polski.goingAsAssHole();
        trabant.goingAsAssHole();
    }
    
}
