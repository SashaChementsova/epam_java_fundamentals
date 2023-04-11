package org.programming.with.classes.the.simplest.classes.and.objects.Task10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class RealizationOfAirline {
    private List<Airline> airlines=new ArrayList<>();
    public  RealizationOfAirline(){
        airlines.add(new Airline("Minsk, Belarus",456,"Airbus A320","13:56","Sunday"));
        airlines.add(new Airline("San-Francisco, the USA",434,"Boeing-737","09:54","Tuesday"));
        airlines.add(new Airline("Warsaw, Poland",654,"Boeing-737","18:09","Monday"));
        airlines.add(new Airline("Seoul, Republic of Korea",232, "Airbus A320","04:48","Wednesday"));
        airlines.add(new Airline("Paris, France",989,"Boeing-777","10:34","Tuesday"));
    }
    private int checkNum(int a){ //проверка целого числа
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            while (!sc.hasNextInt()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextInt();
            if(x<=a) System.out.println("Error. Try again.");
        }while(x<=a);
        return x;
    }

    public void getMenu() throws ParseException {

        int choice;
        String str="",str1=""; int flag;
        Scanner sc=new Scanner(System.in);
        while(true){
            choice=0;
            System.out.println("Select a menu item:\n 1)Get destinations of airlines;\n 2)Get types of airline's;\n 3)Get airline's days of week;\n 4)Get flights with a specific destination;\n 5)Get airlines on a specific day of the week;\n 6)Get flights on a specific day of the week and time;\n 7)Exit.");

            while(choice<1||choice>7){
                choice=checkNum(0);
                if(choice<1||choice>7) System.out.println("Error.Try again.");
            }
            switch (choice) {
                case 1:
                    for (Airline v : airlines) {
                        System.out.println(v.getNumOfRace()+". "+v.getDestination());
                    }
                    break;
                case 2:
                    for (Airline v : airlines) {
                        System.out.println(v.getNumOfRace()+". "+v.getTypeOfPlane());
                    }
                    break;
                case 3:
                    for (Airline v : airlines) {
                        System.out.println(v.getNumOfRace()+". "+v.getDayOfWeek());
                    }
                    break;
                case 4:
                    flag=0;
                    System.out.println("Enter the destination:");
                    str=sc.nextLine();
                    for (Airline v : airlines) {
                        if(str.equals(v.getDestination())) { System.out.println(v.toString()); flag=1;}
                    }
                    if(flag==0) System.out.println("There are no such airlines");
                    break;
                case 5:
                    flag=0;
                    System.out.println("Enter the day of week:");
                    str=sc.nextLine();
                    for (Airline v : airlines) {
                        if(str.equals(v.getDayOfWeek()))  {System.out.println(v.toString()); flag=1;}
                    }
                    if(flag==0) System.out.println("There are no such airlines");
                    break;
                case 6:
                    flag=0;
                    System.out.println("Enter the day of week:");
                    str=sc.nextLine();
                    System.out.println("Enter the time:");
                    str1=sc.nextLine();
                    Date start = new SimpleDateFormat("HH:mm", Locale.ENGLISH)
                            .parse(str1);
                    Date end;
                    for (Airline v : airlines) {
                        end = new SimpleDateFormat("HH:mm", Locale.ENGLISH)
                                .parse(v.getTimeOfTakeOff());
                        if(start.compareTo(end) < 0&&str.equals(v.getDayOfWeek())) { System.out.println(v.toString());flag=1;}
                    }
                    if(flag==0) System.out.println("There are no such airlines");
                    break;
                case 7:
                    return;
            }
        }

    }
}
