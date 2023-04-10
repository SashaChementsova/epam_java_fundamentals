package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;
//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.
public class Task8 {
    public static String findMaxWord(String str){
        String max="";
        StringBuilder word= new StringBuilder();
        for(int i=0;i<str.length();i++){
            word.append(str.charAt(i));
            if(str.charAt(i) == ' '||i+1==str.length()){
                if(word.toString().trim().length()>max.length()){
                    max= word.toString().trim();
                }
                word = new StringBuilder();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "java true 4 course";
        System.out.println("The string:"+str);
        System.out.println("The result:"+ findMaxWord(str));
    }
}
