package org.algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.
public class Task1 {
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
    public static void main(String[] args){
        int k=-1,n1,n2;
        System.out.println("Enter the size of the first array");
        n1=checkIntNum();
        System.out.println("Enter the size of the second array");
        n2=checkIntNum();
        System.out.println("Enter the index of the place of insertion");
        while(k>n1||k<1){
            k=checkIntNum();
            if (k>n1||k<0) System.out.println("Error.Try again");
        }
        int[] mass1=new int[n1+n2];
        for(int i=0;i<n1;i++){
            mass1[i]=(int) ((random() * ((9 - 1) + 1)) + 1);
        }
        int[] mass2=new int[n2];
        Arrays.setAll(mass2, i -> (int) ((random() * ((9 - 1) + 1)) + 1));
        System.out.println("The first array: "+ Arrays.toString(mass1));
        System.out.println("The second array: "+ Arrays.toString(mass2));
        System.arraycopy(mass1, k, mass1, k+n2, n1-k);
        System.arraycopy(mass2, 0, mass1, k, n2);
        System.out.println("The result array: "+ Arrays.toString(mass1));

    }
}
