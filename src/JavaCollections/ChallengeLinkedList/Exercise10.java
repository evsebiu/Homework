package JavaCollections.ChallengeLinkedList;

import java.util.LinkedList;

//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
public class Exercise10 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Screen");
        list.add("glasses");
        list.add("birds");
        System.out.println("List: "  + list);

        //System.out.println("Getting items: " + list.get(0) + " , " + list.get(2));

        String firstElement = list.getFirst();
        String lastElment = list.getLast();
        System.out.println("First element: " + firstElement + ", last element: " + lastElment);

    }
}
