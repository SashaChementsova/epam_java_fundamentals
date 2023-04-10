package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;
//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".
public class Task7 {
    public static boolean checkForDuplicateCharacters(String str,char c){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c) return false;
        }
        return true;
    }
    public static String editString(String str){
        StringBuilder str1= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(checkForDuplicateCharacters(str1.toString(),str.charAt(i)) && !(str.charAt(i) == ' ')){
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();
    }
    public static void main(String[] args) {
        String str="abc cde def";
        System.out.println("The string: "+str);
        System.out.println("The result string: "+ editString(str));
    }
}
