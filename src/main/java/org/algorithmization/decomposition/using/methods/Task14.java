package org.algorithmization.decomposition.using.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.
public class Task14 {
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
    public static int checkNum(){ //проверка на число больше 2
        int x=-1;
        while(!(x>2)){
            x=checkIntNum();
            if(!(x>2)) System.out.println("Error. Try again.");
        }
        return x;
    }
    public static int[] convertIntegers(List<Integer> integers) //преобразование в массив int из списка
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    public static int getSize(int num){ //количество цифр в числе
        return String.valueOf(num).length();
    }
    public static int getSumOfNumbers(int num){ //сумма цифр числа
       int sum=0;
       while(num!=0){
           sum+=num%10;
           num/=10;
       }
       return sum;
    }

    public static boolean isArmstrong(int num){ //поверка числа Армстронга
        return num==Math.pow(getSumOfNumbers(num),getSize(num));
    }
    public static int[] createArray(int k){
        List<Integer> mass = new ArrayList<Integer>();
        for(int i=1;i<=k;i++){
            if(isArmstrong(i)) mass.add(i);
        }
        return convertIntegers(mass);
    }

    public static void main(String[] args) {
        System.out.println("Enter the ending of the range:");
        int k = checkNum();
        System.out.println("The result: "+ Arrays.toString(createArray(k)));

    }
}
