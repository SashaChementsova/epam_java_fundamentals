package org.programming.with.classes.aggregation.and.coposition.Task3;

public class Region {
    private District[] districts;
    private String nameOfRegion;
    private String centerOfRegion;


    public Region(District[] districts, String nameOfRegion, String centerOfRegion) {
        this.districts = districts;
        this.nameOfRegion = nameOfRegion;
        this.centerOfRegion = centerOfRegion;
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }

    public District[] getDistricts() {
        return districts;
    }

    public String getCenterOfRegion() {
        return centerOfRegion;
    }

    public void setCenterOfRegion(String centerOfRegion) {
        this.centerOfRegion = centerOfRegion;
    }

    public void setNameOfRegion(String nameOfRegion) {
        this.nameOfRegion = nameOfRegion;
    }
}
