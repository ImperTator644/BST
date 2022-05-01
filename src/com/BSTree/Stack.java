package com.BSTree;

/**
 * Generic interface with declaration of methods common for stacks
 * @param <T> structure to be kept in stack
 */
public interface Stack<T> {
    /**
     *
     * @return true, if the stack is empty, false if is not
     */
    boolean empty();

    /**
     *
     * @return true, if the stack is full, false if is not
     */
    boolean full();

    /**
     * Adds an element to stack
     * @param s structure to be added
     * @return true, if element has been added, false if it hasn't
     */
    boolean push(T s);

    /**
     *
     * @return element from the top of the stack
     */
    T peek();

    /**
     * Deletes an element of the top of the stack
     * @return true, if element has been deleted, false if it hasn't
     */
    boolean pop();

    /**
     * Deletes all elements in the stack
     */
    void clear();
}
