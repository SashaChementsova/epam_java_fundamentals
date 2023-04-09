package org.algorithmization.decomposition.using.methods;

import java.util.Scanner;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class Task17 {
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
    public static int getSumOfNumbers(int num){ //сумма цифр числа
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static int calculateIterations(int num){
        int sum=0;
        while(num>0){
            num-=getSumOfNumbers(num);
            sum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        int n = checkNum();
        System.out.println("The result: "+calculateIterations(n));
    }
}
