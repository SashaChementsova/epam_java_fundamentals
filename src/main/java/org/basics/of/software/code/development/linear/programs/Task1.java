package org.basics.of.software.code.development.linear.programs;

import java.util.Scanner;
//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
public class Task1 {
    public static double getResultOfFunction(double a, double b, double c){
        return ((a-3)*b/2)+c;
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
