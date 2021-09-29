package com.company.challenges.abstraction;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        //if the list is empty the item that will be added become the root.
        if (this.root == null){
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            //newItem is greater, move right if possible.
            if (comparison < 0){
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    //there is no next, insert at the end of the list.
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0){
                //newItem is less, insert before the currentItem.
                if (currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
