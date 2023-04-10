package org.strings.and.basics.of.text.processing.working1.with.string.as.with.array.of.characters;
//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.
public class Task5 {
    public static void main(String[] args){
        String str=" java   true 4  course ";
        System.out.println("The string: "+str);
        System.out.println("The result string: "+ str.replaceAll("\\s+", " ").trim());
    }

}
