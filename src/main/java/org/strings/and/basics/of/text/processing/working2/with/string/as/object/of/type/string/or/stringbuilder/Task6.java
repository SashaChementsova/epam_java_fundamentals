package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;
//Из заданной строки получить новую, повторив каждый символ дважды.
public class Task6 {
    public static String editString(String str){
        StringBuilder str1= new StringBuilder();
        for(int i=0;i<str.length();i++){
            str1.append(str.charAt(i));
            str1.append(str.charAt(i));
        }
        return str1.toString();
    }
    public static void main(String[] args) {
        String str="информатика";
        System.out.println("The string: "+str);
        System.out.println("The result string: "+ editString(str));
    }
}
