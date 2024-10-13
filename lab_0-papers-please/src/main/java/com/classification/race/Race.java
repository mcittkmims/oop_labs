package com.classification.race;

import java.util.List;

public class Race {
    // Each race has it's name, shape, planet, age range, and traits
    private String name;
    private boolean isHumanoid;
    private String planet;
    private int minAge;
    private int maxAge;
    private List<String> traits;

    public Race(String name, boolean isHumanoid, String planet, int minAge, int maxAge, List<String> traits) {
        this.name = name;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.traits = traits;
    }

}
