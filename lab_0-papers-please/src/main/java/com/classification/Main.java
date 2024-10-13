package com.classification; 

import com.classification.alien.*;
import com.classification.io.Reader;
import com.classification.race.Race;

import java.util.List;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
       
        String fixedFilePath = "src/main/resources/input.json"; 
        Reader reader = new Reader(fixedFilePath);
        
        //Creating a race for test
        Race betelgeusianRace = new Race("Betelgeusian", true, "Betelgeuse",100,Arrays.asList("EXTRA_ARMS", "EXTRA_HEAD"));
        Race vogonsRace = new Race("Vogons", false, "Vogsphere", 200, Arrays.asList("GREEN", "BULKY"));
        
        List<Alien> aliens = reader.readFile(); 

        // Checking if classification at Hitchhiker's Universe is correct
        for (Alien alien : aliens) {
            System.out.println(alien);
            System.out.println("Race: " + (betelgeusianRace.isRace(alien) || vogonsRace.isRace(alien)));
        }

        
    }
}
