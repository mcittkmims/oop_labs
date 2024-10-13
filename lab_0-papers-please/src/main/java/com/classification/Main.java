package com.classification; 

import com.classification.alien.*;
import com.classification.io.Reader;
import com.classification.race.Race;
import com.classification.universe.Universe;
import com.classification.teleporter.Teleporter;

import java.util.List;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
       
        String fixedFilePath = "src/main/resources/input.json"; 
        Reader reader = new Reader(fixedFilePath);

        // Getting a list of alien objects from the json
        List<Alien> aliens = reader.readFile();

        // Star Wars Races
        Race wookieRace = new Race("Wookie", false, "Kashyyyk", 400, Arrays.asList("HAIRY", "TALL"));
        Race ewokRace = new Race("Ewok", false, "Endor", 60, Arrays.asList("SHORT", "HAIRY"));
        // Star Wars Universe
        Universe starWarsUniverse = new Universe("starwars", Arrays.asList(wookieRace, ewokRace));


        // Marvel Races
        Race asgardianRace = new Race("Asgardian", true, "Asgard", 5000, Arrays.asList("BLONDE", "TALL"));
        // Marvel Universe
        Universe marvelUniverse = new Universe("marvel", Arrays.asList(asgardianRace));


        // Hitchhiker's Races
        Race betelgeusianRace = new Race("Betelgeusian", true, "Betelgeuse", 100, Arrays.asList("EXTRA_ARMS", "EXTRA_HEAD"));
        Race vogonsRace = new Race("Vogons", false, "Vogsphere", 200, Arrays.asList("GREEN", "BULKY"));
        // Hitchhiker's Universe
        Universe hitchhikersUniverse = new Universe("hitchhikers", Arrays.asList(betelgeusianRace, vogonsRace));


        // Lord of the Rings Races
        Race elfRace = new Race("Elf", true, "Earth", Integer.MAX_VALUE, Arrays.asList("BLONDE", "POINTY_EARS"));
        Race dwarfRace = new Race("Dwarf", true, "Earth", 200, Arrays.asList("SHORT", "BULKY"));
        // Lord of the Rings Universe
        Universe lordOfTheRingsUniverse = new Universe("rings", Arrays.asList(elfRace, dwarfRace));

        // Creating a multiverse teleporter
        Teleporter multiVerseTeleporter = new Teleporter(aliens,
                Arrays.asList(starWarsUniverse, marvelUniverse, hitchhikersUniverse, lordOfTheRingsUniverse));
        // Teleporting everyone (get ready for impact)
        multiVerseTeleporter.teleport();

        // Printing the result
        for (Alien alien : aliens) {
            System.out.println(alien);
        }

        

        
    }
}
