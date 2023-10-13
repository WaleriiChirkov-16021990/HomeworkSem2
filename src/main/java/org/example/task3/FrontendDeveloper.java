package org.example.task3;

public class FrontendDeveloper extends Developer implements Frontable {
    @Override
    public void createFrontendForm() {
        System.out.println("Creating Frontend form");
    }

    @Override
    public void developGUI() {
        System.out.println("Creating GUI");
    }

    @Override
    public void developServer() {
        System.out.println("I'm not a backend developers");
    }
}
