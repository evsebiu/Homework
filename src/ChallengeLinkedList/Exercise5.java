package ChallengeLinkedList;

//5. Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.LinkedList;

public class Exercise5 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);

        int elementToInsert = 4;
        int positionToInsert = 3;
        list.add(positionToInsert, elementToInsert);
        System.out.println("After inserting: " + elementToInsert + " at position: " + positionToInsert);
        System.out.println("Updated LinkedList: " + list);
    }
}
