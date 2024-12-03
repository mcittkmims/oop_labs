package com.carlab.output;

public class OutputData {
    
    private static int electricCount = 0;
    private static int gasCount = 0;
    private static int peopleCount = 0;
    private static int robotsCount = 0;
    private static int diningCount = 0;
    private static int notDiningCount = 0;
    private static int gasConsumption = 0;
    private static int electricConsumption = 0;

    // Getters
    public static int getElectricCount() {
        return electricCount;
    }

    public static void setElectricCount(int electricCount) {
        OutputData.electricCount = electricCount;
    }

    public static int getGasCount() {
        return gasCount;
    }

    public static void setGasCount(int gasCount) {
        OutputData.gasCount = gasCount;
    }

    public static int getPeopleCount() {
        return peopleCount;
    }

    public static void setPeopleCount(int peopleCount) {
        OutputData.peopleCount = peopleCount;
    }

    public static int getRobotsCount() {
        return robotsCount;
    }

    // Setters
    public static void setRobotsCount(int robotsCount) {
        OutputData.robotsCount = robotsCount;
    }

    public static int getDiningCount() {
        return diningCount;
    }

    public static void setDiningCount(int diningCount) {
        OutputData.diningCount = diningCount;
    }

    public static int getNotDiningCount() {
        return notDiningCount;
    }

    public static void setNotDiningCount(int notDiningCount) {
        OutputData.notDiningCount = notDiningCount;
    }

    public static int getGasConsumption() {
        return gasConsumption;
    }

    public static void setGasConsumption(int gasConsumption) {
        OutputData.gasConsumption = gasConsumption;
    }

    public static int getElectricConsumption() {
        return electricConsumption;
    }

    public static void setElectricConsumption(int electricConsumption) {
        OutputData.electricConsumption = electricConsumption;
    }

    // Implementation
    public static void updateElectricCount() {
        electricCount++;
    }
    
    public static void updateGasCount() {
        gasCount++;
    }

    public static void updatePeopleCount() {
        peopleCount++;
    }

    public static void updateRobotsCount() {
        robotsCount++;
    }

    public static void updateDiningCount() {
        diningCount++;
    }

    public static void updateNotDiningCount() {
        notDiningCount++;
    }

    public static void updateGasConsumption() {
        gasConsumption++;
    }
    
    public static void updateGasConsumption(int consumption) {
        gasConsumption += consumption;
    }
    
    public static void updateElectricConsumption() {
        electricConsumption++;
    }

    public static void updateElectricConsumption(int consumption) {
        electricConsumption += consumption;
    }

    public static void display() {
        System.out.println("ELECTRIC: " + electricCount);
        System.out.println("GAS: " + gasCount);
        System.out.println("PEOPLE: " + peopleCount);
        System.out.println("ROBOTS: " + robotsCount);
        System.out.println("DINING: " + diningCount);
        System.out.println("NOT_DINING: " + notDiningCount);
        System.out.println("CONSUMPTION:");
        System.out.println("\t\tGAS: " + gasConsumption);
        System.out.println("\t\tELECTRIC: " + electricConsumption);
    }

}
