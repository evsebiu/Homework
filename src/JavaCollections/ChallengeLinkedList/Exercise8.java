package JavaCollections.ChallengeLinkedList;

//8. Write a Java program to insert the specified element at the end of a linked list.

import java.util.LinkedList;

public class Exercise8 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("english");
        list.add("romanian");
        list.add("french");
        System.out.println("List:  " + list);
        list.addLast("russian");
        System.out.println("List update: " + list);
    }
}
