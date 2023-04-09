package org.algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

//Пусть даны две неубывающие последовательности действительных чисел
//a1 <= a2<=...<= an и b1 <= b2 <=...<= bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1 <= b2 <=...<= bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.
public class Task7 {
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

    public static void completeTask(int[] mass1, int[] mass2){
        for (int i = 0; i < mass2.length; i++) {
            for (int j = 0; j < mass1.length; j++) {

                if (j == 0) {
                    if (mass2[i] <= mass1[j]) {
                        System.out.println(mass2[i] + " from the second array insert before index " + j + " in the first array");

                    } else if(mass2[i] >= mass1[j] && mass2[i] <= mass1[j + 1] ) {
                        System.out.println(mass2[i] + " from the second array insert after index " + j + " in the first array");
                    }

                } else if (j == mass1.length - 1) {
                    if (mass2[i] > mass1[j]) {
                        System.out.println(mass2[i] + " from the second array insert after index " + j + " in the first array");
                    }
                } else if (j != 0 && j != mass1.length - 1) {
                    if(mass2[i] >= mass1[j] && mass2[i] <= mass1[j + 1] ) {
                        System.out.println(mass2[i] + " from the second array insert after index " + j + " in the first array");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int n1, n2, k = 0;
        System.out.println("Enter the size of the first array");
        n1 = checkIntNum();
        System.out.println("Enter the size of the second array");
        n2 = checkIntNum();
        int[] mass1 = new int[n1];
        Arrays.setAll(mass1, i -> (int) ((random() * ((9 - 1) + 1)) + 1));
        int[] mass2 = new int[n2];
        Arrays.setAll(mass2, i -> (int) ((random() * ((9 - 1) + 1)) + 1));
        Arrays.sort(mass1);
        Arrays.sort(mass2);
        System.out.println("The first array: " + Arrays.toString(mass1));
        System.out.println("The second array: " + Arrays.toString(mass2));
        completeTask(mass1,mass2);
    }
}
