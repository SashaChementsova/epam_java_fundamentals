package org.strings.and.basics.of.text.processing.working1.with.string.as.with.array.of.characters;
//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class Task1 {
    public static String camelCaseToSnakeCase(String str)
    {
        String result = "";
        char c = str.charAt(0);
        result = result + Character.toLowerCase(c);
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result = result + '_';
                result
                        = result
                        + Character.toLowerCase(ch);
            }
            else {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String args[])
    {
        String[] mass=new String[]{"getNum","calculateSum","checkNum"};
        for(String str:mass){
            System.out.println(str+" -> "+camelCaseToSnakeCase(str));
        }
    }
}
