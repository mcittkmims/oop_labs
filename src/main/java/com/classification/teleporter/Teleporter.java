package com.classification.teleporter;

import com.classification.alien.Alien;
import com.classification.universe.Universe;
import java.util.List;


// Class to create a teleporter to teleport each alien to their world
public class Teleporter {
    public static void teleport(List<Alien> aliens, List<Universe> universes) {
        // Teleporter sound
        System.out.println("Wooooosh!");
        // Checks each alien to a universe
        for (Alien alien : aliens) {
            for (Universe universe : universes) {
                if (universe.isUniverse(alien)) {
                    alien.setUniverse(universe.getName());
                    break;
                }
            }
        }
        System.out.println("Teleportation Completed!");
    }

    
    
}
