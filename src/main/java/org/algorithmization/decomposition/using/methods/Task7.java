package org.algorithmization.decomposition.using.methods;
// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Task7 {
    public static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int getSum(){
        int sum=0;
        for(int num=1;num<=9;num++){
            if(num%2!=0){
                sum+=calculateFactorial(num);
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("The result: "+getSum());
    }
}
