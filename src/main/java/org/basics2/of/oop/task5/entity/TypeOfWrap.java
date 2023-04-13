package org.basics2.of.oop.task5.entity;

import java.util.Random;

public enum TypeOfWrap {
    CRAFT,BOX,PAPER,PACKAGE;
    public static TypeOfWrap getTypeOfWrap(){
        TypeOfWrap[] types = TypeOfWrap.values();
        Random rand = new Random();
        return types[rand.nextInt(types.length)];
    }
}
