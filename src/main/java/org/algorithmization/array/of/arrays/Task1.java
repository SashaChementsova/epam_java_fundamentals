package org.algorithmization.array.of.arrays;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task1 {

    public static void main(String[] args){
        int[][] matr={{2,4,8,5,4,2,7,9,3},
                      {8,2,3,4,2,7,5,6,7},
                      {5,4,5,5,2,6,4,8,0},
                      {4,6,5,3,5,3,2,4,5}};
        for (int i = 0; i < matr.length; i ++) {
            for (int j = 0; j < matr[i].length; j += 2) {
                if (matr[0][j] > matr[matr.length - 1][j]) {
                    System.out.print(matr[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
