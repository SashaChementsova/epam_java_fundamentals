package org.algorithmization.one.dimensional.array;

import java.util.Scanner;
// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task1 {
    public static int checkNum(){ //проверка целого числа
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter the number k");
        while (!sc.hasNextInt()){
            System.out.println("Error. It should be integer.");
            sc.next();
        }
        x = sc.nextInt();
        return x;
    }
    public static void main(String[] args){
        int[] mass=new int[]{2,54,52,8,35,24,28,85};
        int sum=0,k=checkNum();
        for (int j : mass) {
            if (j % k == 0) {
                sum += j;
            }
        }
        System.out.println("The result: "+sum);
    }
}
