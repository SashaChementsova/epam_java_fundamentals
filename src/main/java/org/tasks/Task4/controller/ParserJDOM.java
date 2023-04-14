package org.tasks.Task4.controller;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.tasks.Task4.entity.Ship;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ParserJDOM {
    public void recordXMLFile(List<Ship> ships) throws IOException {
        Document doc = new Document();
        // создаем корневой элемент с пространством имен
        doc.setRootElement(new Element("Port",
                Namespace.getNamespace("https://javadevblog.com/students")));
        // формируем JDOM документ из объектов Student
        for (Ship ship : ships) {
            Element studentElement = new Element("Ship",
                    Namespace.getNamespace("https://javadevblog.com/students"));
            studentElement.addContent(new Element("Id",
                    Namespace.getNamespace("https://javadevblog.com/students")).setText("" + ship.getId()));
            studentElement.addContent(new Element("Capacity",
                    Namespace.getNamespace("https://javadevblog.com/students")).setText( ""+ship.getCarrying()));
            studentElement.addContent(new Element("Name",
                    Namespace.getNamespace("https://javadevblog.com/students")).setText(ship.getName()));
            studentElement.addContent(new Element("TypeOfCargo",
                    Namespace.getNamespace("https://javadevblog.com/students")).setText(ship.getTypeOfCargo()));
            doc.getRootElement().addContent(studentElement);
        }
        // Документ JDOM сформирован и готов к записи в файл
        XMLOutputter xmlWriter = new XMLOutputter(Format.getPrettyFormat());
        // сохнаряем в файл
        xmlWriter.output(doc, new FileOutputStream("port.xml"));
    }
}
