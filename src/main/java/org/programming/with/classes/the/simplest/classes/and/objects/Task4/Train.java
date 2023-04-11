package org.programming.with.classes.the.simplest.classes.and.objects.Task4;

import java.util.Comparator;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.
public class Train {
    private String destination;
    private int train;
    private String time;

    public Train(String destination, int train, String time) {
        this.destination = destination;
        this.train = train;
        this.time = time;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrain(int train) {
        this.train = train;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrain() {
        return train;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Train: destination=" + destination +", num of train=" + train + ", time=" + time ;
    }

    public String getInfo(){
        return "The train: destination=" + destination  + ", time=" + time ;
    }

    public static Comparator<Train> sortDestination = new Comparator<Train>() {

        public int compare(Train t1, Train t2) {
            String destination1=t1.getDestination().toUpperCase();
            String destination2=t2.getDestination().toUpperCase();
            if(destination1.equals(destination2)) {
                String time1=t1.getTime().toUpperCase();
                String time2=t2.getTime().toUpperCase();
                return time1.compareTo(
                        time2);
            }
            else return destination1.compareTo(
                    destination2);
        }
    };


    public static Comparator<Train> sortNums = new Comparator<Train>() {

        public int compare(Train t1, Train t2) {
            int train1=t1.getTrain();
            int train2=t2.getTrain();

            return train1-train2;
        }
    };
}
