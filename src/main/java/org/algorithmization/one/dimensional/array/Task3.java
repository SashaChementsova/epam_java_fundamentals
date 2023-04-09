package org.algorithmization.one.dimensional.array;

import java.util.Arrays;
import java.util.Scanner;

// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
public class Task3 {
    public static int checkNum(){ //проверка целого числа
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            System.out.println("Enter the size of sequence");
            while (!sc.hasNextInt()){
                System.out.println("Enter the size of sequence");
                sc.next();
            }
            x = sc.nextInt();
        }while(x<=0);
        return x;
    }
    public static void main(String[] args) {
        double[] mass = new double[checkNum()];
        int sumNull=0,sumPos=0, sumNeg=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        Arrays.setAll(mass, i -> sc.nextDouble());
        for (double v : mass) {
            if (v == 0) sumNull++;
            else if (v < 0) sumNeg++;
            else sumPos++;
        }
        System.out.println("Sum of null elements: "+sumNull);
        System.out.println("Sum of positive elements: "+sumPos);
        System.out.println("Sum of negative elements: "+sumNeg);
    }
}
