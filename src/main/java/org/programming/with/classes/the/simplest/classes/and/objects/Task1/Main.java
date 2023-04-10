package org.programming.with.classes.the.simplest.classes.and.objects.Task1;

public class Main {
    public static void main(String[] args){
        Test1 t1=new Test1();
        Test1 t2=new Test1(2,4);
        t1.setA(4);t1.setB(5);
        t1.printNums();
        System.out.println("The sum: "+t1.calculateSum()+"  The largest num: "+t1.getTheLargest());
        t2.printNums();
        System.out.println("The sum: "+t2.calculateSum()+"  The largest num: "+t2.getTheLargest());
    }
}
