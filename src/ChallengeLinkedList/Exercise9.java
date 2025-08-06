package ChallengeLinkedList;

//9. Write a Java program to insert some elements at the specified position into a linked list.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("TV");
        list.add("Mobile");
        list.add("Couch");
        System.out.println("List: "  + list);

        /*list.add(2,"Laptop");
        System.out.println("Updated : " + list);*/
        List<String> newItems = Arrays.asList("Bowl", "Plate", "Pan");

        list.addAll(2,newItems);
        System.out.println("Update list: " + list);

    }
}
