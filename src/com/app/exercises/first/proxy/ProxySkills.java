package com.app.exercises.first.proxy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.app.exercises.first.interfaces.SkillsInterface;

public class ProxySkills implements SkillsInterface {
    
    private Properties inputFile;
    private InputStream input;
    
    public ProxySkills() {
        try {
            input = new FileInputStream("skills.txt");
            inputFile.load(input);
        }
        catch (IOException e) {
            
        }
    }
    
    @Override
    public void getSkills() {
        // TODO Auto-generated method stub
        
    }
    
}
