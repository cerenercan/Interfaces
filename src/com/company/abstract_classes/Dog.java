package com.company.abstract_classes;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog -> eat()");
        System.out.println(getName() + " eating...");
    }

    @Override
    public void breathe() {
        System.out.println("Dog -> breathe()");
    }
}
