package com.coffee.behavior2;

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
    public void printDetails() {
        super.printDetails();
        System.out.println("Milk: " + this.mlOfMilk + " ml");
    }


    protected Coffee makeCoffee() {
        System.out.println("Intensity set to " + this.getIntensity());
        return this;
    }

    // Make Cappuccino
    public Cappuccino makeCappuccino() {
        System.out.println("Making " + this.name);
        makeCoffee();
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        return this;
    }

}