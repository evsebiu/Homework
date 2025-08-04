package ChallengeLinkedList;

//1. Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;

public class Exercise1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Banana");
        list.add("Kiwi");

        System.out.println("Original LinkedList: "  + list);

        String elementToAppend = "Map";

        list.addLast(elementToAppend);
        System.out.println("Modified LinkedList: " + list);


    }
}
