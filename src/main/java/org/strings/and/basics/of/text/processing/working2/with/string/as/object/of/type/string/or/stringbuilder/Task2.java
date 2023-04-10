package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;
//В строке вставить после каждого символа 'a' символ 'b'.
public class Task2 {
    public static void main(String[] args){
        String str="word--course-game--word--java--word";
        System.out.println("The string: "+str);
        str = str.replace("a", "ab");
        System.out.println("The result string: "+str);
    }
}
