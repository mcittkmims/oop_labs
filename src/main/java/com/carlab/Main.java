package com.carlab;

import java.io.File;
import java.util.List;

import com.carlab.output.OutputData;
import com.carlab.queues.CircularQueue;
import com.carlab.queues.DoubleQueue;
import com.carlab.queues.LinearQueue;
import com.carlab.service.ElectricStation;
import com.carlab.service.GasStation;
import com.carlab.service.PeopleDinner;
import com.carlab.service.RobotDinner;

public class Main {
    public static void main(String[] args) {

        List<CarStation> stations = List.of(
            new CarStation(new PeopleDinner(), new GasStation(), new LinearQueue<>()),
            new CarStation(new PeopleDinner(), new ElectricStation(), new CircularQueue<>(10)),
            new CarStation(new RobotDinner(), new GasStation(), new DoubleQueue<>()),
            new CarStation(new RobotDinner(), new ElectricStation(), new LinearQueue<>()));

        Semaphore semaphore = new Semaphore(stations);

        // first thread
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                getInput(semaphore);
            }
        };

        // second thread
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                processInput(semaphore);
            }
        };

        thread1.start();
        thread2.start();
    }

    public static void getInput(Semaphore semaphore) {
        File directory = new File("src/main/java/com/carlab/input/queue");

        File[] jsons = directory.listFiles();

            while (jsons != null && jsons.length > 0) {

                // Send the first car in queue
                for (File json : jsons) {
                    semaphore.redirect(Deserializer.deserializeCar(json));
                    json.delete();
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {}
                jsons = directory.listFiles();

        }

    }

    public static void processInput(Semaphore semaphore) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        while (semaphore.areWaiting()) {
            semaphore.serve();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("---------------------------------------------------------------------------");
        OutputData.display();
        
    }
}
