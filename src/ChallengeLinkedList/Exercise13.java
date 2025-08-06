package ChallengeLinkedList;

import java.util.LinkedList;

//13. Write a Java program to remove first and last element from a linked list.
public class Exercise13 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Youtube");
        list.add("Spotify");
        list.add("Snapchat");
        list.add("Instagram");
        list.add("Google Meet");
        System.out.println("List: " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("Updated list: " + list);
    }
}
