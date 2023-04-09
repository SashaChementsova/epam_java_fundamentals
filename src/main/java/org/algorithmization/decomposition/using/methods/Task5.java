package org.algorithmization.decomposition.using.methods;

import java.util.Arrays;
import java.util.Scanner;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).
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
    public static double checkDoubleNum(){ //проверка вещественного числа
        Scanner sc=new Scanner(System.in);
        double x;
        do{
            while (!sc.hasNextDouble()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextDouble();
        }while(x<=0);
        return x;
    }
    public static double findSecondMax(double[] mass){
        double max=mass[0],secondMax=mass[0];

        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max) {
                secondMax = max;
                max = mass[i];
            } else if (mass[i] > secondMax) {
                secondMax = mass[i];
            }
        }
        return secondMax;
    }
    public static void main(String args[]) {
        System.out.println("Enter the size of the array:");
        double[] mass = new double[checkIntNum()];
        double sum = 0, z;
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        Arrays.setAll(mass, i -> checkDoubleNum());
        System.out.println("The second largest number in the array: "+findSecondMax(mass));
    }
}
