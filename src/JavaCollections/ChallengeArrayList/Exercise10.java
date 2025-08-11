package JavaCollections.ChallengeArrayList;
// Write a Java program to shuffle elements in a array list.

import java.util.ArrayList;
import java.util.Collections;

public class Exercise10 {

    public static void main(String[] args) {

        arrayList();

    }

    public static void arrayList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("black");
        list.add("blue");
        list.add("green");

        System.out.println("Original list: " + list);

        Collections.shuffle(list);

        System.out.println("Shuffle list: " + list);

    }



}
