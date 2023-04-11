package org.programming.with.classes.the.simplest.classes.and.objects.Task6;

public class Main {
    public static void main(String args[]){
        Time t=new Time(34,23,34);
        System.out.println("Time: "+t.toString());
        t.setMinutes(126);
        System.out.println("Minutes = 126. Time: "+t.toString());
        t.editMinutes(126);
        System.out.println("Minutes += 126. Time: "+t.toString());
        t.editSeconds(3726);
        System.out.println("Seconds += 3726. Time: "+t.toString());
    }
}

