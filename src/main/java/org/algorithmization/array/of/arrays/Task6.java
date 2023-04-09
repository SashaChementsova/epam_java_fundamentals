package org.algorithmization.array.of.arrays;

import java.util.Scanner;

public class Task6 {
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
    static public void main(String[] args) {
        System.out.println("Enter the size of the square matrix");
        int n ;
        while (true) {
            n = checkIntNum();
            if (n % 2 != 0) {
                System.out.println("It must be even");
            } else break;
        }
        int[][] matr = new int[n][n];
        for (int i = 0; i < matr.length/2; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if(j >= i && j < matr[i].length - i) {
                    System.out.print((matr[i][j] = 1) + " ");
                } else {
                    System.out.print(matr[i][j] + " ");
                }
            }
            System.out.println();
        }
        for (int i = matr.length/2; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if(j <= i && j >= matr[i].length - 1 - i) {
                    System.out.print((matr[i][j] = 1) + " ");
                } else {
                    System.out.print(matr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
