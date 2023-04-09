package org.basics.of.software.code.development.linear.programs;

import java.util.Scanner;

public class Task5 {
    public static String getHoursMinSec(int seconds) {
        int hours=seconds/3600; //итоговое количество часов
        int min=(seconds - hours * 360) / 60; //итоговое количество минут
        int sec = seconds - hours * 360 - min * 60;  //итоговое количество секунд
        return hours+" h. "+min+" min. "+sec+" sec.";
    }
    public static void main(String[] args){
        int seconds;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        seconds=sc.nextInt();
        System.out.println("Time: "+ getHoursMinSec(seconds));
    }
}
