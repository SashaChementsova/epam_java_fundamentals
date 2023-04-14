package org.basics.of.software.code.development.branching;

import java.util.Scanner;
// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.
public class Task1 {
    public static String checkTriangle(double angle1,double angle2){
        double sum=angle1+angle2;
        if(sum<180){
            if(180-sum==90||angle1==90||angle2==9){
                return "It's a right triangle";
            }
            else return "It's not a right triangle";
        }
        else return "It's not a triangle";
    }
    public static void main(String[] args){
        double angle1,angle2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first angle");
        angle1=sc.nextDouble();
        System.out.println("Enter the second angle");
        angle2=sc.nextDouble();
        System.out.println("Result of checking: "+checkTriangle(angle1,angle2));
    }
}
