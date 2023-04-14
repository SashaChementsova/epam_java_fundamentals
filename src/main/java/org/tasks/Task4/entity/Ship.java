package org.tasks.Task4.entity;

public class Ship {
    private int id;
    private double carrying;
    private String name;
    private String typeOfCargo;
    public Ship(){}
    public Ship(int id, double carrying, String name, String typeOfCargo) {
        this.id = id;
        this.carrying = carrying;
        this.name = name;
        this.typeOfCargo = typeOfCargo;
    }

    @Override
    public String toString() {
        return "Ship: id=" + id +
                ", carrying=" + carrying +
                ", name=" + name +
                ", type of cargo=" + typeOfCargo ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }
}
