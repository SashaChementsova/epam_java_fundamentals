package org.strings.and.basics.of.text.processing.working3.with.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
//тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
//нельзя.
public class Task2 {
    public static void main(String[] args){
        String s = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Vasya</to>\n" +
                "<from>Sveta</from>\n" +
                "<heading>Prompt</heading>\n" +
                "<body>Call me tomorrow!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Petya</to>\n" +
                "<from>Masha</from>\n" +
                "<heading>Important prompt</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";

        Pattern patt = Pattern.compile("(<.*?>)(.*?)(<\\/.*?>)");
        Matcher match = patt.matcher(s);
        Pattern pattTagwithoutbody = Pattern.compile("(<.*?\\/>)");
        Matcher matchTagWithoutBody = pattTagwithoutbody.matcher(s);

        while (match.find()) {
            System.out.println("Open-tag is: " + match.group(1));
            System.out.println("Content of tag is: " + match.group(2));
            System.out.println("Close-tag is: " + match.group(3));

        }
        if(matchTagWithoutBody.find()){
            System.out.println("Tag without body is: " + matchTagWithoutBody.group());
        }
    }
}
