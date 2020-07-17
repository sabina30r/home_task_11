package nix.edu;

import nix.edu.list.SinglyLinkedListInterface;
import nix.edu.list.impl.ForwardLinkedList;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        System.out.println("-------------- TASK 1 --------------");

        List<String> list = Arrays.asList("string 1 text", "2 string 3 text", "45");
        StreamUtil.collectFilteredDigitsIntoString(list);
        StreamUtil.collectFilteredDigitsIntoInteger(list);

        System.out.println("-------------- TASK 2 --------------");

        SinglyLinkedListInterface<Integer> myList = new ForwardLinkedList<>();

        myList.addToEnd(10);
        myList.addToEnd(20);
        myList.addToEnd(30);
        myList.addToEnd(40);
        myList.addToEnd(50);
        System.out.println("List after added to end.\n" + myList.toString());

        myList.addToFront(5);
        myList.addToFront(4);
        myList.addToFront(3);
        myList.addToFront(2);
        myList.addToFront(1);
        System.out.println("List after adding to front.\n" + myList.toString());

        myList.replaceInPosition(888, 6);
        System.out.println("List after replacing value in position.\n" + myList.toString());

        myList.deleteFromPosition(6);
        System.out.println("List after deleting value from position.\n" + myList.toString());

        myList.addAfterPosition(20, 6);
        System.out.println("List after adding value after position.\n" + myList.toString());

        myList.findElement(50);

        myList.deleteFromFront();
        System.out.println("List after deleting from front.\n" + myList.toString());

        myList.deleteFromEnd();
        System.out.println("List after deleting from end.\n" + myList.toString());

        myList.clear();
        System.out.println("List after clearing.\n" + myList.toString());
    }
}
