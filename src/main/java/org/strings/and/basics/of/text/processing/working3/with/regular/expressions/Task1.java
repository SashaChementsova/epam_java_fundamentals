package org.strings.and.basics.of.text.processing.working3.with.regular.expressions;

import java.util.Arrays;

//Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
//алфавиту.
public class Task1 {
    public static void main(String[] args){
        String str="Titanic was released in 1997. It was directed, written and produced by James Cameron.\n" +
                "The film stars Leonardo DiCaprio and Kate Winslet. After this film both actors became famous all over the world.\n" +
                "Titanic remained the highest-grossing film of all time until Cameron's Avatar surpassed it in 2010.\n"+
                "The film is based on the true story of Titanic, a huge passenger liner that sank after striking an iceberg on 15 April 1912.\n" +
                "The film tells us a story of two people, Rose and Jack, who fell in love with each other. Rose belonged to high society, while Jack was a penniless artist who won his ticket in a card game.\n" +
                "Their troubles began when the others found out about this love affair. Despite everything Rose and Jack stood by each other. Unfortunately, we will never know whether this beautiful love story would have a happy ending as Jack did not survive. Rose survived.\n" +
                "At the end of the film we realize that she will keep these feelings in her heart. And she did. She carried them through the rest of her life.\n" +
                "Titanic made a strong impression on me. To my mind, Titanic is one of those films after which no one will remain indifferent. After this film one can think a lot about happiness, love and tragic coincidence.";
        sortOfSentence(str);
        sortOfWord(str);
        sortLexemes(str);

    }
    private static void sortLexemes(String s) {

        String lex = "l";
        String[] sentences = s.split("(?:[?.!])");

        for (String sentence : sentences) {

            String[] words = sentence.split("(?:[- :;,')])");

            for (int k = words.length - 1; k >= 0; k--) {

                for (int m = 0; m < k; m++) {

                    int lexemInWord = 0;
                    int lexemInNextWord = 0;

                    for (int n = 0; n < words[m].length(); n++) {

                        if (String.valueOf(words[m].charAt(n)).
                                compareToIgnoreCase(lex) == 0) {
                            lexemInWord++;
                        }
                    }
                    for (int n = 0; n < words[m + 1].length(); n++) {

                        if (String.valueOf(words[m + 1].charAt(n))
                                .compareToIgnoreCase(lex) == 0) {
                            lexemInNextWord++;
                        }
                    }
                    if (lexemInWord < lexemInNextWord) {
                        String temp = words[m];
                        words[m] = words[m + 1];
                        words[m + 1] = temp;
                    }
                    else if (lexemInWord == lexemInNextWord) {

                        String [] forCompare = {words[m], words[m + 1]};
                        Arrays.sort(forCompare);//in alphabet order
                        words[m] = forCompare[0];
                        words[m + 1] = forCompare[1];
                    }
                }
            }
            print(words);
        }
    }
    private static void sortOfWord(String s) {
        String[] sentence = s.split("(?:[?.!])");
        String temp;
        for (var v : sentence) {
            String [] words = v.split("(?:[- :;,')])");
            for (int k = words.length - 1; k >= 0; k--) {
                for (int m = 0; m < k; m++) {
                    if (words[m].length() > words[m + 1].length()) {
                        temp = words[m];
                        words[m] = words[m + 1];
                        words[m + 1] = temp;
                    }
                }
            }
            print(words);
        }
    }
    private static void sortOfSentence(String s){

        String [] paragraphs = s.split("  ");
        int [] countSentInPar = new int[paragraphs.length];
        int maxCount = 0;

        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = paragraphs[i].split("(?:[?.!])");
            countSentInPar[i] = sentences.length;

            if(maxCount < countSentInPar[i]){
                maxCount = countSentInPar[i];
            }
        }

        for (int i = 1; i <= maxCount; i++) {
            for (int j = 0; j < countSentInPar.length; j++) {

                if (i == countSentInPar[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }
    private static void print(String [] s){
        for (var v : s) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
