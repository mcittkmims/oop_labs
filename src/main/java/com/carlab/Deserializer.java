package com.carlab;

import com.carlab.car.Car;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Deserializer {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Deserialize JSON from a string
    public static Car deserializeCar(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, Car.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Deserialize JSON from a file
    public static Car deserializeCar(File jsonFile) {
        try {
            return objectMapper.readValue(jsonFile, Car.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
