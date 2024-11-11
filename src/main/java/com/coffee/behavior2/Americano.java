package com.coffee.behavior2;

import com.coffee.enums.Intensity;

public class Americano extends Coffee {
    private int mlOfWater;
    private final String name = "Americano";

    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity);
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
    public void printDetails() {
        super.printDetails();
        System.out.println("Water: " + this.mlOfWater + " ml");
    }


    protected Coffee makeCoffee() {
        System.out.println("Intensity set to " + this.getIntensity());
        return this;
    }

    // Make Americano
    public Americano makeAmericano() {
        System.out.println("Making " + this.name);
        makeCoffee();
        System.out.println("Adding " + this.mlOfWater + " mls of water");
        return this;
    }

}
