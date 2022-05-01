package com.BSTree;

/**
 * Generic interface with declarations of methods common for binary trees.
 * @param <T> a structure representing single node
 */
public interface BTree<T> {

    /**
     * Root is the first, highest placed node of the tree
     * @return reference to root node of the tree
     */
    T getRoot();

    /**
     *
     * @param node which is going to be the root of the tree to be checked if it is empty
     * @return true, if tree is empty, or false if is not
     */
    boolean empty(T node);

    /**
     * Leaf node does not have any children
     * @param node to check, if it's a leaf or not
     * @return true, if node is a leaf, false if is not
     */
    boolean isLeaf(T node);

    /**
     * Size of the tree is a number of its nodes
     * @param node which is going to be the root of the tree we check
     * @return size of the tree
     */
    int size(T node);

    /**
     * Height of the tree is the largest number of nodes in a single path
     * @param node which is going to be the root of the tree we check
     * @return height of the tree
     */
    int height(T node);
}
