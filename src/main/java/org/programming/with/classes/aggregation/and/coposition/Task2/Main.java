package org.programming.with.classes.aggregation.and.coposition.Task2;

import java.util.WeakHashMap;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class Main {
    public static void main(String[] args){
        Wheel wheel=new Wheel(17,"Winter tires");
        Car car=new Car(new Wheel[]{wheel,wheel,wheel,wheel},new Engine(Fuel.Diesel,42),"Pickup truck",true);
        car.goToTheRoad();
        car.isFullTank();
        car.setFullTank();
        car.changeWheel("Summer tires");
        System.out.println("The model of car: "+car.getTypeOfCar());
    }
}
