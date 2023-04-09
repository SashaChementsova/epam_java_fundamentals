package org.algorithmization.one.dimensional.array;

import java.util.Arrays;
import java.util.Scanner;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
public class Task2 {
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
    public static void main(String args[]){
        double[] mass=new double[checkNum()];
        double sum=0,z;
        int k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements");
        Arrays.setAll(mass, i -> sc.nextDouble());
        System.out.println("Enter the number z");
        z=sc.nextDouble();
        for(int i=0;i<mass.length;i++){
            if(mass[i]>z){
                mass[i]=z;
                k++;
            }
        }
        System.out.println("The result array:");
        for (double v : mass) {
            System.out.print(v + " ");
        }
        System.out.println("\nNumber of replaces: "+k);
    }
}
