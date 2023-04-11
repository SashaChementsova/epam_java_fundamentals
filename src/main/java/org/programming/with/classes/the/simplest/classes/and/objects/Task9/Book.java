package org.programming.with.classes.the.simplest.classes.and.objects.Task9;
//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.
public class Book {
    private int id;
    private String name;
    private String authors;
    private String publisher;
    private int year;
    private int numOfPages;
    private double price;
    private String typeOfBinding;

    public Book(int id, String name, String authors, String publisher, int year, int numOfPages, double price, String typeOfBinding) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.numOfPages = numOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book: " + "id=" + id + ", name=" + name + ", authors=" + authors + ", publisher=" + publisher + ", year=" + year +
                ", numOfPages=" + numOfPages +
                ", price=" + price +
                ", typeOfBinding=" + typeOfBinding ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }
}
