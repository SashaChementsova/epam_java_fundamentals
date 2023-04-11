package org.programming.with.classes.the.simplest.classes.and.objects.Task5;

public class Main {
    public static void main(String[] args)
    {
        DecimalCounter dc=new DecimalCounter();
        System.out.println("The initial value of the counter: "+dc.getCounter());
        while (dc.getError() == null)
        {
            dc.increaseCounter();
            if(dc.getError()!=null) break;
            System.out.println("Increasing the counter by one: "+dc.getCounter());
        }
        System.out.println("The final value of the counter: "+dc.getCounter()+" because "+dc.getError());
    }
}
