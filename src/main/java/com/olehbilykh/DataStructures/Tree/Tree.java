package com.olehbilykh.DataStructures.Tree;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public int getMin() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int getMax() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public TreeNode get(int value) {
        if (root != null)
            return root.get(value);
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null)
            return subtreeRoot;
        if (value < subtreeRoot.getValue()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getValue()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            // 0 or 1 children
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
            // 2 children
            // replace the value in the subTreeRoot node with the smallest values
            // from the right subtree
            subtreeRoot.setValue(subtreeRoot.getRightChild().min());
            // delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getValue()));
        }
        return subtreeRoot;
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }
}
