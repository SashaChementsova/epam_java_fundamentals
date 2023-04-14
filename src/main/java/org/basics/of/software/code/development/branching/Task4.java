package org.basics.of.software.code.development.branching;

import java.awt.*;
import java.util.Scanner;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
public class Task4 {
    public static String checkResult(double A, double B, double x, double y, double z){
        if((x<=B&&y<=A)||(x<=A&&y<=B)||(x<=B&&z<=A)||(x<=A&&z<=B)||(y<=A&&z<=B)||(y<=B&&z<=A)){
            return "The brick can pass through the hole";
        }
        else return "The brick can't pass through the hole";
    }
    public static void main(String[] args){
        double A,B,x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number A");
        A=sc.nextDouble();
        System.out.println("Enter the number B");
        B=sc.nextDouble();
        System.out.println("Enter the number x");
        x=sc.nextDouble();
        System.out.println("Enter the number y");
        y=sc.nextDouble();
        System.out.println("Enter the number z");
        z=sc.nextDouble();
        System.out.println("Result of checking: "+ checkResult(A,B,x,y,z));
    }
}
