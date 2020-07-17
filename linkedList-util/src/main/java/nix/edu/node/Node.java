package nix.edu.node;

public class Node<T> {

    private T element;
    private Node next;

    public Node(T value) {
        this(value, null);
    }

    public Node(T value, Node ref) {
        this.element = value;
        this.next = ref;
    }

    public void setElement(T element) {
        this.element = (T) element;
    }

    public void setNext(Node ref) {
        next = ref;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getElement() {
        return (T) element;
    }
}
