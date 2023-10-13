package org.example;

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


    }
}