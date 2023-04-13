package org.tasks.Task1.entity;

import java.util.Objects;

public class Book {
    TypeOfBook type;
    private String name;
    private String author;
    private int year;
    private String publisher;
    public Book(){}
    public Book(String name, String author, int year, String publisher,TypeOfBook type) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.type=type;
    }

    @Override
    public String toString() {
        return "Book: type of book=" + type +
                ", name=" + name +
                ", author=" + author +
                ", year=" + year +
                ", publisher=" + publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && type == book.type && Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, author, year, publisher);
    }

    public TypeOfBook getType() {
        return type;
    }

    public void setType(TypeOfBook type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
