package org.algorithmization.one.dimensional.array;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void main(String[] args){
        int[] mass=new int[]{2,1,0,3,65,2};
        System.out.print("The result: ");
        for(int i=0;i<mass.length;i++){
            if(mass[i]>i){
                System.out.print(mass[i]+" ");
            }
        }
    }
}
