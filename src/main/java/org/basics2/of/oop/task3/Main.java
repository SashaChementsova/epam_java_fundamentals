package org.basics2.of.oop.task3;

public class Main {
    public static void main(String[] args){
        Calendar calendar=new Calendar();
        calendar.addHoliday(new Calendar.Holiday("Easter","16.04.2023",true));
        calendar.addHoliday(new Calendar.Holiday("Victory Day","09.05.2023",true));
        calendar.addHoliday(new Calendar.Holiday("Youth Day","25.06.2023",false));
        calendar.addHoliday(new Calendar.Holiday("International Worker's Day","01.05.2023",true));
        System.out.println("All holidays:");
        for(Calendar.Holiday holiday:calendar.getHolidays()){
            System.out.println(holiday.toString());
        }
    }
}
