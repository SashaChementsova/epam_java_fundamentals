package org.algorithmization.array.of.arrays;

import static java.lang.Math.random;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,n^2
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат.
public class Task16 {
    public static void printMatrix(int[][] m){
        for (int[] rows : m) {
            for (int columns : rows) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
    public static void generateArray(int matr[][])
    {
        int k = 1;
        for (int i = 0; i < matr.length; i++)
        {
            for (int j = 0; j < matr.length; j++)
            {
                matr[i][j] = k;
                k++;
            }
        }
    }

    public static void reverseArray1(int matr[][])
    {
        int t;
        for (int i = 0; i < matr.length / 2; i++)
        {
            for (int j = 0; j < matr.length / 2; j++)
            {
                if (i == j)
                {
                    t = matr[i][j];
                    matr[i][j] = matr[matr.length - 1 - i][matr.length - 1 - j];
                    matr[matr.length - 1 - i][matr.length - 1 - j] = t;
                }
            }
        }
    }

    public static void reverseArray2(int matr[][])
    {
        int t;
        for (int i = 0, j = matr.length - 1 - i; i <= (matr.length / 2) - 1; ++i, --j)
        {
            t = matr[i][j];
            matr[i][j] = matr[j][i];
            matr[j][i] = t;
        }
    }
    public static void main(String[] args) {
        int n=4;
        int[][] matr = new int[n][n];
        System.out.println("The matrix: ");
        generateArray(matr);
        printMatrix(matr);
        System.out.println("The magic square: ");
        reverseArray1(matr);
        reverseArray2(matr);
        printMatrix(matr);
    }

}
