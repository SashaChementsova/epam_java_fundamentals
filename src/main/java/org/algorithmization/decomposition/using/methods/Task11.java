package org.algorithmization.decomposition.using.methods;

import java.util.Arrays;
import java.util.Scanner;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class Task11 {
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
    public static int getSize(int num){ //количество цифр в числе
        return String.valueOf(num).length();
    }
    public static String checkNums(int num1,int num2){
        if(getSize(num1)>getSize(num2)){
            return "The first number is larger in size";
        }
        else if (getSize(num1)<getSize(num2)){
            return "The second number is larger in size";
        }
        else{
            return "The numbers are equal in size";
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the first number");
        int num1=checkNum();
        System.out.println("Enter the second number");
        int num2=checkNum();
        System.out.println("The result: "+checkNums(num1,num2));
    }
}
