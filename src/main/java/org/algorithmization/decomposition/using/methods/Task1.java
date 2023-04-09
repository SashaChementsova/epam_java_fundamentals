package org.algorithmization.decomposition.using.methods;

import java.util.Scanner;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел
public class Task1 {
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
    public static int getGCD(int a, int b){  //НОД
        int a1=a,b1=b;
        while (b1 != 0) {
            int temp = b1;
            b1 = a1 % b1;
            a1 = temp;
        }
        return a1;
    }
    public static int getSCM(int a, int b){ //НОК
        return a / getGCD(a, b) * b;
    }
    public static void main(String[] args){
        int a=-1,b=-1;
        System.out.println("Enter the first number");
        while(a<0){
            a=checkIntNum();
            if(a<0) System.out.println("Error. Try again.");
        }
        System.out.println("Enter the second number");
        while(b<0){
            b=checkIntNum();
            if(b<0) System.out.println("Error. Try again.");
        }
        System.out.println("The greatest common divisor: "+getGCD(a,b));
        System.out.println("The smallest common multiple: "+getSCM(a,b));
    }
}
