package com.coffee.barista.cafe;

import com.coffee.enums.*;

public class SyrupCappuccino extends Cappuccino{
    private SyrupType syrup;

    
    SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(intensity, mlOfMilk, "SyrupCappuccino");
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

    // Make SyrupCappuccino
    SyrupCappuccino makeSyrupCappuccino() {
        super.makeCappuccino();
        System.out.println("Adding " + this.syrup + " syrup");
        return this;
    }
}
