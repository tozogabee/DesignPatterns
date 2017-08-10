package com.pattern.core.abstractfactory;

// create a MacOSXWindow
public class MacOSXWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MacOSXWindow();
        
    }
    
}
