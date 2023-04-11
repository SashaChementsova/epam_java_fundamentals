package org.programming.with.classes.the.simplest.classes.and.objects.Task3;

import java.util.Arrays;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Student {
    private String surname;
    private String initials;
    private int group;
    private int[] grade;


    public Student(){
        surname="Chementsova";
        initials="A.V.";
        group=072303;
        grade=new int[]{9,9,9,9,9};
    }

    public Student(String surname, String initials, int group) {
        this.surname = surname;
        this.initials = initials;
        this.group = group;
        this.grade = new int[] {(int) ((Math.random() * ((10 - 1) + 1)) + 1), (int) ((Math.random() * ((10 - 1) + 1)) + 1), (int) ((Math.random() * ((10 - 1) + 1)) + 1), (int) ((Math.random() * ((10 - 1) + 1)) + 1), (int) ((Math.random() * ((10 - 1) + 1)) + 1)};

    }

    @Override
    public String toString() {
        return "Student: " + surname +" "+ initials + ", group=" + group + ", grade=" + Arrays.toString(grade);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public String getSurname() {
        return surname;
    }

    public String getInitials() {
        return initials;
    }

    public int getGroup() {
        return group;
    }

    public int[] getGrade() {
        return grade;
    }

    public boolean haveNineAndTen(){
        for (int g : grade) {
            if (g < 9) {
                return false;
            }
        }
        return true;
    }

    public String getSurnameAndGroup() {
        return "Student: " + surname +", group=" + group;
    }

}
