package com.olehbilykh.DataStructures.Tree;

public class TreeNode {
    private int value;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int value) {
        this.value = value;
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(value + ", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.print(value + ", ");
        if (leftChild != null) {
            leftChild.traversePreOrder();
        }
        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }

    public TreeNode get(int value) {
        if (this.value == value)
            return this;
        if (this.value > value) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int min() {
        if (leftChild == null) {
            return this.value;
        } else {
            return leftChild.min();
        }

    }

    public int max() {
        if (rightChild == null) {
            return this.value;
        } else {
            return rightChild.max();
        }

    }

    public void insert(int value) {
        if (this.value == value) {
            return;
        }
        if (value < this.value) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                '}';
    }

}
