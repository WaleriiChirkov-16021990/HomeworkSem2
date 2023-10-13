package org.example;

import org.example.task3.BackendDeveloper;
import org.example.task3.Developer;
import org.example.task3.FrontendDeveloper;
import org.example.task3.FullstackDeveloper;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        FullstackDeveloper full = new FullstackDeveloper();
//        full.createBackendCode();
//        full.createFrontendForm();
//        =================================================================


        Developer developer = new FrontendDeveloper();
        developer.developGUI();
        developer.developServer();

        Developer developer2 = new BackendDeveloper();
        developer2.developGUI();
        developer2.developServer();

        Developer developer3 = new FullstackDeveloper();
        developer3.developGUI();
        developer3.developServer();

    }
}