package com.BSTree;

/**
 * Class representing a stack to keep BNode objects
 */
public class BSTStack implements Stack<BNode>{
    private final int capacity;
    private final BNode[] elements;
    private int top;

    /**
     * Creates a stack with given capacity
     * @param capacity given capacity of the stack
     */
    public BSTStack(int capacity){
        this.capacity = capacity;
        elements = new BNode[capacity];
        top = -1;
    }

    /**
     *
     * @return true, if the stack is empty, false if is not
     */
    public boolean empty() {
        return (top<0);
    }

    /**
     *
     * @return true, if the stack is full, false if is not
     */
    public boolean full() {
        return (top==capacity-1);
    }

    /**
     * Adds an object BNode to stack
     * @param s object BNode to be added
     * @return true, if element has been added, false if it hasn't
     */
    public boolean push(BNode s){
        if (full()) return false;
        top++;
        elements[top] = s;
        return true;
    }

    /**
     *
     * @return element from the top of the stack
     */
    public BNode peek(){
        return elements[top];
    }

    /**
     * Deletes an element of the top of the stack
     * @return true, if element has been deleted, false if it hasn't
     */
    public boolean pop(){
        if (empty()) return false;
        top--;
        return true;
    }

    /**
     * Deletes all elements in the stack
     */
    public void clear() {
        top = -1;
    }
}
