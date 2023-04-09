package org.basics.of.software.code.development.linear.programs;

import java.util.Scanner;

public class Task2 {
    public static double getResultOfFunction(double a, double b, double c){
        return ((b+Math.pow(Math.pow(b,2)+4*a*c,0.5))/(2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
    }
    public static void main(String[] args){
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a:");
        a=sc.nextDouble();
        System.out.println("Enter the number b:");
        b=sc.nextDouble();
        System.out.println("Enter the number c:");
        c=sc.nextDouble();
        System.out.println("Result of the function: "+getResultOfFunction(a,b,c));

    }
}
