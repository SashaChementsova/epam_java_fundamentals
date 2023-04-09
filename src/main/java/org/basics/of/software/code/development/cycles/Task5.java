package org.basics.of.software.code.development.cycles;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double e, a, sum = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the number series");
        num = sc.nextInt();
        System.out.println("Enter the number e");
        e = sc.nextDouble();
        System.out.println("Numerical series:");
        for (int i = 1; i <= num; i++) {
            a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i)));
            System.out.print(a + " ");
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println("\nThe result: " + sum);
    }
}
