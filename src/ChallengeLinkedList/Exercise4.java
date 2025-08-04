package ChallengeLinkedList;

//4. Write a Java program to iterate a linked list in reverse order.

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Exercise4 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list: " + list);


        Iterator<Integer> reversedList = list.descendingIterator();
        while (reversedList.hasNext()){
            System.out.println("Reversed list: " + reversedList.next());
        }
    }
}
