package ChallengeLinkedList;

import java.util.LinkedList;

//19. Write a Java program to remove and return the first element of a linked list.
public class Exercise19 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List: " + list);

        Integer firstElement = list.pollFirst();

        System.out.println("Removed element: " + firstElement);
        System.out.println("Updated list: " + list);
    }
}
