package org.algorithmization.array.of.arrays;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
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
            for (int j = matr[i].length - 1; j >= 0; j--) {
                if (i <= j) {
                    System.out.print((matr[i][j] = (i + 1)) + " ");
                } else {
                    System.out.print(matr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
