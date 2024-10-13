package com.classification.universe;

import java.util.List;

public class Universe {
    //Each universe has a name and it's races
    private String name;
    private List<String> races;

    public Universe(String name, List<String> races) {
        this.name = name;
        this.races = races;
    }
}
