package org.basics2.of.oop.task1;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.
public class Main {
    public static void main(String[] args) {

        Directory dir = new Directory("src\\by\\introduction\\fifth\\OOP1\\main");

        TextFile fileTxt = new TextFile("File.tmp");

        dir.addDirectory(dir);
        dir.addFile(fileTxt);
        dir.removeDirectory("delete");
        dir.removeFile("file");
        dir.rename("NewFile");

        fileTxt.addText("text");


    }
}
