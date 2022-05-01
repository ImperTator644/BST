package com.BSTree;

import java.util.Objects;

/**
 * Class BNode represents a single node in binary tree structure
 */
public class BNode implements Node<BNode> {
    private int value;      //stored value
    private BNode left;      //reference to left node
    private BNode right;     //reference to right node
    private BNode parent;     //reference to parent node

    /**
     * Creates a node with given values
     * @param value integer to hold
     * @param left reference to left child node
     * @param right reference to right child node
     * @param parent reference to parent node
     */
    public BNode(int value, BNode left, BNode right, BNode parent){
        this.value = value;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    //getters and setters

    /**
     *
     * @return value of node
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets node's value
     * @param value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     *
     * @return reference to left child node
     */
    public BNode getLeft() {
        return left;
    }

    /**
     * Sets a left child node
     * @param left reference to node to be set as a left child node
     */
    public void setLeft(BNode left) {
        this.left = left;
    }

    /**
     *
     * @return reference to right child node
     */
    public BNode getRight() {
        return right;
    }

    /**
     * Sets a right child node
     * @param right reference to node to be set as a right child node
     */
    public void setRight(BNode right) {
        this.right = right;
    }

    /**
     *
     * @return reference to parent node
     */
    public BNode getParent() {
        return parent;
    }

    /**
     * Sets a parent node
     * @param parent reference to node to be set as a parent node
     */
    public void setParent(BNode parent) {
        this.parent = parent;
    }

    /**
     * Checks, if two nodes are equal
     * @param other another node
     * @return true, if nodes are equal, or false if they are not
     */
    @Override
    public boolean equals(Object other){
        if(this == other) return true;
        if(other == null) return false;
        if(this.getClass() != other.getClass()) return false;
        var otherObject = (BNode) other;

        return (Objects.equals(this.getLeft(), otherObject.getLeft())
                && Objects.equals(this.getRight(), otherObject.getRight())
                && Objects.equals(this.getParent(), otherObject.getParent())
                && this.getValue() == otherObject.getValue());
    }

    /**
     *
     * @return String representation of node
     */
    @Override
    public String toString(){
        return Integer.toString(this.getValue());
    }
}
