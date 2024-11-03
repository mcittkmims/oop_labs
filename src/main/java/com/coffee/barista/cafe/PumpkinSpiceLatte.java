package com.coffee.barista.cafe;

import com.coffee.enums.Intensity;

public class PumpkinSpiceLatte extends Cappuccino{

    private int mgOfPumpkinSpice;

    PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensity, mlOfMilk, "PumpkinSpiceLatte");
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

    // Make PumpkinSpiceLatte
    PumpkinSpiceLatte makePumpkinSpiceLatte() {
        super.makeCappuccino();
        System.out.println("Adding " + this.mgOfPumpkinSpice + " mgs of pumpkin spice");
        return this;
    }
}
