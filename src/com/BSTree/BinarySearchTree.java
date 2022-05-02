package com.BSTree;

import java.util.ArrayList;

/**
 * Class representing a Binary Search Tree.
 * Binary Search Tree is a Binary Tree, where nodes with bigger value are being placed to the right of the parent node,
 * and nodes with lower values are being placed to the left of the parent node.
 */
public class BinarySearchTree extends BinaryTree implements BSTree<BNode>{
    private final ArrayList<BNode> leafs = new ArrayList<>(); //list of leafs of the tree

    /**
     * Creates empty tree.
     */
    public BinarySearchTree() {
        super();
    }

    /**
     * Leaf node does not have any children
     * @param node which is going to be the root of the tree we check
     * @return ArrayList of nodes, that are leafs
     */
    public ArrayList<BNode> getLeafs(BNode node){
        leafs.clear();
        countLeafs(node);
        return leafs;
    }

    /**
     * Creates and inserts new node
     * @param value integer value of the new node
     */
    public void insert(int value) {
        BNode temp = new BNode(value, null, null, null);
        if (empty(getRoot())) setRoot(temp);
        else {
            boolean stop = true;
            BNode it = getRoot();
            while (stop) {
                if (it.getValue() > value) {
                    if (!empty(it.getLeft())) it = it.getLeft();
                    else {
                        it.setLeft(temp);
                        temp.setParent(it);
                        stop = false;
                    }
                } else {
                    if (!empty(it.getRight())) it = it.getRight();
                    else {
                        it.setRight(temp);
                        temp.setParent(it);
                        stop = false;
                    }
                }
            }
        }
    }

    /**
     * Searches for node, which holds given value
     * @param value integer value we are searching for
     * @return node with given value or null, if value doesn't exist
     */
    public BNode search(int value){
        BNode it = getRoot();
        while(!empty(it) && it.getValue() != value){
            if(it.getValue() > value) it = it.getLeft();
            else it = it.getRight();
        }
        return it;
    }

    /**
     *
     * @param node which is going to be the root of the tree we check
     * @return node holding minimum value
     */
    public BNode minimum(BNode node){
        if(empty(node)) return null;
        else{
            BNode it = node;
            while(!empty(it.getLeft())) it = it.getLeft();
            return it;
        }
    }

    /**
     *
     * @param node which is going to be the root of the tree we check
     * @return node holding maximum value
     */
    public BNode maximum(BNode node){
        if(empty(node)) return null;
        else{
            BNode it = node;
            while(!empty(it.getRight())) it = it.getRight();
            return it;
        }
    }

    /**
     * Successor is the lowest of the 'higher' nodes from given node
     * @param node we search for its successor
     * @return successor of the node
     */
    public BNode successor(BNode node){
        if(empty(getRoot())) return null;
        if(!empty(node.getRight())) return minimum(node.getRight());
        else {
            BNode it = node.getParent();
            while(!empty(it) && node.equals(it.getRight())){
                node = it;
                it = it.getParent();
            }
            return it;
        }
    }

    /**
     * Predecessor is the 'highest' of the 'lower' nodes from given node
     * @param node we search for its predecessor
     * @return predecessor of the node
     */
    public BNode predecessor(BNode node){
        if(empty(getRoot())) return null;
        if(!empty(node.getLeft())) return maximum(node.getLeft());
        else {
            BNode it = node.getParent();
            while(!empty(it) && node.equals(it.getLeft())){
                node = it;
                it = it.getParent();
            }
            return it;
        }
    }

    /**
     * Deletes given node
     * @param node which is going to be deleted
     */
    public void delete(BNode node){
        if(empty(node)) System.out.println("No such node");
        else if(isLeaf(node)){
            BNode it = node.getParent();
            if(empty(it)) setRoot(null);
            else {
                if(it.getLeft().equals(node)) it.setLeft(null);
                else it.setRight(null);
            }
        }
        else if(empty(node.getLeft()) || empty(node.getRight())){
            BNode temp;
            if(empty(node.getLeft())) temp = node.getRight();
            else temp = node.getLeft();
            BNode it = node.getParent();
            if(empty(it)) setRoot(temp);
            else{
                if(it.getLeft().equals(node)) it.setLeft(temp);
                else it.setRight(temp);
            }
        }
        else{
            BNode successor = successor(node);
            node.setValue((successor.getValue()));
            delete(successor);
        }
    }

    /**
     * TASK NUMBER 1
     * Counts all the leaf nodes of the tree
     * @param node which is going to be the root of the tree we check
     * @return number of leafs
     */
    public int countLeafs(BNode node){
        int numOfLeafs = 0;
        if (empty(node)) return 0;
        if(isLeaf(node)) {
            leafs.add(node);
            return 1;
        }
        numOfLeafs += countLeafs(node.getLeft());
        numOfLeafs += countLeafs(node.getRight());
        return numOfLeafs;
    }

    /**
     * TASK NUMBER 2
     * Counts the longest path from root node to leaf node
     * @param node which is going to be the root of the tree we check
     * @return number of edges
     */
    public int largestNumOfEdges(BNode node){
        int current;
        int max = 0;
        int listSize = getLeafs(node).size();
        for(int i=0; i < listSize; i++){
            current = calculateEdge(leafs.get(i));
            if(current > max) max=current;
        }
        return max;
    }

    /**
     * Calculates a path from root node to given node
     * @param node destination of the given path
     * @return number of edges on the given path
     */
    private int calculateEdge(BNode node){
        int edge = 0;
        BNode it = node;
        while(it != getRoot()){
            edge++;
            it = it.getParent();
        }
        return edge;
    }

    /**
     * Deletes all nodes
     * @param node which is going to be the root of the tree we delete
     */
    public void clear(BNode node){
        if(!empty(node)){
            clear(node.getLeft());
            clear(node.getRight());
        }
        setRoot(null);
    }

    /**
     * TASK NUMBER 3
     * Checks, if two Binary Search Trees are equal
     * @param otherObject another binary search tree
     * @return true, if they are equal, false if they are not
     */
    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(this.getClass() != otherObject.getClass()) return false;
        var other = (BinarySearchTree) otherObject;
        return (this.toString().equals(other.toString()));
    }

    /**
     *
     * @return String representing the tree (inorder)
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        BSTStack stack = new BSTStack(size(getRoot()));
        BNode it = getRoot();
        while (it != null || !stack.empty()) {
            while (it !=  null) {
                stack.push(it);
                it = it.getLeft();
            }
            it = stack.peek();
            stack.pop();
            sb.append(it).append(", ");
            it = it.getRight();

        }
        return sb.toString();
    }
}
