package com.coffee.relations;

import com.coffee.enums.Intensity;

public class Americano extends Coffee{
    private int mlOfWater;
    private final String name = "Americano";

    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity);
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
