package org.algorithmization.decomposition.using.methods;

import java.util.Scanner;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
public class Task6 {
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
    public static boolean checkMutuallySimple(int a, int b,int c) {
        boolean isSimple = true;

        if (evqlide(a, b) != 1 || evqlide(b, c) != 1
                || evqlide(a, c) != 1) {
            isSimple = false;
        }
        return isSimple;
    }

    private static int evqlide(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String args[]){
        System.out.println("Enter the first number");
        int a=checkIntNum();
        System.out.println("Enter the second number");
        int b=checkIntNum();
        System.out.println("Enter the third number");
        int c=checkIntNum();
        System.out.println("Th numbers are mutually simple: "+checkMutuallySimple(a,b,c));
    }
}
