package org.algorithmization.array.of.arrays;

import java.util.Arrays;
import java.util.Collections;

import static java.lang.Math.random;

//Отсотрировать столбцы матрицы по возрастанию и убыванию значений эементов.
public class Task13 {
    public static void sortAscendingOrder(int [][] m) {
        int temp;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                for (int k = 0; k < m[j].length; k++) {
                    if (m[i][k] < m[j][k]) {
                        temp = m[j][k];
                        m[j][k] = m[i][k];
                        m[i][k] = temp;
                    }
                }
            }
        }
    }
    public static void sortDescendingOrder(int [][] m) {
        int temp;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                for (int k = 0; k < m[j].length; k++) {
                    if (m[i][k] > m[j][k]) {
                        temp = m[i][k];
                        m[i][k] = m[j][k];
                        m[j][k] = temp;
                    }
                }
            }
        }
    }
    public static void printMatrix(int[][] m){
        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] matr = new int[(int) ((random() * ((10 - 3) + 1)) + 3)][(int) ((random() * ((10 - 3) + 1)) + 3)];
        System.out.println("The matrix:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (int) (random() * ((99 - 10) + 1)) + 10;
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        //по возрастанию
        System.out.println("Sort in ascending order:");
        sortAscendingOrder(matr);
        printMatrix(matr);
        //по убыванию
        System.out.println("Sort in descending order:");
        sortDescendingOrder(matr);
        printMatrix(matr);
    }
}
