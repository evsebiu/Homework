package ChallengeLinkedList;

import java.util.LinkedList;

//12. Write a Java program to remove a specified element from a linked list.
public class Exercise12 {
    public static void main(String[] args) {
        LinkedList<String> list =  new LinkedList<>();
        list.add("purple");
        list.add("grape");
        list.add("strawberry");
        System.out.println("List: " + list);

        list.remove(2);
        System.out.println("Updated list: " + list);
    }
}
