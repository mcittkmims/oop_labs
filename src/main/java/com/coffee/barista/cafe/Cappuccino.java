package com.coffee.barista.cafe;

import com.coffee.enums.Intensity;

class Cappuccino extends Coffee {
    
    private int mlOfMilk;

    private final String name = "Cappuccino";

    Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;

    }
    
    // Getters and setters
    int getMlOfMilk(){
        return mlOfMilk;
    }

    void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    // Print Cappucino Details
    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Milk: " + this.mlOfMilk + " ml");
    }

    @Override
    protected Coffee makeCoffee() {
        System.out.println("Intensity set to " + this.getIntensity());
        return this;
    }
    
    // Make Cappuccino
    Cappuccino makeCappuccino() {
        System.out.println("Making " + this.name);
        makeCoffee();
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        return this;
    }

}
