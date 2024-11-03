package com.coffee.relations;

import com.coffee.enums.Intensity;

public class Cappuccino extends Coffee {
    
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

}
