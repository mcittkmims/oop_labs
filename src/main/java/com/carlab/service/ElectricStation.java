package com.carlab.service;

import com.carlab.output.OutputData;
import com.carlab.service.interfaces.Refuelable;

public class ElectricStation implements Refuelable {
    
    @Override
    public void refuel(String carId) {
        System.out.println("Refueling electric car " + carId + ".");
        OutputData.updateElectricCount();
    }
}
