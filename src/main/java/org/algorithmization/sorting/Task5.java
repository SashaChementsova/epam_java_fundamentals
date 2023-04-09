package org.algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

// Сортировка вставками. Дана последовательность чисел
// a1, a1, ..., an. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть
// a1, a1, ..., ai - упорядоченная последовательность, т. е.
//a1< a1< ...< an. Берется следующее число a(i+1)
//и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
public class Task5 {
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
    private static int[] insertsSort(int[] mass, int el) {
        int tempInsert = el;
        int[] newmass = new int[mass.length + 1];
        while (binarySearch(mass, el) == -1){
            el--;
        }
        int temp = binarySearch(mass, el);
        for (int j = 0; j < newmass.length; j++) {
            if (j <= temp) {
                newmass[j] = mass[j];
            }
            else if (j > temp + 1){
                newmass[j] = mass[j - 1];
            }
            else {
                newmass[temp + 1] = tempInsert;
            }
        }
        return newmass;
    }
    private static int binarySearch(int [] mass, int value){
        int begin = 0;
        int end = mass.length - 1;
        while (begin <= end) {
            int middle = begin + (end - begin) / 2;
            if (mass[middle] < value){
                begin = middle + 1;
            }
            else if (mass[middle] > value) {
                end = middle - 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] mass = new int[(int) ((random() * ((20 - 10) + 1)) + 10)];
        Arrays.setAll(mass, i -> (int) ((random() * ((9 - 1) + 1)) + 1));
        Arrays.sort(mass);
        System.out.println("The array: " + Arrays.toString(mass));
        System.out.println("Enter the new element of array");
        int el=checkIntNum();
        System.out.println("The result array: " + Arrays.toString(insertsSort(mass,el)));
    }
}
