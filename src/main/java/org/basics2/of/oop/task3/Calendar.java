package org.basics2.of.oop.task3;

import java.util.ArrayList;
import java.util.List;

//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.
public class Calendar {
    public Calendar(){}
    public static class Holiday{
        private String nameOfHoliday;
        private String date;
        private boolean isDayOff;

        public Holiday(String nameOfHoliday, String date,boolean isDayOff) {
            this.nameOfHoliday = nameOfHoliday;
            this.date = date;
            this.isDayOff=isDayOff;
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        public void setNameOfHoliday(String nameOfHoliday) {
            this.nameOfHoliday = nameOfHoliday;
        }
        public boolean isDayOff() {
            return isDayOff;
        }

        public void setDayOff(boolean dayOff) {
            isDayOff = dayOff;
        }
        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Holiday: name of holiday=" + nameOfHoliday +
                    ", date=" + date+", day off="+isDayOff;
        }
    }
    public List<Holiday> holidays;
    {
        holidays=new ArrayList<>();
    }

    public void addHoliday(Holiday holiday){
        holidays.add(holiday);
    }
    public void removeHoliday(Holiday holiday){
        holidays.remove(holiday);
    }

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }
}
