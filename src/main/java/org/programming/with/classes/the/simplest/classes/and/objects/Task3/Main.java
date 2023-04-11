package org.programming.with.classes.the.simplest.classes.and.objects.Task3;

import java.util.Scanner;

public class Main {
    public static int checkIntNum(){ //проверка целого числа
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            while (!sc.hasNextInt()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextInt();
        }while(x<=0);
        return x;
    }
    public static int checkGroup(){
        int x=1;
        do{
            if(x<=0) System.out.println("Error. Try again. ");
            x=checkIntNum();
        }while(x<=0);
        return x;
    }

    public static void main(String[] args){
        Student[] students=new Student[10];
        String surname, initials;
        int group;
        String str="";
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<students.length;i++){
            System.out.println("Enter surname of student number "+(i+1));
            surname=sc.next();
            System.out.println("Enter initials of the student");
            initials=sc.next();
            System.out.println("Enter the student's group ");
            group=checkGroup();
            students[i]=new Student(surname,initials,group);
        }
        System.out.println("All students:");
        for (Student student:students){
            System.out.println(student.toString());
        }
        System.out.println("Students with grades 9 and 10:");
        int flag=0;
        for (Student student:students){
            if(student.haveNineAndTen()) {System.out.println(student.getSurnameAndGroup()); flag=1;}
        }
        if(flag!=1) System.out.println("There are no such students");

    }
}
