package org.programming.with.classes.aggregation.and.coposition.Task4;


import java.math.BigInteger;
import java.util.Comparator;

public class BankAccount {
    private int id;
    private boolean isBlock;
    private double balance;
    private Currency currency;
    private BigInteger numOfAccount;

    public BankAccount(int id,double balance, Currency currency, BigInteger numOfAccount) {
        this.id=id;
        if(balance < 0) {
            isBlock = true;
        }
        this.balance = balance;
        this.currency = currency;
        this.numOfAccount = numOfAccount;
    }

    public int getId() {
        return id;
    }

    public BigInteger getNumOfAccount() {
        return numOfAccount;
    }


    public boolean getIsBlock() {
        return isBlock;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }
    public static Comparator<BankAccount> sortBankAccountant = new Comparator<BankAccount>() {

        public int compare(BankAccount b1,BankAccount b2) {
            BigInteger big1=b1.getNumOfAccount();
            BigInteger big2=b2.getNumOfAccount();
            return big1.compareTo(big2);
        }
    };

    @Override
    public String toString() {
        return "BankAccount: id=" + id +
                ", blocked=" + isBlock +
                ", balance=" + balance +
                ", currency=" + currency +
                ", number of account=" + numOfAccount ;
    }
}
