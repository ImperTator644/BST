package com.BSTree;

/**
 * Generic interface with declarations of methods common for binary search trees.
 * Binary Search Tree is a Binary Tree, where nodes with bigger value are being placed to the right of the parent node,
 * and nodes with lower values are being placed to the left of the parent node.
 * @param <T> a structure representing single node
 */
public interface BSTree<T> {

    /**
     * Creates and inserts new node
     * @param value integer value of the new node
     */
    void insert(int value);

    /**
     * Searches for node, which holds given value
     * @param value integer value we are searching for
     * @return node with given value or null, if value doesn't exist
     */
    T search(int value);

    /**
     *
     * @param node which is going to be the root of the tree we check
     * @return node holding minimum value
     */
    T minimum(T node);

    /**
     *
     * @param node which is going to be the root of the tree we check
     * @return node holding maximum value
     */
    T maximum(T node);

    /**
     * Successor is the lowest of the 'higher' nodes from given node
     * @param node we search for its successor
     * @return successor of the node
     */
    T successor(T node);

    /**
     * Predecessor is the 'highest' of the 'lower' nodes from given node
     * @param node we search for its predecessor
     * @return predecessor of the node
     */
    T predecessor(T node);

    /**
     * Deletes given node
     * @param node which is going to be deleted
     */
    void delete(T node);

    /**
     * Deletes all nodes
     * @param node which is going to be the root of the tree we delete
     */
    void clear(T node);
}
