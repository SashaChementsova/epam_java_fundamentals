package org.algorithmization.decomposition.using.methods;

import static java.lang.Math.random;

//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        int[][] xy = new int[n][2];
        fillArray(xy);

        System.out.println("The points with coordinates:");
        for (int i=0;i<xy.length;i++) {
            for (int j = 0; j < xy[i].length; j++) {
                System.out.printf(xy[i][j]+" ");
            }
            System.out.println();
        }
        int[] index = distanceMax(xy);
        System.out.println("Points with coordinates between which the maximum distance is:");
        System.out.println(xy[index[0]][0]+" "+xy[index[0]][1]);
        System.out.println(xy[index[1]][0]+" "+xy[index[1]][1]);
    }

    public static void fillArray(int[][] xy) {
        for (int i=0;i<xy.length;i++) {
            for (int j = 0; j < xy[i].length; j++) {
                xy[i][j] = (int) ((random() * ((20 - (-20)) + 1)) + (-20));
            }
        }
    }

    public static int[] distanceMax(int[][] xy) {
        int[] index = new int[2];
        double max = 0;
        for (int i = 0; i < xy.length-1; i++) {
            for (int j = i+1; j < xy.length; j++) {
                double d = distance(xy[i],xy[j]);
                if (max < d) {
                    index[0] = i;
                    index[1] = j;
                    max = d;
                }
            }
        }
        return index;
    }

    public static double distance(int[] xy1,int[] xy2) {
        double d;
        d = Math.sqrt(Math.pow((xy1[0] - xy2[0]), 2) + Math.pow((xy1[1] - xy2[1]), 2));
        return d;
    }
}
