package com.coffee.relations;

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
}
