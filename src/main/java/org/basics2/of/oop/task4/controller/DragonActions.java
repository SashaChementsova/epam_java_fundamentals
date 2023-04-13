package org.basics2.of.oop.task4.controller;

import org.basics2.of.oop.task4.entity.Dragon;
import org.basics2.of.oop.task4.entity.Treasure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DragonActions {
    private Dragon dragon;
    public DragonActions(){
        dragon=new Dragon();
    }
    public void printTreasures(){
        System.out.println("All dragon treasures:");
        for(Treasure treasure: dragon.getTreasures()){
            System.out.println(treasure.toString());
        }
    }

    public Treasure getTheMostPreciousTreasure(){

        double maxCost = 0;
        Treasure moreExpTreasure = new Treasure();

        for (Treasure treasure : dragon.getTreasures()) {

            if(treasure.getPrice() > maxCost){
                maxCost = treasure.getPrice();
            }
            if(treasure.getPrice() == maxCost){
                moreExpTreasure = treasure;
            }
        }
        return moreExpTreasure;
    }

    public ArrayList<Treasure> getTreasureOfCertainPrice(double certainSum){

        double sum = 0;
        ArrayList<Treasure> treasuresOfCertainSum = new ArrayList<>();

        Arrays.sort(dragon.getTreasures(), Comparator.comparing(Treasure::getPrice));

        for (Treasure treasure : dragon.getTreasures()) {

            sum += treasure.getPrice();

            if(sum <= certainSum){

                treasuresOfCertainSum.add(treasure);
            }
        }
        return treasuresOfCertainSum;
    }
}
