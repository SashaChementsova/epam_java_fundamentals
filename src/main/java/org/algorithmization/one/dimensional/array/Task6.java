package org.algorithmization.one.dimensional.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
public class Task6 {

    public static boolean isSimple(int num){
        if(num==1){
            return false;
        }
        int temp;
        boolean flag=true;
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int checkNum(){ //проверка целого числа
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            System.out.println("Enter the size of sequence");
            while (!sc.hasNextInt()){
                System.out.println("Enter the size of sequence");
                sc.next();
            }
            x = sc.nextInt();
        }while(x<=0);
        return x;
    }
    public static void main(String[] args) {
        double[] mass = new double[checkNum()];
        double sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        Arrays.setAll(mass, i -> sc.nextDouble());
        for(int i=0;i<mass.length;i++){
            System.out.println((i+1)+" "+mass[i]);
        }
        for(int i=0;i<mass.length;i++){
            if(isSimple(i+1)){
                sum+=mass[i];
            }
        }
        System.out.print("The result: "+sum);
    }
}
