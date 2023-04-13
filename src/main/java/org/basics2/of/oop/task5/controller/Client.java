package org.basics2.of.oop.task5.controller;

import org.basics2.of.oop.task5.entity.Sweet;
import org.basics2.of.oop.task5.entity.Wrap;

public class Client {
    Sweet sweet;
    Wrap wrap;
    public Client(Gift gift){
        sweet=gift.chooseSweet();
        wrap=gift.chooseWrap();
    }
    public void giveGift(){

        wrap.makeGift(sweet);
    }
}
