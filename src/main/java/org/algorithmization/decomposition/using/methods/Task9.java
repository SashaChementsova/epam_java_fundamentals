package org.algorithmization.decomposition.using.methods;

import java.util.Scanner;

//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.
public class Task9 {
    public static int checkIntNum(){ //проверка целого числа
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            while (!sc.hasNextInt()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextInt();
        }while(x<=0);
        return x;
    }
    public static int checkNum(){ //проверка на отриц. числа и 0
        int x=-1;
        while(x<=0){
            x=checkIntNum();
            if(x<=0) System.out.println("Error. Try again.");
        }
        return x;
    }
    public static double getSquareOfRightTriangle(int x,int y){ //Площадь прямоугольного треугольника
        return 0.5*x*y;
    }
    public static double getHypotenuse(int x,int y){ //Гипотенуза прямоугольного треугольника
        return Math.pow((Math.pow(x,2)+Math.pow(y,2)),0.5);
    }
    public static double getSquareHeron(double h, int z,int t){ //Формула Герона
        double p=(h+z+t)/2;
        return Math.pow((p*(p-h)*(p-z)*(p-t)),0.5);
    }

    public static double getSquare(int x,int y, int z, int t){ //Площадь четырезугольника
        double square=0;
        square+=getSquareOfRightTriangle(x,y);
        square+=getSquareHeron(getHypotenuse(x,y),z,t);
        return square;
    }
    public static void main(String args[]){
        int x,y,z,t;
        System.out.println("Enter the x side:");
        x=checkNum();
        System.out.println("Enter the y side:");
        y=checkNum();
        System.out.println("Enter the z side:");
        z=checkNum();
        System.out.println("Enter the t side:");
        t=checkNum();
        System.out.println("Square: "+getSquare(x,y,z,t));
    }
}
