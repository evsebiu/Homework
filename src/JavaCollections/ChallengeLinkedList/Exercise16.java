package JavaCollections.ChallengeLinkedList;
//16. Write a Java program to shuffle the elements in a linked list.

import java.util.Collections;
import java.util.LinkedList;

public class Exercise16 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list: " + list);
        Collections.shuffle(list);
        System.out.println("Modified list: "  + list);
    }
}
