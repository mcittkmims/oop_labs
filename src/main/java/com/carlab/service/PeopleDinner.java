package com.carlab.service;

import com.carlab.car.Car;
import com.carlab.output.OutputData;
import com.carlab.service.interfaces.Dineable;

public class PeopleDinner implements Dineable{
    
    @Override
    public void serveDinner(Car car) {
        System.out.println("Serving dinner to people in " + car.id + ".");
        OutputData.updateDiningCount();
    }
}
