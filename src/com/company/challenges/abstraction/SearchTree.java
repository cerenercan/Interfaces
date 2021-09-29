package com.company.challenges.abstraction;

public class SearchTree implements NodeList{
//BINARY SEARCH TREE
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null){
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0){
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0){
                if (currentItem.previous() != null){
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present.");
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
        //recursive method
        if (root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
