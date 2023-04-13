package org.basics2.of.oop.task4.entity;

import java.util.Random;

public enum TypeOfTreasure {
    GOLD, PEARL, ARTIFACT, DIAMOND, EMERALD;


    public static TypeOfTreasure getTypeOfTreasure(){
        TypeOfTreasure[] types = TypeOfTreasure.values();
        return types[new Random().nextInt(types.length)];
    }
}
