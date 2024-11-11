package com.coffee.relations;

import com.coffee.enums.Intensity;

public class Cappuccino extends Coffee {
    
    private int mlOfMilk;

    private final String name = "Cappuccino";

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;

    }

    // Getters and setters
    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

}
