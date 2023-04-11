package org.programming.with.classes.the.simplest.classes.and.objects.Task7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] points=new int[]{3,4,2,3,4,3};
        System.out.println("Points of triangle:"+ Arrays.toString(points)+". The point of its median: "+ new Triangle().medianPoint(points));
        Triangle t1=new Triangle(4,3,5);
        Triangle t2=new Triangle(6,6,5);
        System.out.println(t1.toString()+". Perimeter: "+t1.getPerimeter());
        System.out.println(t2.toString()+". Square: "+t2.getSquare());
    }
}
