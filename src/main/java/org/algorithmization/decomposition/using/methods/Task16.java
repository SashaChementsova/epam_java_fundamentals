package org.algorithmization.decomposition.using.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
public class Task16 {
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
    public static int checkNum(){ //проверка на число больше 0
        int x=-1;
        while(!(x>0)){
            x=checkIntNum();
            if(!(x>0)) System.out.println("Error. Try again.");
        }
        return x;
    }


    public static boolean checkOdd(int num){ //сумма цифр числа
        while(num!=0) {
            if((num%10)%2!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
    public static int calculateOdd(int num){ //сумма цифр числа
        int sum=0;
        while(num!=0) {
            if((num%10)%2==0){
                sum++;
            }
            num/=10;
        }
        return sum;
    }

    public static int calculateSum(int n){
        int sum=0;
        int end= (int) Math.pow(10,n),begin=end/10;
        for(int i=begin;i<end;i++){
            if(checkOdd(i)) sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the numbers:");
        int n = checkNum();
        int sum=calculateSum(n);
        System.out.println("The sum of odd numbers: " + sum);
        System.out.println("The number of odd numbers in the sum: " + calculateOdd(sum));
    }
}
