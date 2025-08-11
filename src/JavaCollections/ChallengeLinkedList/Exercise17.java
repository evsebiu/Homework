package JavaCollections.ChallengeLinkedList;

//17. Write a Java program to join two linked lists.

import java.util.LinkedList;

public class Exercise17 {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("potato");
        list.add("chips");
        list.add("fish");

        System.out.println("List 1: " + list);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("chips");
        list2.add("brownies");
        list2.add("mushrooms");

        System.out.println("List 2 :" + list2);

        list.addAll(list2);
        System.out.println("Updated list : " + list);

    }
}
