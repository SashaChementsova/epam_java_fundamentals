package org.algorithmization.array.of.arrays;

import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
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
    public static void main(String[] args) {
        int k, p;
        int[][] matr = {{2, 4, 8, 5, 4, 2, 7, 9, 3},
                {8, 2, 3, 4, 2, 7, 5, 6, 7},
                {5, 4, 5, 5, 2, 6, 4, 8, 0},
                {4, 6, 5, 3, 5, 3, 2, 4, 5}};
        System.out.println("Enter the column p");
        p = checkIntNum();
        System.out.println("Enter the row k");
        k = checkIntNum();
        System.out.println("The column p: ");
        try {
            for (int i = 0; i < matr.length; i++) {
                System.out.print(matr[i][p-1] + " ");
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no such column.");
        }
        System.out.println("The row k:");
        try {
            for (int i = 0; i < matr[k-1].length; i++) {
                System.out.print(matr[k-1][i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no such row.");
        }
    }
}
