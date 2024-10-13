package com.classification.universe;

import com.classification.race.Race;
import com.classification.alien.Alien;

import java.util.ArrayList;
import java.util.List;

public class Universe {
    //Each universe has a name and it's races
    private String name;
    private List<Race> races;

    // Constructor
    public Universe(String name, List<Race> races) {
        this.name = name;
        this.races = races;
    }

    // Method to check if an alien corresponds to an universe
    public boolean isUniverse(Alien alien) {
        // Checking if it corresponds to a race from the universe
        for (Race race : races) {
            if (race.isRace(alien)) {
                // Setting the alien's race
                alien.setRace(race.getName());
                return true;
            }
        }
        return false;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    // Function to return the aliens of an universe
    public List<Alien> population(List<Alien> aliens) {
        List<Alien> universeAliens = new ArrayList<>();
        for (Alien alien : aliens) {
            if (alien.getUniverse().equals(this.name)) {
                universeAliens.add(alien);
            }
        }
        return universeAliens;
    }

}
