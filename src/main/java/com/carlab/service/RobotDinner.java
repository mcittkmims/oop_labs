package com.carlab.service;

import com.carlab.service.interfaces.Dineable;

public class RobotDinner implements Dineable {
    
    @Override
    public void serveDinner(String carId) {
        System.out.println("Serving dinner to robots in " + carId + ".");
    }
}
