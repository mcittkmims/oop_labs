package com.coffee.barista.cafe;

import com.coffee.enums.Intensity;

class Cappuccino extends Coffee {
    
    private int mlOfMilk;

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;

    }
    
    protected Cappuccino(Intensity intensity, int mlOfMilk, String name) {
        super(intensity, name);
        this.mlOfMilk = mlOfMilk;

    }

    // Getters and setters
    public int getMlOfMilk(){
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

    // Make Cappuccino
    public Cappuccino makeCappuccino() {
        super.makeCoffee();
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        return this;
    }

}
