package com.coffee.relations.classes;

import com.coffee.relations.enums.Intensity;

public class Coffee {
    private Intensity intensity;
    private final String name;

    

    protected Coffee(Intensity intensity, String name) {
        this.intensity = intensity;
        this.name = name;
    }
    
    public Coffee(Intensity intensity) {
        this.intensity = intensity;
        this.name = "Coffee";
    }

    // Getters and setters
    public Intensity getIntensity() {
        return intensity;
    }

    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }
    
    public String getName() {
        return name;
    }
}
