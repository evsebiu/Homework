package ChallengeArrayList;

//13. Write a Java program to compare two array lists.

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise13 {
    public static void main(String[] args) {
lists();
    }

    public static void lists(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("orange");
        list1.add("apple");
        list1.add("kiwi");

        ArrayList<String>list2= new ArrayList<>();
        list2.add("cereals");
        list2.add("chocolate");
        list2.add("soup");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        boolean isEqual = list1.equals(list2);
        System.out.println("list1.equals(list2) " + isEqual);
    }

}
