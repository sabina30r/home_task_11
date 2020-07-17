package nix.edu.list.impl;

import nix.edu.list.SinglyLinkedListInterface;
import nix.edu.node.Node;

import java.util.AbstractList;


public class ForwardLinkedList<T> extends AbstractList<T> implements SinglyLinkedListInterface<T> {

    private Node<T> head;
    private int size;

    public ForwardLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void addToFront(T element) {
        head = new Node(element, head);
        size++;
    }

    @Override
    public void deleteFromFront() {
        if (!isEmpty()) {
            head = head.getNext();
            size--;
        }
    }

    @Override
    public void addToEnd(T element) {
        Node current = head;
        Node<T> node = new Node(element);
        if (head == null) {
            head = node;
        } else {
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    @Override
    public void deleteFromEnd() {
        if (!isEmpty()) {
            if (head.getNext() == null) {
                head = null;
            } else {
                Node<T> temp = head;
                Node<T> prev = head;
                while (temp.getNext() != null) {
                    prev = temp;
                    temp = temp.getNext();
                }
                prev.setNext(null);
                size--;
            }
        }
    }


    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        Node<T> currentElement = head;
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.getNext();
        }
        return currentElement.getElement();
    }

    @Override
    public int size() {
        if (size == 0) {
            System.out.println("List is empty");
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void findElement(T element) {
        Node current = head;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(element)) {
                System.out.println(element + " was found at position " + i);
                found = true;
            }
            current = current.getNext();
        }
        if (!found) {
            System.out.println(element + " was not found");
        }
    }


    @Override
    public void replaceInPosition(T element, int index) {
        Node<T> current = head;
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Illegal Index");
        }
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setElement(element);
    }

    @Override
    public void addAfterPosition(T element, int index) {
        if (head == null) {
            head = new Node<T>(element);
        } else {
            int nodeIndex = 0;
            Node<T> currentNode = head;

            while (index > nodeIndex) {
                if (currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }
                nodeIndex++;
            }
            if (nodeIndex == index) {
                Node<T> newNode = new Node<T>(element);
                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
            }
        }
        size++;
    }

    @Override
    public void deleteFromPosition(int index) {
        if (head != null) {
            int nodeIndex = 0;

            Node<T> currentNode = head;
            Node<T> previousNode = head;
            while (nodeIndex != index) {
                previousNode = currentNode;

                if (currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }
                nodeIndex++;
            }
            previousNode.setNext(currentNode.getNext());
        }
        size--;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> current = head;
        stringBuilder.append("Size of list: ").append(size).append("\n");
        while (current != null) {
            stringBuilder.append("[").append(current.getElement()).append("]");
            current = current.getNext();
        }
        return stringBuilder.toString();
    }


}
