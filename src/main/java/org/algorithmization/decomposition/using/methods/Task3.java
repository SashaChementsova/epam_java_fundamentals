package org.algorithmization.decomposition.using.methods;

import java.util.Scanner;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.
public class Task3 {
    public static double checkDoubleNum(){ //проверка вещественного числа
        Scanner sc=new Scanner(System.in);
        double x;
        do{
            while (!sc.hasNextDouble()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextDouble();
        }while(x<=0);
        return x;
    }
    public static double checkNum(){ //проверка на отриц. числа и 0
        double x=-1;
        while(x<=0){
            x=checkDoubleNum();
            if(x<=0) System.out.println("Error. Try again.");
        }
        return x;
    }
    public static double getTriangleSquare(double a){
        return (Math.pow(a,2)*Math.pow(3,0.5))/4;
    }
    public static double getHexagonSquare(double a){
        return 6*getTriangleSquare(a);
    }
    public static void main(String[] args){
        System.out.println("Enter the length of the side of a regular hexagon:");
        double a=checkNum();
        System.out.println("The square of regular hexagon: "+getHexagonSquare(a));
    }
}
