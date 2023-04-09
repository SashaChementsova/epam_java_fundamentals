package org.algorithmization.one.dimensional.array;

import java.util.Arrays;
import java.util.Scanner;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Task10 {
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

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements of the array:");
        n = checkIntNum();
        int[] mass = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        Arrays.setAll(mass, i -> checkIntNum());
        for(int i=1;i<mass.length;i+=2){
            mass[i]=0;
        }
        System.out.println("The result array:");
        for (int j : mass) {
            System.out.print(j + " ");
        }
    }
}
