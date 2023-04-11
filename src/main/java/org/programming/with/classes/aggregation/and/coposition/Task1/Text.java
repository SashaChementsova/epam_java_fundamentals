package org.programming.with.classes.aggregation.and.coposition.Task1;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private String title;
    private List<Sentence> text;

    public Text(String title) {
        this.title = title;
        this.text = new ArrayList<>();
    }

    public void addSentence(Sentence sentence) {
        text.add(sentence);
    }

    public void printTitle() {
        System.out.println(title);
    }

    public void printText(){
        System.out.println(title);
        for (Sentence v : text) {
            v.printSentence();
        }
    }
}
