package org.example.task3;

public class FullstackDeveloper implements Fullstackable{
    @Override
    public void createBackendCode() {
        System.out.println("Server is ready");
    }

    @Override
    public void createFrontendForm() {
        System.out.println("User interface is ready");
    }
}
