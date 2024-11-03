package com.coffee.relations.classes;

import com.coffee.relations.enums.Intensity;

public class PumpkinSpiceLatte extends Cappuccino{

    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensity, mlOfMilk, "PumpkinSpiceLatte");
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    // Getters and setters
    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    public void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }
    
}
