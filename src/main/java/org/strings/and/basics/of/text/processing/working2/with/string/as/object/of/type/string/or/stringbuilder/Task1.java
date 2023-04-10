package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;
//. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Task1 {
    public static int calculateMaxSpace(String str){
        int max=0,sum;
        for(int i=0;i<str.length();i++){
            sum=0;
            while (str.charAt(i)==' '){
                sum++;
                i++;
                if(i==str.length()) break;
            }
            if(sum>max) max=sum;
        }
        return max;
    }
    public static void main(String[] args) {
        String str = " java   true 4  course ";
        System.out.println("The string:"+str);
        System.out.println("The result:"+ calculateMaxSpace(str));
    }
}
