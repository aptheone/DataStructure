package com.aptheone.tree;

public class TestTree {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(8);
        tree.insert(10);
        tree.insert(4);
        tree.insert(10);
        tree.insert(6);
        tree.insert(1);
        tree.insert(9);
        System.out.println(tree.find(8));
        System.out.println("Done");
    }
}
