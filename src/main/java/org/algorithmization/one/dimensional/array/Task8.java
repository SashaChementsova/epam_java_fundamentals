package org.algorithmization.one.dimensional.array;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

//Дана последовательность целых чисел a1, a2,..., an. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1, a2,..., an).
public class Task8 {

    public static int getMinElement(int[] mass){ //минимальное число в последовательности
        return  Arrays.stream(mass).min().getAsInt();
    }
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


    public static int[] getNewProgression(int[] mass){ //удаление элементов
        return ArrayUtils.removeAllOccurences(mass, getMinElement(mass));
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements of the sequence:");
        n = checkIntNum();
        int[] mass=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the sequence:");
        Arrays.setAll(mass, i -> sc.nextInt());
        System.out.println("The minimum element: "+getMinElement(mass));
        mass=getNewProgression(mass);
        System.out.println("The result:");
        for (double v : mass) {
            System.out.print(v + " ");
        }
    }
}
