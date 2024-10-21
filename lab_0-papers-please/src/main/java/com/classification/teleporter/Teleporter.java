package com.classification.teleporter;

import com.classification.alien.Alien;
import com.classification.universe.Universe;
import java.util.List;


// Class to create a teleporter to teleport each alien to their world
public class Teleporter {
    private List<Alien> aliens;
    private List<Universe> universes;

    // Constructor
    public Teleporter(List<Alien> aliens, List<Universe> universes) {
        this.aliens = aliens;
        this.universes = universes;
    }

    public void teleport() {
        // Teleporter sound
        System.out.println("Wooooosh!");
        // Checks each alien to a universe
        for (Alien alien : this.aliens) {
            for (Universe universe : this.universes) {
                if (universe.isUniverse(alien)) {
                    alien.setUniverse(universe.getName());
                    break;
                }
            }
        }
        System.out.println("Teleportation Completed!");
    }

    
    
}
