package org.programming.with.classes.aggregation.and.coposition.Task5;

public class Main {
    public static void main(String[] args) {
        TravelAgent travel = new TravelAgent();
        System.out.println(travel.clientsChoise(Transport.BUS,
                TravelType.EXCURSIONS, 9).toString());
        System.out.println(travel.clientsChoiseExlusive(Transport.BUS,
                TravelType.REAL_TRIP,  23).toString());
    }
}
