package org.basics2.of.oop.task5.entity;

import java.util.Objects;

public class Sweet {
    private TypeOfSweet type;
    private double price;
    private double weight;

    public Sweet(TypeOfSweet type, double price, double weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    public TypeOfSweet getType() {
        return type;
    }

    public void setType(TypeOfSweet type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sweet: type=" + type +
                ", price=" + price +
                ", weight=" + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return Double.compare(sweet.price, price) == 0 && Double.compare(sweet.weight, weight) == 0 && type == sweet.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, weight);
    }
}
