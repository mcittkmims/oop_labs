package com.coffee.relations.classes;

import com.coffee.relations.enums.Intensity;

public class Americano extends Coffee{
    private int mlOfWater;


    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity, "Americano");
        this.mlOfWater = mlOfWater;

    }

    // Getters and setters
    public int getMlOfWater() {
        return mlOfWater;
    }

    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }
    
}
