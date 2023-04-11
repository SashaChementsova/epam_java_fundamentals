package org.programming.with.classes.aggregation.and.coposition.Task3;
//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class Main {
    public static void main(String[] args){
        City c1=new City("Minsk",true);
        City c2=new City("Mogilev",false);
        City c3=new City("Krasnopolye",false);
        City c4=new City("Priluki",false);
        City c5=new City("Buynichi",false);
        District d1=new District(new City[]{c1,c4},"Minskiy");
        District d2=new District(new City[]{c2,c5},"Mogilevskiy");
        District d3=new District(new City[]{c3},"Krasnopolskiy");
        Region r1=new Region(new District[]{d2,d3},"Mogilevskaya","Mogilev");
        Region r2=new Region(new District[]{d1},"Minskaya","Minsk");
        State state=new State("Belarus",new Region[]{r1,r2},207595);
        System.out.println("The capital: "+state.getCapital());
        System.out.println("The square of state: "+state.getSquare()+" km^2");
        System.out.println("The number of regions: "+state.countRegions());
        System.out.println("The regions: "+state.getRegions());
    }
}
