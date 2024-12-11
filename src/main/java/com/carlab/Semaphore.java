package com.carlab;

import java.util.List;

import com.carlab.car.*;
import com.carlab.car.FuelType;
import com.carlab.output.OutputData;
import com.carlab.service.ElectricStation;
import com.carlab.service.GasStation;
import com.carlab.service.PeopleDinner;
import com.carlab.service.RobotDinner;

public class Semaphore {
    private List<CarStation> stations;
    
    public Semaphore(List<CarStation> stations) {
        this.stations = stations;
    }

    public void redirect(Car car) {
        if (car.type == FuelType.GAS && car.passengers == PassengerType.PEOPLE) {
            for (CarStation station : stations) {
                if (station.getRefuelingService() instanceof GasStation
                        && station.getDiningService() instanceof PeopleDinner) {
                    station.addCar(car);
                    OutputData.updatePeopleCount();
                    System.out.println("Redirecting car " + car.id + " to the GAS station designed for PEOPLE!");
                    break;
                }
            }
        } else if (car.type == FuelType.GAS && car.passengers == PassengerType.ROBOTS) {
            for (CarStation station : stations) {
                if (station.getRefuelingService() instanceof GasStation
                        && station.getDiningService() instanceof RobotDinner) {
                    station.addCar(car);
                    OutputData.updateRobotsCount();
                    ;
                    System.out.println("Redirecting car " + car.id + " to the GAS station designed for ROBOTS!");
                    break;
                }
            }
        } else if (car.type == FuelType.ELECTRIC && car.passengers == PassengerType.PEOPLE) {
            for (CarStation station : stations) {
                if (station.getRefuelingService() instanceof ElectricStation
                        && station.getDiningService() instanceof PeopleDinner) {
                    station.addCar(car);
                    OutputData.updatePeopleCount();
                    System.out.println("Redirecting car " + car.id + " to the ELECTRIC station designed for PEOPLE!");
                    break;
                }
            }
        } else if (car.type == FuelType.ELECTRIC && car.passengers == PassengerType.ROBOTS) {
            for (CarStation station : stations) {
                if (station.getRefuelingService() instanceof ElectricStation
                        && station.getDiningService() instanceof RobotDinner) {
                    station.addCar(car);
                    OutputData.updateRobotsCount();
                    ;
                    System.out.println("Redirecting car " + car.id + " to the ELECTRIC station designed for ROBOTS!");
                    break;
                }
            }
        }
    }
    
    public void serve() {
        for (CarStation station : stations) {
            station.serveCars();
        }
    }
    
    public boolean areWaiting() {
        for (CarStation station : stations) {
            if (station.getWaitingSize() > 0) {
                return true;
            }
        }
        return false;
    }
}
