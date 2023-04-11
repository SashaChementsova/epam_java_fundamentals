package org.programming.with.classes.the.simplest.classes.and.objects.Task6;
//Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if(hours>=0&&hours<=23){
            this.hours = hours;
        }
        else this.hours=0;
        if(minutes>=0&&minutes<=59){
            this.minutes=minutes;
        }
        else this.minutes=0;
        if(seconds>=0&&seconds<=59){
            this.seconds=seconds;
        }
        else this.seconds=0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours>=0&&hours<=23){
            this.hours = hours;
        }
        else this.hours=0;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes>=0&&minutes<=59){
            this.minutes=minutes;
        }
        else this.minutes=0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds>=0&&seconds<=59){
            this.seconds=seconds;
        }
        else this.seconds=0;
    }

    @Override
    public String toString() {
        String h="",m="",s="";
        if(hours<10) h="0";
        if(minutes<10) m="0";
        if(seconds<10) s="0";
        return  h+hours + ":" + m+minutes + ":" + s+seconds;
    }

    public void editHours(int hours){
        this.hours+=hours;
        while(this.hours>23) this.hours=this.hours-24;
    }
    public void editMinutes(int minutes){
        this.minutes+=minutes;
        while(this.minutes>59) {
            this.hours++;
            this.minutes-=60;
        }
    }
    public void editSeconds(int seconds){
        this.seconds+=seconds;
        while(this.seconds>59) {
            this.minutes++;
            this.seconds-=60;
        }
        while(this.minutes>59) {
            this.hours++;
            this.minutes-=60;
        }
    }
}
