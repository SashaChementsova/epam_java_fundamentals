package org.basics.of.software.code.development.linear.programs;

import java.util.Scanner;

public class Task4 {
    public static double swapPlaces(double x){
        return (x * 1000) % 1000 + (int) x / 1000.0;
    }
    public static void main(String[] args){
        double x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number x:");
        x=sc.nextDouble();
        System.out.println("Modified number: "+swapPlaces(x));

    }
}
