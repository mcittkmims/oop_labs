package com.coffee.barista.cafe;

import com.coffee.enums.Intensity;

abstract class Coffee {
    private Intensity intensity;
    private final String name;

    

    protected Coffee(Intensity intensity, String name) {
        this.intensity = intensity;
        this.name = name;
    }

    // Getters and setters
    Intensity getIntensity() {
        return intensity;
    }

    void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }
    
    String getName() {
        return name;
    }

    // Print Coffee details
    void printDetails() {
        System.out.println("Coffee intensity: " + this.intensity);
    }

    // Make Coffee
    protected Coffee makeCoffee() {
        System.out.println("Making " + this.name);
        System.out.println("Intensity set to " + this.intensity);
        return this;
    }
}