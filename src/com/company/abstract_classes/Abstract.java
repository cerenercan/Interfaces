package com.company.abstract_classes;

public class Abstract {

    public static void mainAbstract(){
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Parrot");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.fly();
    }
}
