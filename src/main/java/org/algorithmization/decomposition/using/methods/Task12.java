package org.algorithmization.decomposition.using.methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.
public class Task12 {
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
    public static int checkNum(){ //проверка на отриц. числа и 0
        int x=-1;
        while(x<=0){
            x=checkIntNum();
            if(x<=0) System.out.println("Error. Try again.");
        }
        return x;
    }
    public static void main(String[] args){
        System.out.println("Enter the first number");
        int num1=checkNum();
        System.out.println("Enter the second number");
        int num2=checkNum();
        int[] mass = newArray(num1, num2);
        System.out.println("The result: "+ Arrays.toString(mass));
    }

    //создаем массив из числа
    public static int[] arrayOfNumbers(int num) {
        char[] charArr = Integer.toString(num).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }

    //находим сумму цифр числа
    public static int sumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //определяем длину массива, в который будем записывать числа, удовлетворяющие условию задачи
    public static int lengthArray(int numN, int numK) {
        int length = 0;
        for (int i = 0; i <= numN; i++) {
            if (sumOfOddNumbers(arrayOfNumbers(i)) == numK) {
                length++;
            }
        }
        return length;
    }

    //создаем массив чисел согласно условию задачи
    public static int[] newArray(int numN, int numK) {
        int[] array = new int[lengthArray(numN, numK)];
        int j = 0;
        for (int i = 0; i <= numN; i++) {
            if (sumOfOddNumbers(arrayOfNumbers(i)) == numK) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }
}
