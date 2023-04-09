package org.algorithmization.one.dimensional.array;
//Даны действительные числа a1,a2,...,an. Найти max( a1 + a2n, a2 + a2n−1,...,an + an+1)

import java.util.Arrays;
import java.util.Scanner;

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
    public static double checkDoubleNum(){ //проверка вещественного числа
        Scanner sc=new Scanner(System.in);
        double x;
        do{
            while (!sc.hasNextDouble()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextDouble();
        }while(x<=0);
        return x;
    }

    public static double[] getProgression(double h,int n, double a1){ //алгебраическая прогрессия
        double[] mass=new double[n];
        mass[0]=a1;
        for(int i=1;i<mass.length;i++){
            mass[i]=mass[i-1]+h;
        }
        System.out.println("The algebraic progression:");
        for (double v : mass) {
            System.out.print(v + " ");
        }
        return mass;
    }
    public static double getElement(double a1,int n,double h){ //получения элемента под определенным носером
        return a1+(n-1)*h;
    }
    public static double[] getNewProgression(double[] mass){ //получение новой прогрессии по условию
        double a1=mass[0];
        double h=mass[1]-mass[0];
        for(int i=0;i<mass.length;i++){
            mass[i]=mass[i]+getElement(a1,2*mass.length-i,h);
        }
        System.out.println("\nThe new algebraic progression:");
        for (double v : mass) {
            System.out.print(v + " ");
        }
        return mass;
    }

    public static double completeTask(double[] newmass){ //выполнение задания
        return  Arrays.stream(newmass).max().getAsDouble();
    }

    public static void main(String[] args){
        double a1;
        int n;
        System.out.println("Enter the step of the algebraic progression:");
        double h = checkDoubleNum();
        System.out.println("Enter the number of elements of the algebraic progression:");
        n=checkIntNum();
        System.out.println("Enter the first element of the algebraic progression:");
        a1=checkDoubleNum();
        double[] mass=getProgression(h,n,a1);
        double[] newmass=getNewProgression(mass);
        System.out.println("\nThe result: "+completeTask(newmass));
    }
}
