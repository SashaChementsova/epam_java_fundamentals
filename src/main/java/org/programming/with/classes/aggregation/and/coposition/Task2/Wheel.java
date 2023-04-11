package org.programming.with.classes.aggregation.and.coposition.Task2;

public class Wheel {
    private double diameter;
    private String seasonOfTire;

    public Wheel(double diameter, String season) {
        this.diameter = diameter;
        this.seasonOfTire = season;
    }

    public void setSeasonOfTire(String seasonOfTire) {
        this.seasonOfTire = seasonOfTire;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getSeasonOfTire() {
        return seasonOfTire;
    }
}
