package ChallengeLinkedList;

//2. Write a Java program to iterate through all elements in a linked list.

import java.util.LinkedList;

public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Potato");
        list.add("Cabbage");
        list.add("Rice");
        System.out.println("List: " + list);

        for (String fruit : list){
            System.out.println(fruit);
        }
    }
}
