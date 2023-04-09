package org.algorithmization.array.of.arrays;

import static java.lang.Math.random;

//Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    static public void main(String[] args) {
        int n=(int) ((random() * ((10 - 3) + 1)) + 3);
        int [][] matr=new int[n][n];
        System.out.println("The square matrix:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (int) (random() * ((9 - (-9)) + 1)) + (-9);
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The positive elements of the main diagonal:");
        for (int i = 0; i < matr.length; i++) {
            if(matr[i][i]>0){
                System.out.print(matr[i][i]+" ");
            }
        }
    }
}
