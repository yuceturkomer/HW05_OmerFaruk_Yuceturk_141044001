package com.yuceturkomer.hw05;


/**
 * A recursive linked list class with recursive methods
 * <p>
 * The both remove methods(wrapper and normal ones)
 * are different from the book unlike other methods
 *
 * @author Koffman and Wolfgang
 */
public class LinkedListRec<E> {
    /**
     * The list head
     */
    private Node<E> head;

    /**
     * A Node is the building block for a single-linked list.
     */
    private static class Node<E> {
        // Data Fields
        /**
         * The reference to the data.
         */
        private E data;
        /**
         * The reference to the next node.
         */
        private Node next;
        // Constructors

        /**
         * Creates a new node with a null next field.
         *
         * @param dataItem The data stored
         */
        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        /**
         * Creates a new node that references another node.
         *
         * @param dataItem The data stored
         * @param nodeRef  The node referenced by new node
         */
        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    } //end class Node

    /**
     * Finds the size of a list.
     *
     * @param head The head of the current list
     * @return The size of the list
     */
    private int size(Node<E> head) {
        if (head == null)
            return 0;
        else
            return 1 + size(head.next);
    }

    /**
     * Wrapper method for finding the size of a list.
     *
     * @return The size of the list
     */
    public int size() {
        return size(head);
    }

    /**
     * Returns the string representation of a list.
     *
     * @param head The head of the current list
     * @return The state of the current list
     */
    private String toString(Node<E> head) {
        if (head == null)
            return "";
        else
            return head.data + "\n" + toString(head.next);
    }

    /**
     * Wrapper method for returning the string representation of a list.
     *
     * @return The string representation of the list
     */
    public String toString() {
        return toString(head);
    }

    /**
     * Replaces all occurrences of oldObj with newObj. post: Each occurrence of
     * oldObj has been replaced by newObj.
     *
     * @param head   The head of the current list
     * @param oldObj The object being removed
     * @param newObj The object being inserted
     */
    private void replace(Node<E> head, E oldObj, E newObj) {
        if (head != null) {
            if (oldObj.equals(head.data))
                head.data = newObj;
            replace(head.next, oldObj, newObj);
        }
    }

    /**
     * Wrapper method for replacing oldObj with newObj.
     * post: Each occurrence of oldObj has been replaced by newObj.
     *
     * @param oldObj The object being removed
     * @param newObj The object being inserted
     */

    public void replace(E oldObj, E newObj) {
        replace(head, oldObj, newObj);
    }

    /**
     * Adds a new node to the end of a list.
     *
     * @param head The head of the current list
     * @param data The data for the new node
     */
    private void add(Node<E> head, E data) {
        // If the list has just one element, add to it.
        if (head.next == null)
            head.next = new Node<E>(data);
        else
            add(head.next, data); // Add to rest of list
    }

    /**
     * Wrapper method for adding a new node to the end of a list.
     *
     * @param data The data for the new node
     */
    public void add(E data) {
        if (head == null)
            head = new Node<E>(data); // List has 1 node.
        else
            add(head, data);
    }

    /**
     * Removes nodes recursively from a list which contains outData as variable.
     *
     * post: All occurences of outData is removed.
     * @param head    The head of the current list
     * @param pred    The predecessor of the list head
     * @param outData The data to be removed
     * @return true if the items is removed and false otherwise
     */
    @SuppressWarnings("unchecked")
    private boolean remove(Node<E> head, Node<E> pred, E outData) {
        if (head == null) {
            return false;//
        } else if (head.data.equals(outData)) {
            pred.next = head.next;
            remove(head.next, pred, outData);
            return true;
        } else
            return remove(head.next, head, outData);
    }

    /**
     * Wrapper method for removing a node (in LinkedListRec)
     * post: All occurences of outData is removed
     *
     * @param outData The data to be removed
     * @return true if the item is removed, and false otherwise
     */
    @SuppressWarnings("unchecked")
    public boolean remove(E outData) {
        if (head == null) {
            return false;
        } else if (head.data.equals(outData)) {
            head = head.next;
            remove(head.next, head, outData);
            return true;
        } else
            return remove(head.next, head, outData);

    }

}
