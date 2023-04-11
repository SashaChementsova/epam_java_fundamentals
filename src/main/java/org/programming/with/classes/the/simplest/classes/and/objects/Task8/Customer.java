package org.programming.with.classes.the.simplest.classes.and.objects.Task8;

import org.programming.with.classes.the.simplest.classes.and.objects.Task4.Train;

import java.util.Comparator;

//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String card;
    private String bankAccount;
    public Customer(){}
    public Customer(int id, String surname, String name, String patronymic, String address, String card, String bankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.card = card;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer: id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic +
                ", address=" + address +", credit card=" + card +", bank account=" + bankAccount ;
    }

    public String getSNP(){
        return surname+" "+name+" "+patronymic;
    }

    public static Comparator<Customer> sortSNP = new Comparator<Customer>() {

        public int compare(Customer c1, Customer c2) {
            String snp1=c1.getSNP().toUpperCase();
            String snp2=c2.getSNP().toUpperCase();
            return snp1.compareTo(
                    snp2);
        }
    };
}
