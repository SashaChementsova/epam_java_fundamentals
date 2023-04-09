package org.algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

// Даны две последовательности
//a1< a2<...< an и b1<b2<...<bm
//. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
public class Task2 {
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
    public static void main(String[] args) {
        int n1, n2,k=0;
        System.out.println("Enter the size of the first array");
        n1 = checkIntNum();
        System.out.println("Enter the size of the second array");
        n2 = checkIntNum();
        int[] mass1 = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mass1[i] = (int) ((random() * ((9 - 1) + 1)) + 1);
        }
        int[] mass2 = new int[n2];
        Arrays.setAll(mass2, i -> (int) ((random() * ((9 - 1) + 1)) + 1));
        Arrays.sort(mass1);
        Arrays.sort(mass2);
        System.out.println("The first array: "+ Arrays.toString(mass1));
        System.out.println("The second array: "+ Arrays.toString(mass2));
        System.arraycopy(mass2, 0, mass1,0, n2);
        Arrays.sort(mass1);
        System.out.println("The result array: "+ Arrays.toString(mass1));
    }
}

