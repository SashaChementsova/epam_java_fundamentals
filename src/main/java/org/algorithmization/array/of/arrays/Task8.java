package org.algorithmization.array.of.arrays;

import java.util.Scanner;
//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
public class Task8 {
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
    public static void printMatrix(int[][]matr){

        for (int[] rows : matr) {
            for (int columns : rows) {
                System.out.print(columns+" ");
            }
            System.out.println();
        }
    }
    public static int checkColumn(int n,int k){ //проверка на существование столбца
        int x;
        while(true){
            x=checkIntNum();
            if(x<=0||x>n||x==k) System.out.println("There is no such column");
            else break;
        }
        return x;
    }
    static public void main(String[] args) {
        System.out.println("Enter the size of the square matrix");
        int n = checkIntNum(),k1=-1,k2=-1,a;
        int[][] matr = new int[n][n]; //заполнение матрицы
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j]=i+j;
            }
        }
        System.out.println("The square matrix:");
        printMatrix(matr);
        System.out.println("Enter the number of the first column.");
        k1=checkColumn(n,k2);
        System.out.println("Enter the number of the second column.");
        k2=checkColumn(n,k1);
        for(int i=0;i<matr.length;i++){  //меняем столбцы местами
            a=matr[i][k1-1];
            matr[i][k1-1]=matr[i][k2-1];
            matr[i][k2-1]=a;
        }
        System.out.println("The new square matrix:");
        printMatrix(matr);
    }
}
