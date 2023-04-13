package org.tasks.Task1.controller.DAO;

import org.programming.with.classes.the.simplest.classes.and.objects.Task8.Customer;
import org.tasks.Task1.controller.PersonDAOImpl;
import org.tasks.Task1.entity.Book;

import java.util.List;

public interface BookDAO {
    List<Book> getListOfBooks();
    void readFileWithBooks();
    void recordFileWithBooks();
    void addNewBook(Book book);
    PersonDAOImpl sendEmail(PersonDAOImpl personDAO, Book book);
    void deleteBook(Book book);
    List<Book> findBookByName(String name);
}
