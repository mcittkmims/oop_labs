package com.carlab.station;

import com.carlab.car.Car;
import com.carlab.car.FuelType;
import com.carlab.car.PassengerType;
import com.carlab.queues.interfaces.Queue;
import com.carlab.queues.LinearQueue;
import com.carlab.service.GasStation;
import com.carlab.service.PeopleDinner;
import com.carlab.service.interfaces.Dineable;
import com.carlab.service.interfaces.Refuelable;
import com.carlab.output.OutputData;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarStationTest {
    private Dineable diningService;
    private Refuelable refuelingService;
    private Queue<Car> queue;
    private CarStation carStation;

    @BeforeEach
    void setup() {

        diningService = new PeopleDinner();
        refuelingService = new GasStation();
        queue = new LinearQueue<>();
        carStation = new CarStation(diningService, refuelingService, queue);

        OutputData.setDiningCount(0);
        OutputData.setGasCount(0);
    }

    @Test
    void testServeCarsQueueIsEmptyAfterCompletion() {

        Car car1 = new Car(1, FuelType.GAS, PassengerType.PEOPLE, true, 33); 
        Car car2 = new Car(2, FuelType.GAS, PassengerType.PEOPLE, false, 0); 
        queue.enqueue(car1);
        queue.enqueue(car2);


        carStation.serveCars();


        assertTrue(queue.isEmpty(), "Queue should be empty after serving all cars.");
        assertEquals(1, OutputData.getDiningCount(), "Dining count should be incremented for the dining car.");
        assertEquals(2, OutputData.getGasCount(), "Gas count should be incremented for both cars.");
    }

    @Test
    void testAddCarIncreasesQueueSizeByOne() {

        int initialSize = queue.size();
        Car car = new Car(3, FuelType.GAS, PassengerType.PEOPLE, false, 0);

        carStation.addCar(car);

        assertEquals(initialSize + 1, queue.size(), "Queue size should increase by 1 after adding a car.");
    }

    @Test
    void testDiningAndNotDiningCountsAfterServeCars() {

        Car car1 = new Car(1, null, null, true, 0); // Dining car
        Car car2 = new Car(2, null, null, false, 0); // Non-dining car
        Car car3 = new Car(3, null, null, true, 0); // Dining car
        queue.enqueue(car1);
        queue.enqueue(car2);
        queue.enqueue(car3);

        carStation.serveCars();

        assertEquals(2, OutputData.getDiningCount(), "Dining count should be incremented for dining cars.");
        assertEquals(1, OutputData.getNotDiningCount(), "Not dining count should be incremented for non-dining cars.");
    }
}