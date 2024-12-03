package com.carlab.service;

import com.carlab.car.Car;
import com.carlab.output.OutputData;
import com.carlab.service.interfaces.Refuelable;

public class ElectricStation implements Refuelable {
    
    @Override
    public void refuel(Car car) {
        System.out.println("Refueling electric car " + car.id + ".");
        OutputData.updateElectricCount();
        OutputData.updateElectricConsumption(car.consumption);
    }
}
