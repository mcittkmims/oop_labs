
package com.classification.alien;

import java.util.List;


public class AliensWrapper {
    private String name;
    private List<Alien> individuals;

    public AliensWrapper(String name, List<Alien> individuals) {
        this.name = name;
        this.individuals = individuals;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Alien> getIndividuals() {
        return individuals;
    }
}