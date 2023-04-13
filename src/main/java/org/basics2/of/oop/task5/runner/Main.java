package org.basics2.of.oop.task5.runner;

import org.basics2.of.oop.task5.controller.Client;
import org.basics2.of.oop.task5.controller.Gift;

//. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
//подарок). Составляющими целого подарка являются сладости и упаковка.
public class Main {
    public static void main(String[] args){
        Client client = new Client(new Gift());
        client.giveGift();
    }
}
