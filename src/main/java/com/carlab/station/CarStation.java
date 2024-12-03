package com.carlab.station;

import com.carlab.car.Car;
import com.carlab.output.OutputData;
import com.carlab.queues.interfaces.Queue;
import com.carlab.service.interfaces.Dineable;
import com.carlab.service.interfaces.Refuelable;

public class CarStation {
    private Dineable diningService;
    Refuelable refuelingService;
    private Queue<Car> queue;

    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
    }

    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();
            
            if (car.isDining) {
                diningService.serveDinner(car);
            } else {
                OutputData.updateNotDiningCount();
            }

            refuelingService.refuel(car);
            System.out.println("Car " + car.id + " has been served");
        }
    }
    
    public void addCar(Car car) {
        queue.enqueue(car);
    }
}
