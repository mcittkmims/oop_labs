package com.coffee.barista.cafe;

import com.coffee.enums.Intensity;

public class PumpkinSpiceLatte extends Cappuccino{

    private int mgOfPumpkinSpice;
    private final String name = "PumpkinSpiceLatte";

    PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    // Getters and setters
    int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }
    

    // Print Cappucino Details
    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("PumpkinSpice: " + this.mgOfPumpkinSpice + " mg");
    }


    @Override
    Cappuccino makeCappuccino() {
        super.makeCoffee();
        System.out.println("Adding " + this.getMlOfMilk() + " mls of milk");
        return this;
    }
    

    // Make PumpkinSpiceLatte
    PumpkinSpiceLatte makePumpkinSpiceLatte() {
        System.out.println("Making " + this.name);
        makeCappuccino();
        System.out.println("Adding " + this.mgOfPumpkinSpice + " mgs of pumpkin spice");
        return this;
    }
}
