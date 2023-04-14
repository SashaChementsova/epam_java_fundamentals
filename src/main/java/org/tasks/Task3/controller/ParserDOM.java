package org.tasks.Task3.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.tasks.Task3.entity.CaseOfStudent;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class ParserDOM {
    public List<CaseOfStudent> readXMLFile(){
        List<CaseOfStudent> cases=new ArrayList<>();
        CaseOfStudent caseOfStudent;
        String str="";
        try {
            // Создается построитель документа
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = documentBuilder.parse("archive.xml");
            // Получаем корневой элемент
            Node root = document.getDocumentElement();
            // Просматриваем все подэлементы корневого
            NodeList students = root.getChildNodes();
            for (int i = 0; i < students.getLength(); i++) {
                Node student = students.item(i);
                if (student.getNodeType() != Node.TEXT_NODE) {
                    NodeList studentProps = student.getChildNodes();
                    for(int j = 0; j < studentProps.getLength(); j++) {
                        Node studentProp = studentProps.item(j);
                        if (studentProp.getNodeType() != Node.TEXT_NODE) {
                            str+=studentProp.getChildNodes().item(0).getTextContent();
                            str+=";";
                        }
                    }

                }
            }
            System.out.println(str);
            String[] mass=str.split(";");
            for(int i=0;i< mass.length;i+=4){
                caseOfStudent=new CaseOfStudent();
                caseOfStudent.setId(Integer.parseInt(mass[i]));
                caseOfStudent.setSurname(mass[i+1]);
                caseOfStudent.setName(mass[i+2]);
                caseOfStudent.setGroup(Integer.parseInt(mass[i+3]));
                cases.add(caseOfStudent);
            }
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return cases;
    }
}