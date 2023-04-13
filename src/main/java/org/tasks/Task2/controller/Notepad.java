package org.tasks.Task2.controller;

import org.tasks.Task2.entity.Note;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notepad {
    List<Note> notes;
    {
        notes=new ArrayList<>();
    }
    public Notepad(){}

    public Notepad(List<Note> notes) {
        this.notes = notes;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
    public void readFileWithNotes(){
        Note note;
        try {
            File file=new File("notepad.txt");
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] info = line.split(";");
                note=new Note(info[0],info[1],info[2],info[3]);
                notes.add(note);
                line = reader.readLine();
            }
        }
        catch (Exception ex){
            System.out.println("Error reading from file");
        }
    }
    public void recordFileWithNotes(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("notepad.txt"));
            for (Note note:notes) {
                writer.write(note.getHeading()+";"+note.getDate()+";"+note.getEmail()+";"+note.getMessage() + ";\n");
            }
            writer.close();
        }
        catch (Exception ex){
            System.out.println("Error writing to the file");
        }
    }
    public List<Note> findByDate(String date){
        List<Note> n=new ArrayList<>();
        for(Note note:notes){
            if(note.getDate().equals(date)||note.getDate().contains(date)) n.add(note);
        }
        return n;
    }
    public List<Note> findByMessage(String message){
        List<Note> n=new ArrayList<>();
        for(Note note:notes){
            if(note.getMessage().equals(message)||note.getMessage().contains(message)) n.add(note);
        }
        return n;
    }
    public List<Note> findByHeading(String heading){
        List<Note> n=new ArrayList<>();
        for(Note note:notes){
            if(note.getHeading().equals(heading)||note.getHeading().contains(heading)) n.add(note);
        }
        return n;
    }

    public List<Note> findByEmail(String email){
        List<Note> n=new ArrayList<>();
        for(Note note:notes){
            if(note.getEmail().equals(email)||note.getEmail().contains(email)) n.add(note);
        }
        return n;
    }
    public List<Note> sortByDate(){
        Collections.sort(notes,Note.sortNotesByDate);
        return notes;
    }
    public List<Note> sortByHeading(){
        Collections.sort(notes,Note.sortNotesByHeading);
        return notes;
    }
    public void addNewNote(Note note){
        notes.add(note);
    }
    public boolean validateEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validateDate(String date){
        String regex = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(date);
        return matcher.matches();
    }
}
