package com.classification.io;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import com.classification.alien.Alien;
import com.classification.alien.AliensWrapper;
import com.classification.universe.Universe;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Writer {
    private List<Alien> aliens;
    private List<Universe> universes;

    public Writer(List<Alien> aliens, List<Universe> universes) {
        this.aliens = aliens;
        this.universes = universes;
    }

    public void writeToJson(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();

        // Writing only non-null fields
        objectMapper.setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL);
        // Readable JSON
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        
        for (Universe universe : universes) {
            // Create a wrapper object to hold the structure for each universe
            AliensWrapper wrapper = new AliensWrapper(universe.getName(), universe.population(aliens));
            try {
                objectMapper.writeValue(new File(filePath + "/" + universe.getName().toLowerCase() + ".json"), wrapper);
                System.out.println("HitchHiker Aliens teleported to " + filePath + "/" + universe.getName().toLowerCase() + ".json");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
