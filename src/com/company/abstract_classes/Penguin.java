package com.company.abstract_classes;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Penguins are not good at flying.");
    }
}
