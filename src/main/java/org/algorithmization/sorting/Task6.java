package org.algorithmization.sorting;

import java.util.Arrays;

import static java.lang.Math.random;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1
//. Если ai < ai+1, то продвигаются на один элемент вперед. Если ai > ai+1
//, то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.
public class Task6 {

    public static int[] sortShella(int[] mass) {
        for (int gap = mass.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < mass.length; i++) {
                int key = mass[i];
                int j = i;
                while (j >= gap && mass[j - gap] > key) {
                    mass[j] = mass[j - gap];
                    j -= gap;
                }
                mass[j] = key;
            }
        }
        return mass;
    }
    public static void main(String[] args) {
        int[] mass = new int[(int) ((random() * ((20 - 10) + 1)) + 10)];
        Arrays.setAll(mass, i -> (int) ((random() * ((9 - 1) + 1)) + 1));
        System.out.println("The array: " + Arrays.toString(mass));
        System.out.println("The result array: " + Arrays.toString(sortShella(mass)));
    }
}
