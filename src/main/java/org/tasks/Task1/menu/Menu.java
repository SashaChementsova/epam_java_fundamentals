package org.tasks.Task1.menu;


import org.tasks.Task1.controller.AuthorizationImpl;
import org.tasks.Task1.controller.BookDAOImpl;
import org.tasks.Task1.controller.PersonDAOImpl;
import org.tasks.Task1.entity.*;

import java.math.BigInteger;
import java.util.Collections;
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
        int choice,num;String info;Scanner sc=new Scanner(System.in);
        BookDAOImpl bookDAO = new BookDAOImpl();
        PersonDAOImpl personDAO = new PersonDAOImpl();
        bookDAO.readFileWithBooks();
        personDAO.readFileWithPeople();
        Person person = logInToAccount(personDAO.getPeople());
        if (person==null) {
            System.out.println("There is no such user.");
        } else {
            if (person.getRole().equals(TypeOfRole.user)) {
                while (true) {
                    choice = 10;
                    System.out.println("Select a user menu item:\n 1)Get catalog of books;\n 2)Find books by name;\n 3)Get messages;\n 4)Send a message to the admin;\n 5)Exit.");
                    while (choice > 5) {
                        choice = checkNum();
                        if (choice > 5) System.out.println("Error.Try again.");
                    }
                    switch (choice) {
                        case 1:
                            bookDAO.printBooks();
                            break;
                        case 2:
                            System.out.println("Enter the name of book:");
                            info=sc.nextLine();
                            List<Book> books=bookDAO.findBookByName(info);
                            System.out.println("The result:");
                            for(Book book:books){
                                book.toString();
                            }
                            break;
                        case 3:
                            List<String> messages=person.getMessages();
                            if(messages.get(0).equals("")) System.out.println("There are no messages");
                            else{
                                System.out.println("Your messages:");
                                for(String str:messages){
                                System.out.println(str);
                                }
                            }
                            break;
                        case 4:
                            Book book=new Book();
                            System.out.print("Enter the info about book that you want to recommend to add.\n The name:");
                            info=sc.nextLine();
                            book.setName(info);
                            System.out.print("The author:");
                            info=sc.nextLine();
                            book.setAuthor(info);
                            System.out.print("The year:");
                            num=checkNum();
                            book.setYear(num);
                            System.out.print("The publisher:");
                            info=sc.nextLine();
                            book.setPublisher(info);
                            System.out.print("The type of book:");
                            info=sc.nextLine();
                            book.setType(TypeOfBook.valueOf(info));
                            personDAO.sendEmail(book.toString());
                            break;
                        case 5:
                            personDAO.recordFileWithPeople();
                            bookDAO.recordFileWithBooks();
                            return;
                    }
                }
            }
            else {
                while (true) {
                    choice = 10;
                    System.out.println("Select a admin menu item:\n 1)Get list of user;\n 2)Add user;\n 3)Get messages;\n 4)Add book;\n 5)Exit.");
                    while (choice > 5) {
                        choice = checkNum();
                        if (choice > 5) System.out.println("Error.Try again.");
                    }
                    switch (choice) {
                        case 1:
                            personDAO.printPeople();
                            break;
                        case 2:
                            Person person1=new Person();
                            person1.setRole(TypeOfRole.user);
                            System.out.print("Enter the info about user that you want to add.\n The email:");
                            info=sc.nextLine();
                            person1.setEmail(info);
                            System.out.print("The password:");
                            info=sc.nextLine();
                            person1.setPassword(info);
                            personDAO.addNewPerson(person);
                            break;
                        case 3:
                            List<String> messages=person.getMessages();
                            if(messages.get(0).equals("")) System.out.println("There are no messages");
                            else{
                                System.out.println("Your messages:");
                                for(String str:messages){
                                    System.out.println(str);
                                }
                            }
                            break;
                        case 4:
                            Book book=new Book();
                            System.out.print("Enter the info about book that you want to add.\n The name:");
                            info=sc.nextLine();
                            book.setName(info);
                            System.out.print("The author:");
                            info=sc.nextLine();
                            book.setAuthor(info);
                            System.out.print("The year:");
                            num=checkNum();
                            book.setYear(num);
                            System.out.print("The publisher:");
                            info=sc.nextLine();
                            book.setPublisher(info);
                            System.out.print("The type of book:");
                            info=sc.nextLine();
                            book.setType(TypeOfBook.valueOf(info));
                            bookDAO.addNewBook(book);
                            bookDAO.sendEmail(personDAO,book);
                            break;
                        case 5:
                            personDAO.recordFileWithPeople();
                            bookDAO.recordFileWithBooks();
                            return;
                    }
                }
            }


        }
    }

    Person logInToAccount(People people){
        AuthorizationImpl authorization=new AuthorizationImpl();
        String password,email;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your email:");
        email=sc.next();
        System.out.println("Enter your password:");
        password=sc.next();
        Person person=authorization.logIn(people,email,password);
        return person;
    }
}
