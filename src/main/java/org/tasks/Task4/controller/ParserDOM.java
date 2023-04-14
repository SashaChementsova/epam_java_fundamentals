package org.tasks.Task4.controller;

import org.tasks.Task4.entity.Ship;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserDOM {
    public List<Ship> readXMLFile(){
        List<Ship> ships=new ArrayList<>();
        Ship ship;
        String str="";
        try {
            // Создается построитель документа
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = documentBuilder.parse("port.xml");
            // Получаем корневой элемент
            Node root = document.getDocumentElement();
            // Просматриваем все подэлементы корневого
            NodeList ships1 = root.getChildNodes();
            for (int i = 0; i < ships1.getLength(); i++) {
                Node ship1 = ships1.item(i);
                if (ship1.getNodeType() != Node.TEXT_NODE) {
                    NodeList shipProps = ship1.getChildNodes();
                    for(int j = 0; j < shipProps.getLength(); j++) {
                        Node shipProp = shipProps.item(j);
                        if (shipProp.getNodeType() != Node.TEXT_NODE) {
                            str+=shipProp.getChildNodes().item(0).getTextContent();
                            str+=";";
                        }
                    }

                }
            }
            System.out.println(str);
            String[] mass=str.split(";");
            for(int i=0;i< mass.length;i+=4){
                ship=new Ship();
                ship.setId(Integer.parseInt(mass[i]));
                ship.setCarrying(Double.parseDouble(mass[i+1]));
                ship.setName(mass[i+2]);
                ship.setTypeOfCargo(mass[i+3]);
                ships.add(ship);
            }
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return ships;
    }
}