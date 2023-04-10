package org.programming.with.classes.the.simplest.classes.and.objects.Task1;
//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class Test1 {
    private int a,b;
    Test1(){}

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int calculateSum(){
        return a+b;
    }
    public int getTheLargest(){
        return Math.max(a, b);
    }

    @Override
    public String toString() {
        return "a=" + a +
                ", b=" + b;
    }

    public void printNums(){
        System.out.println(toString());
    }
}
