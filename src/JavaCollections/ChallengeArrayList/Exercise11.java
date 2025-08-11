 package JavaCollections.ChallengeArrayList;

import java.util.ArrayList;
import java.util.Collections;

 // Write a Java program to reverse elements in a array list.
public class Exercise11 {

    public static void main(String[] args) {
        arrayList();
    }

    public static void arrayList(){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(21341);
        numbers.add(321);

        System.out.println("Original list numbers: " + numbers );

        Collections.reverse(numbers);

        System.out.println("Reversed list: " + numbers ) ;
    }

}
