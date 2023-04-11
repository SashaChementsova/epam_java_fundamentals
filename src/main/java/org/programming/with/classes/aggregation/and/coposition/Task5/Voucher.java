package org.programming.with.classes.aggregation.and.coposition.Task5;

public class Voucher {
    private int countOfDays;
    private Transport transport;
    private TravelType type;

    public Voucher(int countOfDays, Transport transport, TravelType type) {

        this.countOfDays = countOfDays;
        this.transport = transport;
        this.type = type;
    }

    public Voucher() {
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setType(TravelType type) {
        this.type = type;
    }



    public int getCountOfDays() {
        return countOfDays;
    }

    public Transport getTransport() {
        return transport;
    }

    public TravelType getType() {
        return type;
    }



    @Override
    public String toString() {
        return "Voucher: " +
                "countOfDays=" + countOfDays +
                ", transport=" + transport +
                ", type=" + type;
    }
}
