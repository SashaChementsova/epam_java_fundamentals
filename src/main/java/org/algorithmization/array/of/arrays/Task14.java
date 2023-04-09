package org.algorithmization.array.of.arrays;

import static java.lang.Math.random;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
public class Task14 {
    public static void main(String[] args) {
        int m= (int) ((random() * ((10 - 3) + 1)) + 3),n=11;
        while(!(m>=n)){
            n=(int) ((random() * ((10 - 3) + 1)) + 3);
        }
        int[][] matr = new int[m][n];
        int count ;
        for (int i = 0; i < n; i++) {
            count = 0;
            while (count != i + 1) {
                int j = (int) (random() * (matr.length));
                if (matr[j][i] == 0) {
                    matr[j][i] = 1;
                    count++;
                }
            }
        }
        System.out.println("The result: ");
        for (int[] rows : matr) {
            for (int columns : rows) {
                System.out.print(columns+ " ");
            }
            System.out.println();
        }
    }
}
