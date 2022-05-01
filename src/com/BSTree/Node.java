package com.BSTree;

/**
 * Generic interface with declarations of methods common for binary nodes in 'binary tree' data structures
 */
public interface Node<T> {

    /**
     *
     * @return value of node
     */
    int getValue();

    /**
     * Sets node's value
     * @param value to set
     */
    void setValue(int value);

    /**
     *
     * @return reference to left child node
     */
    T getLeft();

    /**
     * Sets a left child node
     * @param left reference to node to be set as a left child node
     */
    void setLeft(T left);

    /**
     *
     * @return reference to right child node
     */
    T getRight();

    /**
     * Sets a right child node
     * @param right reference to node to be set as a right child node
     */
    void setRight(T right);

    /**
     *
     * @return reference to parent node
     */
    T getParent();

    /**
     * Sets a parent node
     * @param parent reference to node to be set as a parent node
     */
    void setParent(T parent);
}
