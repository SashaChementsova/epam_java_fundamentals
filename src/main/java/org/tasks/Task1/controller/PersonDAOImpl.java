package org.tasks.Task1.controller;

import org.tasks.Task1.controller.DAO.PersonDAO;
import org.tasks.Task1.entity.People;
import org.tasks.Task1.entity.Person;
import org.tasks.Task1.entity.TypeOfRole;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {
    People people;
    {people=new People();}
    public void addNewPerson(Person person){
        List<Person> people1=people.getPeople();
        people1.add(person);
        people.setPeople(people1);
    }
    public void sendEmail(String mess){
        List<Person> people1=people.getPeople();
        List<String> messages=people1.get(0).getMessages();
        messages.add(mess);
        people1.get(0).setMessages(messages);
        people.setPeople(people1);
    }
    public void readFileWithPeople(){
        List<Person> people1=new ArrayList<>();
        Person person;
        try {
            File file=new File("accounts.txt");
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] info = line.split(";");
                List<String> mess=new ArrayList<>();
                for(int i=3;i<info.length;i++){
                    mess.add(info[i]);
                }
                person=new Person(info[1], TypeOfRole.valueOf(info[0]),info[2],mess);
                people1.add(person);
                line = reader.readLine();
            }
        }
        catch (Exception ex){
            System.out.println("Error reading from file");
        }
        people.setPeople(people1);
    }
    public void recordFileWithPeople(){
        List<Person> people1=people.getPeople();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.txt"));
            for (Person person : people1) {
                writer.write(person.getRole() + ";" + person.getEmail() + ";" + person.getPassword() + ";");
                for(String str:person.getMessages()){
                    writer.write(person.getMessages() + ";");
                }
                writer.write("\n");
            }
            writer.close();
        }
        catch (Exception ex){
            System.out.println("Error writing to the file");
        }
    }
    public void deletePerson(Person person){
        List<Person> people1=people.getPeople();
        people1.remove(person);
        people.setPeople(people1);
    }
    public void printPeople(){
        List<Person> people1=people.getPeople();
        for(Person person:people1){
            System.out.println(person.toString());
        }
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
