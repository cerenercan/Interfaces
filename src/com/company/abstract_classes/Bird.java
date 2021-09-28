package com.company.abstract_classes;

public  abstract class Bird extends Animal implements Fly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bird -> eat()");
        System.out.println(getName() + " eating");
    }

    @Override
    public void breathe() {
        System.out.println("Bird -> breathe()");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}
