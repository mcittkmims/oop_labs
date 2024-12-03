package com.carlab.output;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.carlab.service.ElectricStation;

import static org.junit.jupiter.api.Assertions.*;

public class OutputDataTest {

    // Reset all static fields before each test
    @BeforeEach
    void resetStaticFields() {
        OutputData.setElectricCount(0);
        OutputData.setGasCount(0);
        OutputData.setPeopleCount(0);
        OutputData.setRobotsCount(0);
        OutputData.setDiningCount(0);
        OutputData.setNotDiningCount(0);
        OutputData.setGasConsumption(0);
        OutputData.setElectricConsumption(0);
    }

    @Test
    void testElectricCountUpdate() {
        assertEquals(0, OutputData.getElectricCount());

        OutputData.updateElectricCount();
        assertEquals(1, OutputData.getElectricCount());

        OutputData.setElectricCount(5);
        assertEquals(5, OutputData.getElectricCount());
    }

    @Test
    void testGasCountUpdate() {
        assertEquals(0, OutputData.getGasCount());

        OutputData.updateGasCount();
        assertEquals(1, OutputData.getGasCount());

        OutputData.setGasCount(10);
        assertEquals(10, OutputData.getGasCount());
    }

    @Test
    void testPeopleCountUpdate() {
        assertEquals(0, OutputData.getPeopleCount());

        OutputData.updatePeopleCount();
        assertEquals(1, OutputData.getPeopleCount());

        OutputData.setPeopleCount(3);
        assertEquals(3, OutputData.getPeopleCount());
    }

    @Test
    void testGasConsumptionUpdate() {
        assertEquals(0, OutputData.getGasConsumption());

        OutputData.updateGasConsumption();
        assertEquals(1, OutputData.getGasConsumption());

        OutputData.updateGasConsumption(5);
        assertEquals(6, OutputData.getGasConsumption());

        OutputData.setGasConsumption(20);
        assertEquals(20, OutputData.getGasConsumption());
    }

    @Test
    void testElectricConsumptionUpdate() {
        assertEquals(0, OutputData.getElectricConsumption());

        OutputData.updateElectricConsumption();
        assertEquals(1, OutputData.getElectricConsumption());

        OutputData.updateElectricConsumption(10);
        assertEquals(11, OutputData.getElectricConsumption());

        OutputData.setElectricConsumption(50);
        assertEquals(50, OutputData.getElectricConsumption());
    }

    @Test
    void testDisplayMethod() {
        // Simulate values
        OutputData.setElectricCount(2);
        OutputData.setGasCount(3);
        OutputData.setPeopleCount(4);
        OutputData.setRobotsCount(5);
        OutputData.setDiningCount(6);
        OutputData.setNotDiningCount(7);
        OutputData.setGasConsumption(8);
        OutputData.setElectricConsumption(9);

        assertEquals(2, OutputData.getElectricCount());
        assertEquals(3, OutputData.getGasCount());
        assertEquals(4, OutputData.getPeopleCount());
        assertEquals(5, OutputData.getRobotsCount());
        assertEquals(6, OutputData.getDiningCount());
        assertEquals(7, OutputData.getNotDiningCount());
        assertEquals(8, OutputData.getGasConsumption());
        assertEquals(9, OutputData.getElectricConsumption());
    }

    @Test
    void testElectricCountWithMultipleElectricStations() {
        ElectricStation station1 = new ElectricStation();
        ElectricStation station2 = new ElectricStation();

        assertEquals(0, OutputData.getElectricCount());

        station1.refuel("Car1");
        assertEquals(1, OutputData.getElectricCount(), "Electric count should be incremented by station1");

        station2.refuel("Car2");
        assertEquals(2, OutputData.getElectricCount(), "Electric count should be incremented by station2");
    }
}
