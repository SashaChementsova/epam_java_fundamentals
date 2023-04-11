package org.programming.with.classes.aggregation.and.coposition.Task1;
//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.
public class Main {
    public static void main(String[] args){
        Sentence sentence1 = new Sentence();
        sentence1.addNewWord(new Word("This is"));
        sentence1.addNewWord(new Word("the first"));
        sentence1.addNewWord(new Word("sentence."));
        Sentence sentence2 = new Sentence();
        sentence2.addNewWord(new Word("\nMy name"));
        sentence2.addNewWord(new Word("is"));
        sentence2.addNewWord(new Word("Sasha."));
        Sentence sentence3 = new Sentence();
        sentence3.addNewWord(new Word("\nI am"));
        sentence3.addNewWord(new Word("twenty."));
        Text text = new Text("Title: New Text");
        text.addSentence(sentence1);
        text.addSentence(sentence2);
        text.addSentence(sentence3);
        text.printText();
    }
}
