package org.basics.of.software.code.development.linear.programs;

import java.util.Scanner;

public class Task3 {
    public static double getResultOfFunction(double x, double y){
        return ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
    }
    public static void main(String[] args){
        double x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number x:");
        x=sc.nextDouble();
        System.out.println("Enter the number y:");
        y=sc.nextDouble();
        System.out.println("Result of the function: "+getResultOfFunction(x,y));

    }
}
