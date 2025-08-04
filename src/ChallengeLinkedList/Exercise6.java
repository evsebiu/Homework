package ChallengeLinkedList;

//6. Write a Java program to insert elements into the linked list at the first and last position.

import java.util.LinkedList;

public class Exercise6 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("Cabbage");
        list.add("Kiwi");
        list.add("Potato");
        System.out.println("Original LinkedList: " + list);

        list.addFirst("Mango");
        list.addLast("Apple");
        System.out.println("Updated list: "  + list );

    }
}
