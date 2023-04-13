package org.tasks.Task1.entity;

import java.util.ArrayList;
import java.util.List;

public class CatalogOfBooks {
    List<Book> books;
    {
        books=new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
