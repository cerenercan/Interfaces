package com.company.challenges.abstraction;

public class MainAbstraction {

    public static void mainAbstractChallenge(){
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String [] data = stringData.split(" ");
//        MyLinkedList list = new MyLinkedList(null);
        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());

        for (String s : data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());

//        list.traverse(list.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("5"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("0"));
//        list.removeItem(new Node("4"));
//        list.removeItem(new Node("2"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("9"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("8"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("6"));
//        list.traverse(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());



    }
}
