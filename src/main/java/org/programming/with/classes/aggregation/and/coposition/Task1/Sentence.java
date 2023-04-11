package org.programming.with.classes.aggregation.and.coposition.Task1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> sentence;

    public Sentence() {
        this.sentence =new ArrayList<>();
    }
    public void addNewWord(Word word){
        sentence.add(word);
    }
    public void printSentence() {
        for (Word v : sentence) {
            System.out.print(v.getStr() + " ");
        }
    }
}
