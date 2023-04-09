package org.algorithmization.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.random;

//Даны дроби . Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.
public class Task8 {
    public static void main(String[] args) {
        List<Fraction> fractions = new ArrayList<Fraction>();
        int n= (int) ((random() * ((9 - 5) + 1)) + 5);
        for(int i=0;i<n;i++){
            fractions.add(new Fraction((long) ((random() * ((20 - 1) + 1)) + 1), (long) ((random() * ((20 - 1) + 1)) + 1)));
        }

        long lcd = fractions.stream().mapToLong(f -> f.d).reduce(1, (d1, d2) -> d1 * d2 / gcd(d1, d2));
        fractions.stream().map(f -> f.setLCD(lcd)).sorted(Fraction::sort).forEach(System.out::println);

    }

    static long gcd(long a, long b) {  //greatest common divisor
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static class Fraction {
        long n, d;

        public Fraction(long n, long d) {
            this.n = n;
            this.d = d;
        }

        public Fraction setLCD(long lcd) { //least common divisor
            n *= (lcd / d);
            d = lcd;
            return this;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", n, d);
        }

        public static int sort(Fraction f1, Fraction f2) {
            return Long.compare(f1.n, f2.n);
        }
    }
}
