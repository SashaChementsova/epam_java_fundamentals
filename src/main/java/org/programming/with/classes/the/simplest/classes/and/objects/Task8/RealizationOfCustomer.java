package org.programming.with.classes.the.simplest.classes.and.objects.Task8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RealizationOfCustomer {

    private List<Customer> customers=new ArrayList<>();
    public  RealizationOfCustomer(){
        customers.add(new Customer(1,"Chementsova", "Alexandra", "Vasilievna", "Minsk,Bedy,4","321456794003215", "321456791BY3074"));
        customers.add(new Customer(2,"Goroh", "Petr", "Nikolaevich", "Mogilev,Vorovskogo,5","321456794003457", "348556791BY3054"));
        customers.add( new Customer(3,"Uretskaya", "Valeriya", "Igorevna", "Gomel,Sovetskaya,59","321456794003289", "321454891BY3094"));
        customers.add(new Customer(4,"Gorodnaya", "Yuliya", "Sergeevna", "Minsk,Puskina,34","321456794003584", "324845791BY3084"));
        customers.add(new Customer(5,"Michulin", "Fedor", "Alexandrovich", "Brest,Shevchenko,45","321456794003199", "321485486BY3014"));
    }
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
        int choice;
        BigInteger creditCardLower=new BigInteger("321456794003170"), creditCardUpper=new BigInteger("321456794003290"),num;
        while(true){
            choice=0;
            System.out.println("Select a menu item:\n 1)Get SNP of customers;\n 2)Get addresses of customers;\n 3)Get credit cards of customers;\n 4)Get bank accounts of customers;\n 5)Sort customers by SNP;\n 6)Get credit cards from range;\n 7)Exit.");
            while(choice<1||choice>7){
                choice=checkNum();
                if(choice<1||choice>7) System.out.println("Error.Try again.");
            }
            switch (choice) {
                case 1:
                    for (Customer v : customers) {
                        System.out.println(v.getId()+". "+v.getSNP());
                    }
                    break;
                case 2:
                    for (Customer v : customers) {
                        System.out.println(v.getId()+". "+v.getAddress());
                    }
                    break;
                case 3:
                    for (Customer v : customers) {
                        System.out.println(v.getId()+". "+v.getCard());
                    }
                    break;
                case 4:
                    for (Customer v : customers) {
                        System.out.println(v.getId()+". "+v.getBankAccount());
                    }
                    break;
                case 5:
                    Collections.sort(customers,Customer.sortSNP);
                    for (Customer v : customers) {
                        System.out.println(v.toString());
                    }
                    break;
                case 6:
                    System.out.println("The range: "+creditCardLower+ " - "+creditCardUpper);
                    for (Customer v : customers) {
                        num=new BigInteger(v.getCard());
                        if(num.compareTo(creditCardLower)==1&&num.compareTo(creditCardUpper)==-1)  System.out.println(v.toString());
                    }
                    break;
                case 7:
                    return;
            }
        }

    }


}
