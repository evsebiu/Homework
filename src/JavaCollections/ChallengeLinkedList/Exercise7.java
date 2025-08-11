package JavaCollections.ChallengeLinkedList;

//7. Write a Java program to insert the specified element at the front of a linked list.

import java.util.LinkedList;

public class Exercise7 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("blue");
        list.add("green");
        list.add("red");
        System.out.println("Original List: " + list);
        list.addFirst("purple");
        System.out.println("Updated list: "  + list);
    }
}
