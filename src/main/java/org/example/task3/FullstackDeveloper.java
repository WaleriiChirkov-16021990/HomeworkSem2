package org.example.task3;

public class FullstackDeveloper extends Developer implements Fullstackable {
    @Override
    public void createBackendCode() {
        System.out.println("Server is ready");
    }

    @Override
    public void createFrontendForm() {
        System.out.println("User interface is ready");
    }

    @Override
    public void developGUI() {
        System.out.println("Okay");
    }

    @Override
    public void developServer() {
        System.out.println("Okay");
    }
}
