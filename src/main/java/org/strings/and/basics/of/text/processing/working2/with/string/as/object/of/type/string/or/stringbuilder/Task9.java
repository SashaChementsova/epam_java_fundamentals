package org.strings.and.basics.of.text.processing.working2.with.string.as.object.of.type.string.or.stringbuilder;
//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.
public class Task9 {
    public static int[] countCharacters(String str){
        int[] counts=new int[]{0,0};
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                counts[0]++;
            }
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                counts[1]++;
            }
        }
        return counts;
    }
    public static void main(String[] args) {
        String str = "Java tRUe couRse";
        System.out.println("The string:"+str);
        int[] counts=countCharacters(str);
        System.out.println("Number of uppercase letters: "+counts[0]);
        System.out.println("Number of lowercase letters: "+counts[1]);
    }
}
