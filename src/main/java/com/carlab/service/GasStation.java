package com.carlab.service;

import com.carlab.output.OutputData;
import com.carlab.service.interfaces.Refuelable;

public class GasStation implements Refuelable {
    
    @Override
    public void refuel(String carId) {
        System.out.println("Refueling gas car " + carId + ".");
        OutputData.updateGasCount();
    }
}