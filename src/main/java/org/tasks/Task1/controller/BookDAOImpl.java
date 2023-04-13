package org.tasks.Task1.controller;

import com.sun.jdi.VMOutOfMemoryException;
import org.programming.with.classes.the.simplest.classes.and.objects.Task8.Customer;
import org.tasks.Task1.controller.DAO.BookDAO;
import org.tasks.Task1.entity.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    CatalogOfBooks catalogOfBooks;
    {catalogOfBooks=new CatalogOfBooks();}
    public List<Book> getListOfBooks(){
        return catalogOfBooks.getBooks();
    }
    public void printBooks(){
        List<Book> books=catalogOfBooks.getBooks();
        for (Book book:books){
            System.out.println(book.toString());
        }
    }
    public void readFileWithBooks(){
        List<Book> books=new ArrayList<>();
        Book book;
        try {
            File file=new File("books.txt");
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] info = line.split(";");
                book=new Book(info[1],info[2],Integer.parseInt(info[3]),info[4], TypeOfBook.valueOf(info[0]));
                books.add(book);
                line = reader.readLine();
            }
        }
        catch (Exception ex){
            System.out.println("Error reading from file");
        }
        catalogOfBooks.setBooks(books);
    }
    public void recordFileWithBooks(){
        List<Book> books=catalogOfBooks.getBooks();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("books.txt"));
            for (Book book : books) {
                writer.write(book.getType() + ";" + book.getName() + ";" + book.getAuthor() + ";" + book.getYear() + ";" + book.getPublisher() + ";\n");
            }
            writer.close();
        }
        catch (Exception ex){
            System.out.println("Error writing to the file");
        }
    }
    public void addNewBook(Book book){
        List<Book> books=catalogOfBooks.getBooks();
        books.add(book);
        catalogOfBooks.setBooks(books);
    }
    public PersonDAOImpl sendEmail(PersonDAOImpl personDAO, Book book){
        People people=personDAO.getPeople();
        List<Person> people1=people.getPeople();
        List<String> messages=new ArrayList<>();
        for(Person person:people1){
            messages=person.getMessages();
            messages.add("We have added a new book:"+book.getName()+", "+book.getAuthor());
            person.setMessages(messages);
        }
        people.setPeople(people1);
        personDAO.setPeople(people);
        return personDAO;
    }
    public void deleteBook(Book book){
        List<Book> books=catalogOfBooks.getBooks();
        books.remove(book);
        catalogOfBooks.setBooks(books);
    }
    public List<Book> findBookByName(String name){
        List<Book> fbooks =new ArrayList<>();
        List<Book> books =catalogOfBooks.getBooks();
        for (Book book:books){
            if(name.equals(book.getName())) fbooks.add(book);
        }
        return fbooks;
    }
}
