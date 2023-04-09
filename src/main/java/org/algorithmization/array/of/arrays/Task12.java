package org.algorithmization.array.of.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.Math.random;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {
    static public void main(String[] args) {
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
        for (int[] ints : matr) {
            Arrays.sort(ints);
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        //по убыванию
        System.out.println("Sort in descending order:");
        for (int i = 0; i < matr.length; i++) {
            matr[i] = Arrays.stream(matr[i]).boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
