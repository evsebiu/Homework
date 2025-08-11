package JavaCollections.ChallengeLinkedList;

//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Rice");
        list.add("Cherry");
        list.add("Raspberry");

        int startPosition = 1;
        if (startPosition >= 0 && startPosition < list.size()) {
            System.out.println("Iterating from element: " + startPosition + " : ");


            Iterator<String> iterator = list.listIterator(startPosition);

            while (iterator.hasNext()) {
                System.out.println("Elemement: " + iterator.next());
            }
        } else {
            System.out.println("Invalid position");
        }
    }
}
