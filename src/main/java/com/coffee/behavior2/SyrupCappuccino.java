package com.coffee.behavior2;

import com.coffee.enums.*;

public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;
    private final String name = "SyrupCappuccin";

    public SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(intensity, mlOfMilk);
        this.syrup = syrup;
    }

    // Getters and setters
    public SyrupType getSyrup() {
        return syrup;
    }

    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    // Print Cappucino Details
    public void printDetails() {
        super.printDetails();
        System.out.println("Syrup: " + this.syrup);
    }

    public Cappuccino makeCappuccino() {
        makeCoffee();
        System.out.println("Adding " + this.getMlOfMilk() + " mls of milk");
        return this;
    }

    // Make SyrupCappuccino
    SyrupCappuccino makeSyrupCappuccino() {
        System.out.println("Making " + this.name);
        makeCappuccino();
        System.out.println("Adding " + this.syrup + " syrup");
        return this;
    }
}
