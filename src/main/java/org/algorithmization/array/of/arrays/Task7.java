package org.algorithmization.array.of.arrays;

import java.util.Scanner;
//Сформировать квадратную матрицу порядка N по правилу:
public class Task7 {
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
        int n = checkIntNum(),sum=0;
        double a;
        double[][] matr = new double[n][n];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                a=Math.sin((Math.pow(i,2)-Math.pow(j,2))/matr.length);
                System.out.print(String.format("%.1f",a )+" ");
                if(a>0) sum++;
            }
            System.out.println();
        }
        System.out.println("The number of positive elements: "+sum);
    }
}
