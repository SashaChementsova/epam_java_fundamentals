package org.algorithmization.one.dimensional.array;

import java.util.Arrays;
import java.util.Scanner;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
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

    public static int completeTask(int[] mass){
        int count = 0;
        int countMax = 0;
        int min = 0;
        int num = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = i; j < mass.length; j++) {
                if (mass[i] == mass[j]) { //если равны, + одно совпадение
                    count++;
                }
            }
            if (count >= countMax) { //сравниваем совпадения с максимальным числом совпадений
                if (count > countMax) {
                    min = i;
                } else {
                    min = (mass[i] < mass[min]) ? i : min;//если совпадения равны, ищем минимальный элемент
                }
                num = mass[min];
                countMax = count;
            }
            count = 0;
        }
        return num;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements of the array:");
        n = checkIntNum();
        int[] mass = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        Arrays.setAll(mass, i -> checkIntNum());
        System.out.println("The result: "+completeTask(mass));
    }
}
