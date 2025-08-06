package ChallengeLinkedList;

//15. Write a Java program of swap two elements in a linked list.

import java.util.Collections;
import java.util.LinkedList;

public class Exercise15 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Phone");
        list.add("Tablet");
        list.add("Tv screen");
        list.add("Projector");
        list.add("Cinema");

        System.out.println("List before swap: " + list);
        Collections.swap(list, 0,3);
        System.out.println("Updated list: " + list);
    }
}
