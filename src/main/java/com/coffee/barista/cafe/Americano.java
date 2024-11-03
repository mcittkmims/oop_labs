package com.coffee.barista.cafe;

import com.coffee.enums.Intensity;

class Americano extends Coffee{
    private int mlOfWater;


    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity, "Americano");
        this.mlOfWater = mlOfWater;

    }

    // Getters and setters
    public int getMlOfWater() {
        return mlOfWater;
    }

    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }
    
    // Print Americano Details
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Water: " + this.mlOfWater + " ml");
    }

    // Make Americano
    public Americano makeAmericano() {
        super.makeCoffee();
        System.out.println("Adding " + this.mlOfWater + " mls of water");
        return this;
    }

}
