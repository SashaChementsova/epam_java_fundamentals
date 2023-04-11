package org.programming.with.classes.the.simplest.classes.and.objects.Task2;

public class Main {
    public static void main(String[] args){
        Test2 t1=new Test2();
        Test2 t2=new Test2(4,6);
        System.out.println("The first object: a="+t1.getA()+" b="+t1.getB());
        System.out.println("The second object: a="+t2.getA()+" b="+t2.getB());
        t2.setA(5);
        t2.setB(10);
        System.out.println("The edit second object: a="+t2.getA()+" b="+t2.getB());

    }
}
