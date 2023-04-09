package org.algorithmization.decomposition.using.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.
public class Task13 {
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
    public static int checkNum(){ //проверка на число больше 2
        int x=-1;
        while(!(x>2)){
            x=checkIntNum();
            if(!(x>2)) System.out.println("Error. Try again.");
        }
        return x;
    }
    public static int[] convertIntegers(List<Integer> integers) //преобразование в массив int из списка
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    public static boolean isSimple(int num){
        if(num==1){
            return false;
        }
        int temp;
        boolean flag=true;
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static int[] createArray(int n){
        List<Integer> mass = new ArrayList<Integer>();
        for(int i=n;i<=2*n;i++){
            if(isSimple(i)&&isSimple(i+2)){
                mass.add(i);
                mass.add(i+2);
            }
        }
        return convertIntegers(mass);
    }
    public static void printArray(int[] mass) {
        for(int i=0;i<mass.length;i++){
            System.out.print(mass[i]+" ");
            if(i%2==1) System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the beginning of the range:");
        int n = checkNum();
        System.out.println("The result:");
        printArray(createArray(n));
    }
}
