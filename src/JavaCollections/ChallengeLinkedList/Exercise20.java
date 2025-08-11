package JavaCollections.ChallengeLinkedList;

import java.util.LinkedList;

//20. Write a Java program to retrieve but does not remove, the first element of a linked list.
public class Exercise20 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("grapes");
        list.add("mango");
        list.add("kiwi");
        list.add("banana");

        System.out.println("List: " + list);

        String firstElement  = list.peekFirst();
        System.out.println("Retrieved item " + firstElement);
    }
}
