package org.basics2.of.oop.task4.entity;

import org.basics2.of.oop.task4.controller.CaveFilling;

public class Dragon {
    CaveFilling cave = new CaveFilling();
    Treasure[] treasures;

    public Dragon() {
        treasures=cave.fillTreasures();
    }

    public Treasure[] getTreasures() {
        return treasures;
    }

    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }

}
