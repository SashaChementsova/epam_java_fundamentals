package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;

import java.util.Objects;
import java.util.Scanner;

//Проверить, является ли заданное слово палиндромом.
public class Task3 {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args){
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        if(Objects.equals(str, reverseString(str))) System.out.println("This is a palindrome");
        else System.out.println("This isn't a palindrome");
    }
}
