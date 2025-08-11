package JavaCollections.ChallengeLinkedList;

//14. Write a Java program to remove all the elements from a linked list.

import java.util.LinkedList;

public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("List: " + list);

        list.clear();
        System.out.println("No more list :( : " + list);
    }
}
