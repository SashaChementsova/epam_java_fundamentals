package org.basics.of.software.code.development.cycles;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//        m и n вводятся с клавиатуры.
public class Task7 {
    public static int checkNum(){
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("Enter a natural integer:");
            while (!sc.hasNextInt()){
                System.out.println("Enter a natural integer:");
                sc.next();
            }
            x = sc.nextInt();
        }while (x  <= 0);
        return x;
    }

    public static void main(String[] args){
        int m,n,flag;
        do{
            System.out.println("Enter the beginning of the segment.");
            m=checkNum();
            System.out.println("Enter the ending of the segment.");
            n=checkNum();
        }while(m>=n);
        for(int i=m;i<n;i++){
            System.out.print("\nThe number: "+i+"\n The divisors:");
            flag=0;
            for(int j = 2; j<i; j++) {
                if (i % j == 0) {
                    System.out.print(" "+j+" ");
                    flag=1;
                }
            }
            if(flag==0){
                System.out.print(" They are not. ");
            }
        }
    }
}
