package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;
// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task5 {
    public static int calculateResult(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='а') sum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        String str="информатика";
        System.out.println("The string: "+str);
        System.out.println("The result: "+calculateResult(str));
    }
}
