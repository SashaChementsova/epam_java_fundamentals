package org.tasks.Task1.runner;

import org.tasks.Task1.controller.BookDAOImpl;
import org.tasks.Task1.menu.Menu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu=new Menu();
        menu.getMenu();
    }
}
