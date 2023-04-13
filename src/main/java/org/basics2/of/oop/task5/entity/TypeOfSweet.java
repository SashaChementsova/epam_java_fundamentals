package org.basics2.of.oop.task5.entity;

import java.util.Random;

public enum TypeOfSweet {
    CHOCOLATE,CANDIES, COOKIES, CANDY_BAR;
    public static TypeOfSweet getTypeOfSweet(){
        TypeOfSweet[] types = TypeOfSweet.values();
        Random rand = new Random();
        return types[rand.nextInt(types.length)];
    }
}
