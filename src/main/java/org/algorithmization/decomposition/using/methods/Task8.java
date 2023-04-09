package org.algorithmization.decomposition.using.methods;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.
public class Task8 {
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
    public static int[] checkRange(int size){ //проверяем начало и конец диапазона
        int[] k=new int[2];
        while(true){
            System.out.println("Enter the beginning of the range:");
            k[0] = checkIntNum();
            System.out.println("Enter the ending of the range:");
            k[1] = checkIntNum();
            if(k[0]>=k[1]||k[0]>size||k[1]>size) System.out.println("Error. Try again");
            else break;
        }
        return k;
    }

    public static int getSum(int[] mass, int k, int m){
        int sum=0;
        for(int i=k-1;i<=m-1;i++){
            sum+=mass[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements of the array:");
        n = checkIntNum();
        int[] mass = new int[n],k=new int[2];
        Arrays.setAll(mass, i -> (int) ((random() * ((9 - 1) + 1)) + 1));
        System.out.println(Arrays.toString(mass));
        k=checkRange(mass.length);
        System.out.println("The result: "+getSum(mass,k[0],k[1]));
    }
}
