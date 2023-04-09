package org.basics.of.software.code.development.branching;

import java.awt.*;

public class Task3 {
    public static String checkLine(Point p1,Point p2,Point p3){
        if(((p3.getX() - p1.getX()) *(p2.getY() - p1.getY())- (p2.getX() - p1.getX())*(p3.getY() - p1.getY()) )==0){
            //(x3-x1)*(y2-y1)-(x2-x1)*(y3-y1)/==0
            return "They are on the same line";
        }
        else return "They are not on the same line";

    }
    public static void main(String[] args){
        Point p1=new Point(2,4);
        Point p2=new Point(3,5);
        Point p3=new Point(8,4);
        System.out.println("Result of checking: "+checkLine(p1,p2,p3));
    }
}
