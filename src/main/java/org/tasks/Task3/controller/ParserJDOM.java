package org.tasks.Task3.controller;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.tasks.Task3.entity.CaseOfStudent;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ParserJDOM {
    public void recordXMLFile(List<CaseOfStudent> students) throws IOException {
        Document doc = new Document();
        // создаем корневой элемент с пространством имен
        doc.setRootElement(new Element("Archive",
                Namespace.getNamespace("https://javadevblog.com/students")));
        // формируем JDOM документ из объектов Student
        for (CaseOfStudent student : students) {
            Element studentElement = new Element("Student",
                    Namespace.getNamespace("https://javadevblog.com/students"));
            studentElement.addContent(new Element("Id",
                    Namespace.getNamespace("https://javadevblog.com/students")).setText("" + student.getId()));
            studentElement.addContent(new Element("Surname",
                    Namespace.getNamespace("https://javadevblog.com/students")).setText( student.getSurname()));
            studentElement.addContent(new Element("Name",
                    Namespace.getNamespace("https://javadevblog.com/students")).setText(student.getName()));
            studentElement.addContent(new Element("Group",
                    Namespace.getNamespace("https://javadevblog.com/students")).setText("" +student.getGroup()));
            doc.getRootElement().addContent(studentElement);
        }
        // Документ JDOM сформирован и готов к записи в файл
        XMLOutputter xmlWriter = new XMLOutputter(Format.getPrettyFormat());
        // сохнаряем в файл
        xmlWriter.output(doc, new FileOutputStream("archive.xml"));
    }
}
