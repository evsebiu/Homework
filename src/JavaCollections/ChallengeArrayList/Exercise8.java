package JavaCollections.ChallengeArrayList;
// 8. Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;

public class Exercise8 {
    public static void main(String[] args) {

        arrayList();

    }

    public static void arrayList() {
        ArrayList<String> list = new ArrayList<>();

        list.add("banana");
        list.add("kiwi");
        list.add("orange");
        list.add("apple");
        list.add("mango");
        list.add("papaya");

        System.out.println("Original list order: " + list);

        Collections.sort(list);

        System.out.println("Sorted list: " + list);
    }
}
