package org.algorithmization.decomposition.using.methods;

import java.util.Arrays;
import java.util.Scanner;

//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.
public class Task10 {
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
    public static int[] reverseArray(int[] mass){ //переверунть массив
        for(int i = 0; i < mass.length / 2; i++)
        {
            int temp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = temp;
        }
        return mass;
    }
    public static int[] getMass(int num){
        int[] mass=new int[getSize(num)];
        for(int i=0;i<mass.length;i++){
            mass[i]=num%10;
            num/=10;
        }
        return reverseArray(mass);
    }
    public static void main(String[] args){
        System.out.println("Enter the number");
        int num=checkNum();
        System.out.println("The result: "+ Arrays.toString(getMass(num)));
    }
}
