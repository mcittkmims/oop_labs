package com.classification; 

import com.classification.alien.*;
import com.classification.io.Reader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        String fixedFilePath = "src/main/resources/input.json"; 
        Reader reader = new Reader(fixedFilePath); 

        
        List<Alien> aliens = reader.readFile(); 

        // Print the list of aliens
        for (Alien alien : aliens) {
            System.out.println(alien);
        }
    }
}
