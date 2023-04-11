package org.programming.with.classes.the.simplest.classes.and.objects.Task9;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RealizationOfBook {
    private List<Book> books=new ArrayList<>();
    public  RealizationOfBook(){
        books.add(new Book(123, "Captain daughter","Puskin A.S.","Azbuka",2022,480,9.47,"paperbacks"));
        books.add(new Book(178, "Idiot","Dostoevskiy F.M.","Eksmo",2020,640,10.96,"hardcover"));
        books.add(new Book(73, "Demons","Dostoevskiy F.M.","Eksmo",2012,768,12.30,"paperbacks"));
        books.add(new Book(59, "Dunno on the Moon","Nosov N.N.","Mahaon",2022,440,43.39,"hardcover"));
        books.add(new Book(285, "Lion and dog","Tolstoy L.N.","AST",2022,16,3.60,"hardcover"));
    }
    private int checkNum(int a){ //проверка целого числа
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            while (!sc.hasNextInt()){
                System.out.println("Error. Try again.");
                sc.next();
            }
            x = sc.nextInt();
            if(x<=a) System.out.println("Error. Try again.");
        }while(x<=a);
        return x;
    }

    public void getMenu() {

        int choice;
        String str=""; int y,flag;
        Scanner sc=new Scanner(System.in);
        while(true){
            choice=0;
            System.out.println("Select a menu item:\n 1)Get names of books;\n 2)Get authors of books;\n 3)Get publishers of books;\n 4)Get prices of books;\n 5)Get books from the author;\n 6)Get books from the publisher;\n 7)Get books released after a certain year;\n 8)Exit.");

            while(choice<1||choice>8){
                choice=checkNum(0);
                if(choice<1||choice>7) System.out.println("Error.Try again.");
            }
            switch (choice) {
                case 1:
                    for (Book v : books) {
                        System.out.println(v.getId()+". "+v.getName());
                    }
                    break;
                case 2:
                    for (Book v : books) {
                        System.out.println(v.getId()+". "+v.getAuthors());
                    }
                    break;
                case 3:
                    for (Book v : books) {
                        System.out.println(v.getId()+". "+v.getPublisher());
                    }
                    break;
                case 4:
                    for (Book v : books) {
                        System.out.println(v.getId()+". "+v.getPrice());
                    }
                    break;
                case 5:
                    flag=0;
                    System.out.println("Enter the authors:");
                    str=sc.nextLine();
                    for (Book v : books) {
                        if(str.equals(v.getAuthors())) { System.out.println(v.toString()); flag=1;}
                    }
                    if(flag==0) System.out.println("There are no such books");
                    break;
                case 6:
                    flag=0;
                    System.out.println("Enter the publisher:");
                    str=sc.nextLine();
                    for (Book v : books) {
                        if(str.equals(v.getPublisher()))  {System.out.println(v.toString()); flag=1;}
                    }
                    if(flag==0) System.out.println("There are no such books");
                    break;
                case 7:
                    flag=0;
                    System.out.println("Enter the year after which you want to find the books:");
                    y=checkNum(1800);
                    for (Book v : books) {
                        if(y<=v.getYear()) { System.out.println(v.toString());flag=1;}
                    }
                    if(flag==0) System.out.println("There are no such books");
                    break;
                case 8:
                    return;
            }
        }

    }
}
