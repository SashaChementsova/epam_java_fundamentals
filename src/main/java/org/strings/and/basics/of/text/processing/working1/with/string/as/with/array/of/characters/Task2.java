package org.strings.and.basics.of.text.processing.working1.with.string.as.with.array.of.characters;
//Замените в строке все вхождения 'word' на 'letter'.
public class Task2 {
    public static void main(String[] args){
        String str="word--course-game--word--java--word";
        System.out.println("The string: "+str);
        str = str.replace("word", "letter");
        System.out.println("The result: "+str);
    }
}
