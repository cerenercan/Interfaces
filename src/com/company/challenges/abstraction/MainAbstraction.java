package com.company.challenges.abstraction;

public class MainAbstraction {

    public static void mainAbstractChallenge(){
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String [] data = stringData.split(" ");
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        for (String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}
