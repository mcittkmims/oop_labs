package com.coffee.behavior1;

import com.coffee.enums.Intensity;

public class Americano extends Coffee{
    private int mlOfWater;
    private final String name = "Americano";


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

}
