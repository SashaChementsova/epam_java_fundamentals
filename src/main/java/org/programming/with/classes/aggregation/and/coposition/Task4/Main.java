package org.programming.with.classes.aggregation.and.coposition.Task4;
//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.
public class Main {
    public static void main(String[] args){
        int id=23;
        Client cl=new Client();
        cl.getSumOfAccounts();
        cl.getSumOfNegativeAccounts();
        cl.getSumOfPositiveAccounts();
        System.out.println("Account where id = "+id+": ");
        cl.searchAccount(id);
        System.out.println("Sorted accounts by numbers of accounts:");
        cl.sortAccounts();
    }
}
