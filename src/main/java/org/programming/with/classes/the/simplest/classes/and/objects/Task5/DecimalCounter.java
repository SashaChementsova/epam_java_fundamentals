package org.programming.with.classes.the.simplest.classes.and.objects.Task5;
//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class DecimalCounter {
    private int counter;
    private int upperBound;
    private int lowerBound;
    private  String error;

    public DecimalCounter() {
        this.counter = 0;
        this.lowerBound = 0;
        this.upperBound = 10;
    }

    public DecimalCounter(int x, int MinValue, int MaxValue) {

        int T = Math.min(MinValue, MaxValue);
        if (T != MinValue) {
            MaxValue = MinValue;
            MinValue = T;
        }
        if (x < MinValue || x > MaxValue) {
            this.counter = MinValue;
        } else {
            this.counter = x;
        }
        this.lowerBound = MinValue;
        this.upperBound = MaxValue;
    }

    public void increaseCounter() {
        if (this.counter+1 > this.upperBound) {
            this.error = "the upper limit of the counter has been reached";
        }
        else this.counter++;

    }

    public void reduceCounter() {
        if (this.counter-1 < this.lowerBound) {
            this.error = "the lower limit of the counter has been reached";
        }
        else this.counter--;

    }

    public int getCounter() {
        return counter;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public String getError() {
        return error;
    }
}
