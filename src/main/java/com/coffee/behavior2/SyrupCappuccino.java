package com.coffee.behavior2;

import com.coffee.enums.*;

public class SyrupCappuccino extends Cappuccino{
    private SyrupType syrup;

    
    public SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(intensity, mlOfMilk, "SyrupCappuccino");
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
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Syrup: " + this.syrup);
    }

    // Make SyrupCappuccino
    public SyrupCappuccino makeSyrupCappuccino() {
        super.makeCappuccino();
        System.out.println("Adding " + this.syrup + " syrup");
        return this;
    }
}
