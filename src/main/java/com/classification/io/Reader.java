package com.classification.io;

import com.classification.alien.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Reader {
    private static ObjectMapper objectMapper = new ObjectMapper();

    // Method to read and parse the JSON file
    public List<Alien> readAlienFromFile(String filePath) {
        List<Alien> aliens = null;

        try {
            // Read and convert the JSON to an AlienData object
            AlienData alienData = objectMapper.readValue(new File(filePath), AlienData.class);
            // Get a list of alien objects
            aliens = alienData.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return aliens;
    }
}
