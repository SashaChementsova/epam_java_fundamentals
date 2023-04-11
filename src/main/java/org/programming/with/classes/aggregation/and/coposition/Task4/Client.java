package org.programming.with.classes.aggregation.and.coposition.Task4;

import java.math.BigInteger;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    private int id;
    private String surname;
    private List<BankAccount> accounts;

    public Client() {
        this.id = 484;
        this.surname = "Chementsova";
        this.accounts = new ArrayList<>();
        accounts.add(new BankAccount(23,345,Currency.BYN,new BigInteger("456896589")));
        accounts.add(new BankAccount(259,-4848,Currency.BYN,new BigInteger("456458989")));
        accounts.add(new BankAccount(783,484,Currency.BYN,new BigInteger("456845874")));
    }
    public void getSumOfAccounts(){

        double sum = 0;

        for (BankAccount a : accounts) {

            sum += a.getBalance();

        }
        System.out.println("Sum of bank accounts is " + sum);
    }
    public void getSumOfPositiveAccounts(){

        double sum = 0;

        for (BankAccount a : accounts) {
            if(a.getBalance() > 0) {
                sum += a.getBalance();
            }
        }
        System.out.println("Sum of positive bank accounts is " + sum);
    }
    public void getSumOfNegativeAccounts(){

        double sum = 0;

        for (BankAccount a : accounts) {
            if(a.getBalance() < 0) {
                sum += a.getBalance();
            }
        }
        System.out.println("Sum of negative bank accounts is " + sum);
    }

    public void sortAccounts(){
        Collections.sort(accounts,BankAccount.sortBankAccountant);
        for(BankAccount ba:accounts){
            System.out.println(ba.toString());
        }
    }
    public void searchAccount(int i){

        for (BankAccount a : accounts) {

            if(a.getId()== i){

                System.out.println(a.toString());
            }
        }
    }
}
