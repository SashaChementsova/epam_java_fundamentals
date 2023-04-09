package org.basics.of.software.code.development.linear.programs;

import java.util.Scanner;

public class Task6 {
    public static boolean checkPoint(double x, double y){
        if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            return true;
        } else return (x >= -2 && x <= 2 && y >= 0 && y <= 4);
    }
    public static void main(String[] args){
        double x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x coordinate:");
        x=sc.nextDouble();
        System.out.println("Enter the y coordinate:");
        y=sc.nextDouble();
        System.out.println("Belonging of the point to the given area: "+checkPoint(x,y));

    }
}
