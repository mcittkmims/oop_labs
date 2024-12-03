package com.carlab;

import com.carlab.car.Car;
import com.carlab.output.OutputData;
import com.carlab.queues.LinearQueue;
import com.carlab.service.ElectricStation;
import com.carlab.service.GasStation;
import com.carlab.service.PeopleDinner;
import com.carlab.service.RobotDinner;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SemaphoreTest {

    private final List<CarStation> stations = List.of(
            new CarStation(new PeopleDinner(), new GasStation(), new LinearQueue<>()),
            new CarStation(new PeopleDinner(), new ElectricStation(), new LinearQueue<>()),
            new CarStation(new RobotDinner(), new GasStation(), new LinearQueue<>()),
            new CarStation(new RobotDinner(), new ElectricStation(), new LinearQueue<>()));

    private final Semaphore semaphore = new Semaphore(stations);

    private final String carJson1 = "{\"id\": 1, \"type\": \"ELECTRIC\", \"passengers\": \"PEOPLE\", \"isDining\": false, \"consumption\": 14}";
    private final String carJson2 = "{\"id\": 2, \"type\": \"GAS\", \"passengers\": \"PEOPLE\", \"isDining\": true, \"consumption\": 21}";
    private final String carJson3 = "{\"id\": 3, \"type\": \"GAS\", \"passengers\": \"PEOPLE\", \"isDining\": true, \"consumption\": 22}";
    private final String carJson4 = "{\"id\": 4, \"type\": \"ELECTRIC\", \"passengers\": \"PEOPLE\", \"isDining\": true, \"consumption\": 23}";
    private final String carJson5 = "{\"id\": 5, \"type\": \"GAS\", \"passengers\": \"PEOPLE\", \"isDining\": false, \"consumption\": 18}";
    private final String carJson6 = "{\"id\": 6, \"type\": \"ELECTRIC\", \"passengers\": \"ROBOTS\", \"isDining\": false, \"consumption\": 44}";

    @Test
    public void testCarRedirection() {
        // Deserialize the cars
        Car car1 = Deserializer.deserializeCar(carJson1);
        Car car2 = Deserializer.deserializeCar(carJson2);
        Car car3 = Deserializer.deserializeCar(carJson3);
        Car car4 = Deserializer.deserializeCar(carJson4);
        Car car5 = Deserializer.deserializeCar(carJson5);
        Car car6 = Deserializer.deserializeCar(carJson6);

        // Redirect cars
        semaphore.redirect(car1); 
        semaphore.redirect(car2); 
        semaphore.redirect(car3); 
        semaphore.redirect(car4); 
        semaphore.redirect(car5); 
        semaphore.redirect(car6);

        // Verify
        assertEquals(2, stations.get(1).getWaitingSize(), "ElectricStation for PEOPLE should have 2 cars.");
        assertEquals(3, stations.get(0).getWaitingSize(), "GasStation for PEOPLE should have 3 cars.");
        assertEquals(1, stations.get(3).getWaitingSize(), "ElectricStation for ROBOTS should have 1 car.");
    }

    @Test
    public void testServe() {
        // Deserialize the cars
        Car car1 = Deserializer.deserializeCar(carJson1);
        Car car2 = Deserializer.deserializeCar(carJson2);
        Car car3 = Deserializer.deserializeCar(carJson3);
        Car car4 = Deserializer.deserializeCar(carJson4);
        Car car5 = Deserializer.deserializeCar(carJson5);
        Car car6 = Deserializer.deserializeCar(carJson6);

        // Redirect cars
        semaphore.redirect(car1);
        semaphore.redirect(car2);
        semaphore.redirect(car3);
        semaphore.redirect(car4);
        semaphore.redirect(car5);
        semaphore.redirect(car6);

        // Serve cars
        semaphore.serve();

        // Check the updated data in OutputData
        assertEquals(3, OutputData.getGasCount(), "Gas cars count should be 3.");
        assertEquals(3, OutputData.getElectricCount(), "Electric cars count should be 3.");
        assertEquals(5, OutputData.getPeopleCount(), "People count should be 5.");
        assertEquals(1, OutputData.getRobotsCount(), "Robots count should be 1.");
        assertEquals(3, OutputData.getDiningCount(), "Dining count should be 3.");
        assertEquals(3, OutputData.getNotDiningCount(), "Not Dining count should be 3.");
        assertEquals(61, OutputData.getGasConsumption(), "Gas consumption should be 61.");
        assertEquals(81, OutputData.getElectricConsumption(), "Electric consumption should be 81.");
    }
}
