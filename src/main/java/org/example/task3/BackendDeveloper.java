package org.example.task3;

public class BackendDeveloper extends Developer implements Backendable{
    @Override
    public void createBackendCode() {
        System.out.println("Server created");
    }

    @Override
    public void developGUI() {
        System.out.println("I'm not a frontend developer");
    }

    @Override
    public void developServer() {
        System.out.println("Server created");
    }
}
