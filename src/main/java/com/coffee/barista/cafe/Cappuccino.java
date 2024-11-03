package com.coffee.barista.cafe;

import com.coffee.enums.Intensity;

class Cappuccino extends Coffee {
    
    private int mlOfMilk;

    Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;

    }
    
    protected Cappuccino(Intensity intensity, int mlOfMilk, String name) {
        super(intensity, name);
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

    // Make Cappuccino
    Cappuccino makeCappuccino() {
        super.makeCoffee();
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        return this;
    }

}
