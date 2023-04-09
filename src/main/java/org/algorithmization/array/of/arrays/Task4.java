package org.algorithmization.array.of.arrays;

import java.util.Scanner;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task4 {
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
    static public void main(String[] args){
        System.out.println("Enter the size of the square matrix");
        int n;
        while(true){
            n=checkIntNum();
            if(n%2!=0){
                System.out.println("It must be even");
            }
            else break;
        }
        int[][] matr=new int[n][n];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if(i % 2 !=0 ){
                    System.out.print((matr[i][j] = (matr.length - j)) + " ");
                } else {
                    System.out.print((matr[i][j] = (j + 1)) + " ");
                }
            }
            System.out.println();
        }
    }
}
