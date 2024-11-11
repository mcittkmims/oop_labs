package com.coffee.barista.cafe;

import com.coffee.enums.Intensity;

class Americano extends Coffee{
    private int mlOfWater;
    private final String name = "Americano";


    Americano(Intensity intensity, int mlOfWater) {
        super(intensity);
        this.mlOfWater = mlOfWater;

    }

    // Getters and setters
    int getMlOfWater() {
        return mlOfWater;
    }

    void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }
    
    // Print Americano Details
    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Water: " + this.mlOfWater + " ml");
    }

    @Override
    protected Coffee makeCoffee() {
        System.out.println("Intensity set to " + this.getIntensity());
        return this;
    }

    // Make Americano
    Americano makeAmericano() {
        System.out.println("Making " + this.name);
        makeCoffee();
        System.out.println("Adding " + this.mlOfWater + " mls of water");
        return this;
    }

}
