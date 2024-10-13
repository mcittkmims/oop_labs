package com.classification.io;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import com.classification.alien.Alien;
import com.classification.alien.AliensWrapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Writer {
    private List<Alien> aliens;

    public Writer(List<Alien> aliens) {
        this.aliens = aliens;
    }

    public void writeToJson(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();

        // Writing only non-null fields
        objectMapper.setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL);
        // Readable JSON
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true); 

        // Separating the aliens in multiple arrays
        List<Alien> hitchHikerAliens = new ArrayList<Alien>();
        List<Alien> marverAliens = new ArrayList<Alien>();
        List<Alien> ringsAliens = new ArrayList<Alien>();
        List<Alien> starWarsAliens = new ArrayList<Alien>();

        for (Alien alien : aliens) {
            String alienUniverse = alien.getUniverse();
            if (alienUniverse.equals("hitchhikers")) {
                hitchHikerAliens.add(alien);
            } else if (alienUniverse.equals("marvel")) {
                marverAliens.add(alien);
            } else if (alienUniverse.equals("rings")) {
                ringsAliens.add(alien);
            } else if (alienUniverse.equals("starwars")) {
                starWarsAliens.add(alien);
            }
        }

        // Create a wrapper object to hold the structure for hitchHiker universe
        AliensWrapper hitchHikerWrapper = new AliensWrapper("hitchHiker", hitchHikerAliens);
        try {
            objectMapper.writeValue(new File(filePath + "/hitchhiker.json"), hitchHikerWrapper);
            System.out.println("HitchHiker Aliens teleported to " + filePath + "/hitchhiker.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a wrapper object to hold the structure for marvel universe
        AliensWrapper marvelWrapper = new AliensWrapper("marvel", marverAliens);
        try {
            objectMapper.writeValue(new File(filePath + "/marvel.json"), marvelWrapper);
            System.out.println("Marvel Aliens teleported to " + filePath + "/marvel.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a wrapper object to hold the structure for star wars universe
        AliensWrapper starWarsWrapper = new AliensWrapper("starwars", starWarsAliens);
        try {
            objectMapper.writeValue(new File(filePath + "/starwars.json"), starWarsWrapper);
            System.out.println("Star Wars Aliens teleported to " + filePath + "/starwars.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a wrapper object to hold the structure for rings universe
        AliensWrapper ringWrapper = new AliensWrapper("rings", ringsAliens);
        try {
            objectMapper.writeValue(new File(filePath + "/rings.json"), ringWrapper);
            System.out.println("Rings Aliens teleported to " + filePath + "/rings.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
