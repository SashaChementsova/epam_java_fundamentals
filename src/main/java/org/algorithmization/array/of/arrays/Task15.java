package org.algorithmization.array.of.arrays;

import static java.lang.Math.random;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task15 {
    static int getMax(int matr[][])
    {
        int max = 0;
        for (int i = 0; i < matr.length; ++i) {
            for (int j = 0; j < matr[0].length; ++j) {
                max = Math.max(matr[i][j], max);
            }
        }
        return max;
    }
    public static void doSwitch(int[][] matr,int max){
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                if(matr[i][j]%2!=0) matr[i][j]=max;
            }
        }
    }
    public static void printMatrix(int[][] m){
        for (int[] rows : m) {
            for (int columns : rows) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matr = new int[(int) ((random() * ((6 - 3) + 1)) + 3)][(int) ((random() * ((6 - 3) + 1)) + 3)];
        System.out.println("The matrix:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (int) (random() * ((99 - 10) + 1)) + 10;
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        int max=getMax(matr);
        System.out.print("The maximum element: "+max);
        doSwitch(matr,max);
        System.out.println("\nThe result matrix:");
        printMatrix(matr);
    }
}
