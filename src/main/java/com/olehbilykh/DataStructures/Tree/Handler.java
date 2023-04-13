package com.olehbilykh.DataStructures.Tree;

public class Handler {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.traverseInOrder();

//        System.out.println();
//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(25));
//        System.out.println(intTree.get(209898));
//        System.out.println("min: " + intTree.getMin());
//        System.out.println("max: " + intTree.getMax());

//        intTree.delete(15);
//        intTree.delete(32);
//        intTree.delete(25);
        System.out.println();
        intTree.traversePreOrder();

    }
}
