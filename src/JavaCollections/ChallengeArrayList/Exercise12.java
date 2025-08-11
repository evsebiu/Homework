package JavaCollections.ChallengeArrayList;
//12. Write a Java program to extract a portion of a array list.

import java.util.ArrayList;
import java.util.List;

public class Exercise12 {

    public static void main(String[] args) {

        arrayList();

    }

    public static void arrayList(){
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(62);
        numbers.add(431);
        numbers.add(321);
        numbers.add(777);
        numbers.add(666);
        System.out.println("Original list: " +numbers);


        List<Integer> sublist=numbers.subList(2, 6);

        System.out.println("Extracted list: " + sublist);
    }

}
