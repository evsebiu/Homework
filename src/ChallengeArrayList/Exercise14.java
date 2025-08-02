package ChallengeArrayList;
// 14. Write a Java program of swap two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Exercise14 {

    public static void main(String[] args) {

        arrayList();

    }

    public static void arrayList(){
        ArrayList<String> list1= new ArrayList<>();
        list1.add("Pasta");
        list1.add("Beef");
        list1.add("Eggs");
        list1.add("Avocado");

        System.out.println("Original list: " + list1);

        Collections.swap(list1,1,3);

        System.out.println("List after swap: " + list1);

    }
}
