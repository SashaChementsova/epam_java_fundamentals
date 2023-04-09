package org.algorithmization.array.of.arrays;

import static java.lang.Math.random;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.
public class Task11 {
    static public void main(String[] args) {
        int[][] matr = new int[10][20];
        int count,flag=0;
        System.out.println("The square matrix:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (int) (random() * ((15) + 1));
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The task:");
        for (int i = 0; i < matr.length; i++) {
            count=0;
            for (int j = 0; j < matr[i].length; j++) {
                if(matr[i][j]==5) count++;
                if(count==3){
                    System.out.print(i+1 + " ");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0) System.out.println("There is no such row.");
    }
}
