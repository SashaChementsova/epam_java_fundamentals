package org.programming.with.classes.aggregation.and.coposition.Task3;

public class State {
    private String nameOfState;
    private Region[] regions;
    private double square;

    public State(String nameOfState, Region[] regions, double square) {
        this.nameOfState = nameOfState;
        this.regions = regions;
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getNameOfState() {
        return nameOfState;
    }

    public void setNameOfState(String nameOfState) {
        this.nameOfState = nameOfState;
    }

    public String getCapital() {
        for (Region r : regions) {
            for (District d : r.getDistricts()) {
                for (City c : d.getCities()) {
                    if (c.isCapital()) return c.getName();
                }
            }
        }
        return null;
    }

    public int countRegions(){
        return regions.length;
    }
    public String getRegions(){
        String str="";
        for(Region r:regions){
            str+=r.getNameOfRegion();
            str+=" ";
        }
        return str;
    }
}
