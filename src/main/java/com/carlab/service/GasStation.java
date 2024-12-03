package com.carlab.service;

import com.carlab.car.Car;
import com.carlab.output.OutputData;
import com.carlab.service.interfaces.Refuelable;

public class GasStation implements Refuelable {
    
    @Override
    public void refuel(Car car) {
        System.out.println("Refueling gas car " + car.id + ".");
        OutputData.updateGasCount();
        OutputData.updateGasConsumption(car.consumption);

    }
}