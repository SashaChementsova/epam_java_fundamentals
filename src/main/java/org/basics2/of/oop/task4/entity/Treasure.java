package org.basics2.of.oop.task4.entity;

public class Treasure {
    private TypeOfTreasure type;
    private double weight;
    private double price;
    public Treasure(){}
    public Treasure(TypeOfTreasure type, double weight, double price) {
        this.type = type;
        this.weight =weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Treasure: type=" + type +
                ", weight=" + weight +
                ", price=" + price;
    }

    public TypeOfTreasure getType() {
        return type;
    }

    public void setType(TypeOfTreasure type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
