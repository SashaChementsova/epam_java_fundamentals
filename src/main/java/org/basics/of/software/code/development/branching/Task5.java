package org.basics.of.software.code.development.branching;

import java.util.Scanner;

public class Task5 {
    public static double getResult(double x){
        if(x<=3){
            return Math.pow(x,2)-3*x+9;
        }
        else return 1/(Math.pow(x,3)+6);
    }
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x");
        x = sc.nextDouble();
        System.out.println("Result of the function: "+getResult(x));
    }
}
