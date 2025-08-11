package JavaCollections.ChallengeLinkedList;
//11. Write a Java program to display the elements and their positions in a linked list.

import java.util.LinkedList;

public class Exercise11 {
    public static void main(String[] args) {
        LinkedList<String> list =  new LinkedList<>();
        list.add("Colors");
        list.add("Lake");
        list.add("Forest");
        list.add("Wild Animals");
        System.out.println("List: " + list);


        for (int i = 0; i<list.size(); i++){
            System.out.println("Position " + i + " " + list.get(i));
        }
    }
}
