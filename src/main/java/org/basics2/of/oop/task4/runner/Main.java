package org.basics2.of.oop.task4.runner;

import org.basics2.of.oop.task4.controller.DragonActions;

import java.util.Scanner;

//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//выбора сокровищ на заданную сумму.
public class Main {
    public static double checkDoubleNum(int a){ //проверка вещественного числа
        Scanner sc=new Scanner(System.in);
        double x;
        do{
            while (!sc.hasNextDouble()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextDouble();
            if(x<=a) System.out.println("Error. Try again.");
        }while(x<=a);
        return x;
    }
    private static int checkMenuItem(int a){ //проверка целого числа
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

    public static void main(String[] args){
        int choice;
        double price;
        Scanner sc=new Scanner(System.in);
        DragonActions dragonActions=new DragonActions();
        while(true){
            choice=0;
            System.out.println("Select a menu item:\n 1)Get the most precious treasure;\n 2)Get the treasure of certain price;\n 3)Print the dragon's treasure;\n 4)Exit.");

            while(choice<1||choice>4){
                choice= checkMenuItem(0);
                if(choice<1||choice>7) System.out.println("Error.Try again.");
            }
            switch (choice) {
                case 1:
                    System.out.println(dragonActions.getTheMostPreciousTreasure().toString());
                    break;
                case 2:
                    System.out.println("Enter the price:");
                    price=checkDoubleNum(0);
                    System.out.println(dragonActions.getTreasureOfCertainPrice(price).toString());
                    break;
                case 3:
                    dragonActions.printTreasures();
                    break;
                case 4:
                    return;
            }
        }
    }
}
