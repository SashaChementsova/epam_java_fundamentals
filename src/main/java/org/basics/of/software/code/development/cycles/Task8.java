package org.basics.of.software.code.development.cycles;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task8 {
    public static String checkNumbers(double a,double b){ //поиск одинаковых цифр
        String a1=Double.toString(a), b1=Double.toString(b);
        String nums="";
        System.out.println(a1+" "+b1);
        for(int i=0;i<a1.length();i++){
            for(int j=0;j<b1.length();j++){
                if(a1.charAt(i)==b1.charAt(j)&&a1.charAt(i)!='.'&&checkRepeat(nums,a1.charAt(i))){
                    nums+=a1.charAt(i);
                }
            }
        }
        return nums.replace("", " ").trim();
    }

    public static boolean checkRepeat(String nums,char num){ //проверка на повторение цифр в числе
        for(int i=0;i<nums.length();i++){
            if(nums.charAt(i)==num) return false;
        }
        return true;
    }
    public static void main(String[] args){
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a");
        a=sc.nextDouble();
        System.out.println("Enter the number b");
        b=sc.nextDouble();
        System.out.println("Identical numbers: "+checkNumbers(a,b));
    }
}
