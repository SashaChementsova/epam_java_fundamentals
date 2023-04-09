package org.basics.of.software.code.development.cycles;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        int res=1;
        for(int i=1;i<=200;i++){
            res*=Math.pow(i,2);
        }
        System.out.println("Result: "+res);
    }
}
