package org.basics2.of.oop.task4.controller;

import org.basics2.of.oop.task4.entity.Treasure;
import org.basics2.of.oop.task4.entity.TypeOfTreasure;

import java.util.Random;

public class CaveFilling {
    private Treasure[] treasures = new Treasure[100];

    public Treasure[] fillTreasures(){

        for (int i = 0; i < treasures.length; i++) {
            Random r = new Random();
            treasures[i] = (new Treasure(TypeOfTreasure.getTypeOfTreasure(),(r.nextDouble() * 10),100 + (1000 - 100) * r.nextDouble()));
        }
        return treasures;
    }
}
