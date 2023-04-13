package org.basics2.of.oop.task5.controller;

import org.basics2.of.oop.task5.entity.Sweet;
import org.basics2.of.oop.task5.entity.TypeOfSweet;
import org.basics2.of.oop.task5.entity.TypeOfWrap;
import org.basics2.of.oop.task5.entity.Wrap;

import java.util.Random;

public class Gift {
    Random rand = new Random();

    public Sweet chooseSweet() {

        Sweet sweet = new Sweet(TypeOfSweet.getTypeOfSweet(),Math.round(rand.nextDouble() * 10000) / 1000, Math.round(rand.nextDouble() * 1000) / 100);
        return sweet;
    }

    public Wrap chooseWrap() {

        return new Wrap(Math.round(rand.nextDouble() * 10000) / 1000, TypeOfWrap.getTypeOfWrap());
    }


}
