package org.algorithmization.decomposition.using.methods;

import java.util.Scanner;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
public class Task2 {
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
    public static int checkNaturalNum(){ //проверка натурального числа
        int x=-1;
        while(x<0){
            x=checkIntNum();
            if(x<0) System.out.println("Error. Try again.");
        }
        return x;
    }
    public static int getGCD(int a, int b){  //НОД
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int getGCDWithMass(int [] mass){  //НОД
        int gcd=mass[0];
        for(int i=1;i<mass.length;i++){
            gcd=getGCD(gcd,mass[i]);
        }
        return gcd;
    }

    public static void main(String[] args){
        int[] mass=new int[4];
        System.out.println("Enter the first number");
        mass[0]=checkNaturalNum();
        System.out.println("Enter the second number");
        mass[1]=checkNaturalNum();
        System.out.println("Enter the third number");
        mass[2]=checkNaturalNum();
        System.out.println("Enter the forth number");
        mass[3]=checkNaturalNum();
        System.out.println("The greatest common divisor: "+getGCDWithMass(mass));
    }
}
