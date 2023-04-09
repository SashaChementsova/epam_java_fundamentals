package org.algorithmization.array.of.arrays;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void main(String[] args) {
        int[][] matr = {{2, 4, 8, 5},
                        {8, 2, 3, 4},
                        {5, 4, 5, 5},
                        {4, 6, 5, 3}};
        for (int i =0; i < matr.length; i++) {
            System.out.print(matr[i][i] + " ");
        }
    }

}
