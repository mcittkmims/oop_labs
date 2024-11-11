package com.coffee.barista.cafe;

import com.coffee.enums.*;

public class SyrupCappuccino extends Cappuccino{
    private SyrupType syrup;
    private final String name = "SyrupCappuccin";

    
    SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(intensity, mlOfMilk);
        this.syrup = syrup;
    }
    
    // Getters and setters
    SyrupType getSyrup() {
        return syrup;
    }

    void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    // Print Cappucino Details
    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Syrup: " + this.syrup);
    }

    @Override
    Cappuccino makeCappuccino() {
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
