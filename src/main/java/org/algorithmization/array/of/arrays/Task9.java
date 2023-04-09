package org.algorithmization.array.of.arrays;

import java.util.Scanner;

import static java.lang.Math.random;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
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

    static public void main(String[] args) {
        int [][] matr=new int[(int) ((random() * ((10 - 3) + 1)) + 3)][(int) ((random() * ((10 - 3) + 1)) + 3)];
        int[] sum=new int[matr[0].length];
        int maxSum=0,col=0;
        System.out.println("The matrix:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (int) (random() * ((99 - 10) + 1)) + 10;
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < sum.length; i++) {
            for (int[] ints : matr) {
                sum[i] += ints[i];
            }
            if (sum[i] > maxSum) {
                maxSum = sum[i];
                col = i;
            }
            System.out.println("The column: " + (i+1) + ". The sum of column elements: " + sum[i]);
        }
        System.out.println("The column " + (col+1) + " has the largest sum of elements: " + sum[col]);
    }
}
