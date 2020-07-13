package com.aptheone.tree;

import java.util.List;

public class TestTree {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);
       /* tree.swapRoot();
        System.out.println("tree.equals : " +tree.equals(tree2));

        System.out.println("tree.find :" +tree.find(8));

        System.out.println("Pre-Order");
        tree.traversePreOrder();

        System.out.println("In-Order");
        tree.traverseInOrder();

        System.out.println("Post-Order");
        tree.traversePostOrder();
*/
        System.out.println("Height : " + tree.height());
/*

        System.out.println("Min :" +tree.min());

        System.out.println("minInBinarySerachTree :" +tree.minInBinarySerachTree());
*/
/*
        List<Integer> nodeAtDistance = tree.getNodeAtDistance(2);
        for (Integer node : nodeAtDistance) {
            System.out.println(node);
        }*/
        tree.traverseLevelOrder();
        System.out.println("Done");
    }
}
