package org.programming.with.classes.aggregation.and.coposition.Task2;

public class Car {
    private Wheel[] wheels;
    private Engine engine;
    private String typeOfCar;
    private boolean isFullTank;


    public Car(Wheel[] wheels, Engine engine, String typeOfCar, boolean isFullTank) {
        this.wheels = wheels;
        this.engine = engine;
        this.typeOfCar = typeOfCar;
        this.isFullTank = isFullTank;
    }

    public void isFullTank() {
        if(isFullTank) System.out.println("The tank is full");
        else System.out.println("The tank is empty");
    }

    public void goToTheRoad(){
        if(isFullTank){
            System.out.println("You have successfully hit the road.");
            isFullTank=false;
        }
        else System.out.println("Your tank is empty. First you need to refuel the car.");
    }
    public void setFullTank() {
        isFullTank = true;
        System.out.println("You have successfully refueled the car.");
    }
    public void changeWheel(String seasonOfTire){
        System.out.println("Tires have been successfully replaced to "+seasonOfTire+" from "+wheels[0].getSeasonOfTire());
        for(Wheel wh:wheels){
            wh.setSeasonOfTire(seasonOfTire);
        }

    }

    public String getTypeOfCar() {
        return typeOfCar;
    }
}
