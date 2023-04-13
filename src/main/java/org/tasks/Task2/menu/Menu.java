package org.tasks.Task2.menu;


import org.tasks.Task2.controller.Notepad;
import org.tasks.Task2.entity.Note;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private int checkNum(){ //проверка целого числа
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            while (!sc.hasNextInt()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextInt();
            if(x<=0) System.out.println("Error. Try again.");
        }while(x<=0);
        return x;
    }

    public void getMenu() {
        int choice;String info="";Scanner sc=new Scanner(System.in);
        List<Note> notes;
        Notepad notepad=new Notepad();
        notepad.readFileWithNotes();
        while (true) {
            choice = 10;
            System.out.println("Select a menu item:\n 1)Add a new note;\n 2)Find note by heading;\n 3)Find note by date;\n 4)Find note by email;\n 5)Find note by message;\n 6)Sort notes by headings;\n 7)Sort notes by dates;\n 8)Exit.");
            while (choice > 8) {
                choice = checkNum();
                if (choice > 8) System.out.println("Error.Try again.");
            }
            switch (choice) {
                case 1:
                    info="";
                    Note note = new Note();
                    System.out.print("Enter the info about note that you want to add.\n The heading:");
                    info=sc.nextLine();
                    note.setHeading(info);
                    System.out.print("The date:");
                    while(!notepad.validateDate(info)){
                        info=sc.nextLine();
                        if(!notepad.validateDate(info)) System.out.println("Error. Try again. Example: 12.12.2012");
                    }
                    note.setDate(info);
                    System.out.print("The email:");
                    while(!notepad.validateEmail(info)){
                        info=sc.nextLine();
                        if(!notepad.validateEmail(info)) System.out.println("Error. Try again. Example: chementsova2102@gmail.com");
                    }
                    note.setEmail(info);
                    System.out.print("The message:");
                    info=sc.nextLine();
                    note.setMessage(info);
                    notepad.addNewNote(note);
                    break;
                case 2:
                    info="";
                    System.out.print("Enter the heading or part of the heading:");
                    info=sc.nextLine();
                    notes=notepad.findByHeading(info);
                    if(notes.size()==0) {System.out.println("There are no such notes"); break;}
                    for(Note n:notes){
                        System.out.println(n.toString());
                    }
                    break;
                case 3:
                    info="";
                    System.out.print("Enter the date:");
                    while(!notepad.validateDate(info)){
                        info=sc.nextLine();
                        if(!notepad.validateDate(info)) System.out.println("Error. Try again. Example: 12.12.2012");
                    }
                    notes=notepad.findByDate(info);
                    if(notes.size()==0) {System.out.println("There are no such notes"); break;}
                    for(Note n:notes){
                        System.out.println(n.toString());
                    }
                    break;
                case 4:
                    info="";
                    System.out.print("Enter the email:");
                    while(!notepad.validateEmail(info)){
                        info=sc.nextLine();
                        if(!notepad.validateEmail(info)) System.out.println("Error. Try again. Example: chementsova2102@gmail.com");
                    }
                    notes=notepad.findByEmail(info);
                    if(notes.size()==0) {System.out.println("There are no such notes"); break;}
                    for(Note n:notes){
                        System.out.println(n.toString());
                    }
                    break;
                case 5:
                    info="";
                    System.out.print("Enter the message or part of the message:");
                    info=sc.nextLine();
                    notes=notepad.findByMessage(info);
                    if(notes.size()==0) {System.out.println("There are no such notes"); break;}
                    for(Note n:notes){
                        System.out.println(n.toString());
                    }
                    break;
                case 6:
                    System.out.println("The sorted notes by headings:");
                    notes=notepad.sortByHeading();
                    for(Note n:notes){
                        System.out.println(n.toString());
                    }
                    break;
                case 7:
                    System.out.println("The sorted notes by dates:");
                    notes=notepad.sortByDate();
                    for(Note n:notes){
                        System.out.println(n.toString());
                    }
                    break;
                case 8:
                    notepad.recordFileWithNotes();
                    return;
            }
        }

    }
}
