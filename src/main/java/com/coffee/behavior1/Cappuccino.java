package com.coffee.behavior1;

import com.coffee.enums.Intensity;

public class Cappuccino extends Coffee {
    
    private int mlOfMilk;

    private final String name = "Cappuccino";

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;

    }

    // Getters and setters
    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    // Print Cappucino Details
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Milk: " + this.mlOfMilk + " ml");
    }

}
