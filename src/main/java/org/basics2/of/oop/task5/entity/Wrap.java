package org.basics2.of.oop.task5.entity;

import java.util.Objects;

public class Wrap {
    private double price;
    private TypeOfWrap type;

    public Wrap(double price, TypeOfWrap type) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TypeOfWrap getType() {
        return type;
    }

    public void setType(TypeOfWrap type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrap wrap = (Wrap) o;
        return Double.compare(wrap.price, price) == 0 && type == wrap.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, type);
    }

    @Override
    public String toString() {
        return "Wrap: price=" + price +
                ", type=" + type;
    }

    public void makeGift(Sweet sweet){
        System.out.println("This is a gift with "+sweet.getType()+" that is wrapped in "+type);
    }
}
