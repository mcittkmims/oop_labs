package com.coffee.behavior1;

import com.coffee.enums.Intensity;

public class Coffee {
    private Intensity intensity;
    private final String name = "Coffee";

    protected Coffee(Intensity intensity) {
        this.intensity = intensity;
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

    // Print Coffee details
    public void printDetails() {
        System.out.println("Coffee intensity: " + this.intensity);
    }
}
