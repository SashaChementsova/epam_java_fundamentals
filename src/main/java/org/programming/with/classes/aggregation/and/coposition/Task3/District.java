package org.programming.with.classes.aggregation.and.coposition.Task3;

import java.util.List;

public class District {
    private City[] cities;
    private String nameOfDistrict;

    public String getNameOfDistrict() {
        return nameOfDistrict;
    }

    public void setNameOfDistrict(String nameOfDistrict) {
        this.nameOfDistrict = nameOfDistrict;
    }

    public City[] getCities() {
        return cities;
    }

    public District(City[] cities, String nameOfDistrict) {
        this.cities = cities;
        this.nameOfDistrict = nameOfDistrict;
    }
}
