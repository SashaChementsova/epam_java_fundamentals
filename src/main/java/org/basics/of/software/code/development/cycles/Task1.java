package org.basics.of.software.code.development.cycles;

import java.util.Scanner;
//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.
public class Task1 {
    public static int checkNum(){
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("Enter a positive integer:");
            while (!sc.hasNextInt()){
                System.out.println("Enter a positive integer:");
                sc.next();
            }
            x = sc.nextInt();
        }while (x  <= 0);
        return x;
    }
    public static void main(String[] args){
        int x=checkNum(),sum=0;
        for(int i=1;i<x;i++){
            sum+=i;
        }
        System.out.println("Result: "+sum);
    }
}
