package org.algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

//Сортировка выбором. Дана последовательность чисел
//a1 < a2 <...< an. Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.
public class Task3 {
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
    public static int[] sortDescending(int[] mass) {
        int maxIndex,temp;
        for (int i = 0; i < mass.length - 1; i++) {
            maxIndex = i;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[maxIndex] < mass[j]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                temp = mass[i];
                mass[i] = mass[maxIndex];
                mass[maxIndex] = temp;
            }
        }
        return mass;
    }
    public static void main(String[] args) {
        int[] mass = new int[(int) ((random() * ((20 - 10) + 1)) + 10)];
        Arrays.setAll(mass, i -> (int) ((random() * ((9 - 1) + 1)) + 1));
        System.out.println("The array: " + Arrays.toString(mass));
        System.out.println("The result array: " + Arrays.toString(sortDescending(mass)));
    }
}
