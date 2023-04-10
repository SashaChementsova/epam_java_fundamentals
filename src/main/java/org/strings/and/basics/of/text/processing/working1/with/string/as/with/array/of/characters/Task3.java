package org.strings.and.basics.of.text.processing.working1.with.string.as.with.array.of.characters;
// В строке найти количество цифр.
public class Task3 {

    public static int calculateDigits(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))) sum++;
        }
        return sum;
    }
    public static void main(String[] args){
        String str="5jbhb43njn3k23j";
        System.out.println("The string: "+str);
        System.out.println("The number of digits per line: "+ calculateDigits(str));
    }
}
