package com.carlab.car;

public class Car {
    public int id;
    public FuelType type;
    public PassengerType passengers;
    public boolean isDining;
    public int consumption;

    public Car(int id, FuelType type, PassengerType passengers, boolean isDining, int consumption) {
        this.id = id;
        this.type = type;
        this.passengers = passengers;
        this.isDining = isDining;
        this.consumption = consumption;
    }
}
