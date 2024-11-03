package com.coffee.barista.cafe;

import com.coffee.enums.Intensity;

class Americano extends Coffee{
    private int mlOfWater;


    Americano(Intensity intensity, int mlOfWater) {
        super(intensity, "Americano");
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

    // Make Americano
    Americano makeAmericano() {
        super.makeCoffee();
        System.out.println("Adding " + this.mlOfWater + " mls of water");
        return this;
    }

}
