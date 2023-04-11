package org.programming.with.classes.the.simplest.classes.and.objects.Task7;
//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.
public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(){}
    public Triangle(int a, int b, int c) {
        if(a + b > c || a + c > b || b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else{
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static Triangle createTriangle(int a, int b, int c){

        return new Triangle(a, b, c);
    }

    public int getPerimeter(){
        return (a+b+c);
    }

    public   double getSquare(){ //формула Герона

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) *
                (p - b) * (p - c));
    }

    public String medianPoint(int[] points) {
        int x1 = points[0], x2 = points[2], x3 = points[4];
        int y1 = points[1], y2 = points[3], y3 = points[5];
        if (((x3 - x1) * (y2 - y1) - (x2 - x1) * (y3 - y1)) != 0) {

            int medianX = (x1 + x2 + x3) / 3;
            int medianY = (y1 + y2 + y3) / 3;
            return "(" + medianX + "," + medianY + ")";
        } else {
            return "The points are collinear";
        }
    }

    @Override
    public String toString() {
        return "Triangle: side a=" + a + ", side b=" + b + ", side c=" + c ;
    }
}
