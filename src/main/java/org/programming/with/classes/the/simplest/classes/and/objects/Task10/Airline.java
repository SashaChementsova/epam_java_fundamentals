package org.programming.with.classes.the.simplest.classes.and.objects.Task10;
//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
public class Airline {
    private String destination;
    private int numOfRace;
    private String typeOfPlane;
    private String timeOfTakeOff;
    private String dayOfWeek;

    public Airline(String destination, int numOfRace, String typeOfPlane, String timeOfTakeOff, String dayOfWeek) {
        this.destination = destination;
        this.numOfRace = numOfRace;
        this.typeOfPlane = typeOfPlane;
        this.timeOfTakeOff = timeOfTakeOff;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumOfRace() {
        return numOfRace;
    }

    public void setNumOfRace(int numOfRace) {
        this.numOfRace = numOfRace;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public String getTimeOfTakeOff() {
        return timeOfTakeOff;
    }

    public void setTimeOfTakeOff(String timeOfTakeOff) {
        this.timeOfTakeOff = timeOfTakeOff;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline: " +
                "destination=" + destination +
                ", number of race=" + numOfRace +
                ", type of plane=" + typeOfPlane +
                ", time of take off=" + timeOfTakeOff +
                ", day of week=" + dayOfWeek;
    }
}
