package org.programming.with.classes.the.simplest.classes.and.objects.Task4;

import java.util.*;

public class Main {
    public static int checkIntNum(){ //проверка целого числа
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            while (!sc.hasNextInt()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextInt();
        }while(x<=0);
        return x;
    }
    public static int checkNum(){
        int x=1;
        do{
            if(x<=0) System.out.println("Error. Try again. ");
            x=checkIntNum();
        }while(x<=0);
        return x;
    }

    public static List<Train> sortByNum(List<Train> trains){
        Collections.sort(trains,Train.sortNums);
        return trains;
    }
    public static List<Train> sortByDestination(List<Train> trains) {
        Collections.sort(trains, Train.sortDestination);
        return trains;
    }
    public static String getInfoAboutTrain(List<Train> trains,int num){
        int flag=0;
        StringBuilder info= new StringBuilder();
        for(int i=0;i<trains.size();i++){
            if(trains.get(i).getTrain()==num){
                flag=1; info.append(trains.get(i).getInfo()+"\n");
            }
        }
        if(flag==0) return "There are no such trains";
        else return info.toString();
    }
    public static void printTrains(List<Train> trains){
        for(Train train:trains){
            System.out.println(train.toString());
        }
    }
    public static void main(String[] args){
        List<Train> trains=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int numOfTrain;
        trains.add(new Train("Minsk",5,"13:45"));
        trains.add(new Train("Mogilev",6,"08:02"));
        trains.add(new Train("Mogilev",4,"23:55"));
        trains.add(new Train("Gomel",7,"15:34"));
        trains.add(new Train("Brest",2,"09:23"));
        System.out.println("All trains:");
        printTrains(trains);
        System.out.println("Sort trains by their numbers:");
        trains=sortByNum(trains);
        printTrains(trains);
        System.out.println("Sort trains by their destinations:");
        trains=sortByDestination(trains);
        printTrains(trains);
        System.out.println("Enter num of train:");
        numOfTrain=checkNum();
        System.out.println("Trains with this number:\n"+getInfoAboutTrain(trains,numOfTrain));
    }
}
