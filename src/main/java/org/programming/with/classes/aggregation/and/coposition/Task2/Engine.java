package org.programming.with.classes.aggregation.and.coposition.Task2;

public class Engine {
    private Fuel typeOfFuel;
    private double fuelСonsumption;
    public Engine(Fuel typeOfFuel,double fuelСonsumption) {
        this.typeOfFuel=typeOfFuel;
        this.fuelСonsumption=fuelСonsumption;
    }

    public Fuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public double getFuelСonsumption() {
        return fuelСonsumption;
    }
}
