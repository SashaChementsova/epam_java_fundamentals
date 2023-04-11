package org.programming.with.classes.aggregation.and.coposition.Task3;

public class City {
    private String nameOfCity;
    private boolean isCapital;

    public City(String nameOfCity, boolean isCapital) {
        this.nameOfCity = nameOfCity;
        this.isCapital = isCapital;
    }

    public String getName() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }
}
