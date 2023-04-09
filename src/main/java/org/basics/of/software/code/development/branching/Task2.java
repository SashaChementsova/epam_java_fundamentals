package org.basics.of.software.code.development.branching;

import java.util.Scanner;

public class Task2 {
    public static double getResult(double a,double b,double c,double d){
        return Math.max(Math.min(a,b),Math.min(c,d));
    }
    public static void main(String[] args){
        double a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a:");
        a=sc.nextDouble();
        System.out.println("Enter the number b:");
        b=sc.nextDouble();
        System.out.println("Enter the number c:");
        c=sc.nextDouble();
        System.out.println("Enter the number d:");
        d=sc.nextDouble();
        System.out.println("Result of the expression: "+getResult(a,b,c,d));
    }
}
