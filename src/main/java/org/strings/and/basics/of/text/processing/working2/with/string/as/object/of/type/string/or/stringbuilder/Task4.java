package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Task4 {
    public static void main(String[] args) {
        String str="информатика";
        System.out.println("The string: "+str);
        System.out.println("The result string: "+(str.charAt(7)+str.substring(3,5)+str.charAt(7)));
    }
}
