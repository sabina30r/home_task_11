package nix.edu.list;

public interface SinglyLinkedListInterface<T> {
    void addToFront(T element);

    void deleteFromFront();

    void addToEnd(T element);

    void deleteFromEnd();

    void replaceInPosition(T element, int index);

    void addAfterPosition(T element, int index);

    void deleteFromPosition(int index);

    void findElement(T element);

    boolean isEmpty();

    void clear();

    int size();
}
