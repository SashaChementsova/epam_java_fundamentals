package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;
//Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.
public class Task10 {

    public static int countSentences(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='!'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str="Hi! My name's Sasha. How old am I? I'm twenty.";
        System.out.println("The string: "+str);
        System.out.println("The number of the sentences: "+countSentences(str));
    }
}
