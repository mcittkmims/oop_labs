package com.classification.race;

import java.util.List;
import com.classification.alien.Alien;

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

    // Using reference type variables in case of null
    // Method to check if an alien coresponds to a race
    public boolean isRace(Alien alien) {
        Boolean isHumanoid = alien.isHumanoid();
        String planet = alien.getPlanet();
        Integer age = alien.getAge();
        List<String> traits = alien.getTraits();
        
        //Matching the race to the alien
        boolean isHumanoidMatch = (isHumanoid == null || isHumanoid == this.isHumanoid);
        boolean planetMatch = (planet == null || planet.equals(this.planet));
        boolean ageMatch = (age == null || (age >= this.minAge && age <= this.maxAge));
        boolean traitsMatch = (traits == null || this.traits.containsAll(traits));

        return isHumanoidMatch && planetMatch && ageMatch && traitsMatch;
    }

}
