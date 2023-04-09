package org.algorithmization.sorting;

import java.util.Arrays;

import static java.lang.Math.random;

//Сортировка обменами. Дана последовательность чисел
//a1 < a2 <...< an. Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа
//a(i) и a(i+1). Если a(i) > a(i+1), то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
public class Task4 {
    public static int sortAscending(int[] mass) {
        int count=0,temp,flag=1;
        while(flag==1){
            flag=0;
            for(int i=0;i<mass.length-1;i++){
                if(mass[i]>mass[i+1]){
                    temp=mass[i];
                    mass[i]=mass[i+1];
                    mass[i+1]=temp;
                    count++;
                    flag=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] mass = new int[(int) ((random() * ((20 - 10) + 1)) + 10)];
        Arrays.setAll(mass, i -> (int) ((random() * ((9 - 1) + 1)) + 1));
        System.out.println("The array: " + Arrays.toString(mass));
        int count=sortAscending(mass);
        System.out.println("The result array: " + Arrays.toString(mass));
        System.out.println("Number of permutations: " + count );
    }
}
