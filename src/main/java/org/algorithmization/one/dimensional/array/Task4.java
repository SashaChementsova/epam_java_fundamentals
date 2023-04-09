package org.algorithmization.one.dimensional.array;

import java.util.Arrays;
import java.util.Scanner;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
public class Task4 {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        Arrays.setAll(mass, i -> sc.nextDouble());
        double min=mass[0],max=mass[0];
        for ( int i = 1; i < mass.length; i++ ) {
            if ( min > mass[i] ) min = mass[i];
            if ( max < mass[i] ) max = mass[i];
        }
        System.out.println("The minimum number in the array: "+min);
        System.out.println("The maximum number in the array: "+max);
        for ( int i = 0; i < mass.length; i++ ) {
            if(mass[i]==min) mass[i]=max;
            else if(mass[i]==max) mass[i] =min;
        }
        System.out.println("The result array:");
        for (double v : mass) {
            System.out.print(v + " ");
        }
    }
}
