package org.basics.of.software.code.development.cycles;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.println("The number " + i + ". Its character representation " + (char) i);
        }
    }
}
