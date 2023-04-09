package org.algorithmization.decomposition.using.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class Task15 {
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
    public static int checkNum(){ //проверка на число больше 0
        int x=-1;
        while(!(x>0)){
            x=checkIntNum();
            if(!(x>0)) System.out.println("Error. Try again.");
        }
        return x;
    }
    public static int[] convertIntegers(List<Integer> integers) //преобразование в массив int из списка
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    public static boolean checkAscending(int num){ //сумма цифр числа
        int numBefore=num%10;
        num/=10;
        while(num!=0) {
            if(numBefore<num%10){
                return false;
            }
            numBefore=num%10;
            num/=10;
        }
        return true;
    }


    public static int[] createArray(int n){
        int end= (int) Math.pow(10,n),begin=end/10;
        List<Integer> mass = new ArrayList<Integer>();
        for(int i=begin;i<end;i++){
            if(checkAscending(i)) mass.add(i);
        }
        return convertIntegers(mass);
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the numbers:");
        int n = checkNum();
        System.out.println("The result: "+ Arrays.toString(createArray(n)));

    }
}
