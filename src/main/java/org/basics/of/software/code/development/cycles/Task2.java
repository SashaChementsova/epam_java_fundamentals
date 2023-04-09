package org.basics.of.software.code.development.cycles;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        double a,b,h,y;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the beginning of the segment:");
            a=sc.nextDouble();
            System.out.println("Enter the ending of the segment:");
            b=sc.nextDouble();
        }while(a>=b);
        System.out.println("Enter the sequence step:");
        h=sc.nextDouble();
        for(double i=a;i<=b;i+=h){
            System.out.print("X:"+i);
            if(i<=2&&i!=0){
                y=-1*i;
            }
            else y=i;
            System.out.println(" Y:"+y);
        }
    }
}
