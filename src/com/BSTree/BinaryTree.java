package com.BSTree;

/**
 * Abstract class representing 'binary tree'. Implementing methods common for 'binary trees'
 */
public abstract class BinaryTree implements BTree<BNode> {
    private BNode root;      //reference to the root of the tree

    /**
     * Creates empty binary tree
     */
    public BinaryTree(){
        this.root = null;
    }

    /**
     * Root is the first, highest placed node of the tree
     * @return reference to root node of the tree
     */
    public BNode getRoot() {
        return root;
    }

    /**
     *
     * @param node which is going to be set as a root
     */
    protected void setRoot(BNode node) {
        this.root = node;
    }

    /**
     *
     * @param node which is going to be the root of the tree to be checked if it is empty
     * @return true, if tree is empty, or false if is not
     */
    public boolean empty(BNode node) {
        return (node == null);
    }

    /**
     * Leaf node does not have any children
     * @param node to check, if it's a leaf or not
     * @return true, if node is a leaf, false if is not
     */
    public boolean isLeaf(BNode node) {
        if (empty(node)) return false;
        else return empty(node.getLeft()) && empty(node.getRight());
    }

    /**
     * Size of the tree is a number of its nodes
     * @param node which is going to be the root of the tree we check
     * @return size of the tree
     */
    public int size(BNode node) {
        if (empty(node)) return 0;
        else return (1 + size(node.getLeft()) + size(node.getRight()));
    }

    /**
     * Height of the tree is the largest number of nodes in a single path
     * @param node which is going to be the root of the tree we check
     * @return height of the tree
     */
    public int height(BNode node) {
        if (empty(node)) return -1;
        else return (1 + Math.max(height(node.getLeft()), height(node.getRight())));
    }
}
