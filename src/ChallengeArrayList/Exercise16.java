package ChallengeArrayList;

//16. Write a Java program to clone an array list to another array list.

import java.util.ArrayList;
import java.util.Collections;

public class Exercise16 {
    public static void main(String[] args) {

        cloneListTest();
    }


    public static void cloneListTest(){
        ArrayList<String> normalList= new ArrayList<>();
        normalList.add("Mouse");
        normalList.add("Keyboard");
        normalList.add("Monitor 60hZ");
        normalList.add("Motherboard");

        System.out.println("Original list: " + normalList);

        ArrayList<String> clonedList = new ArrayList<>(normalList);

        System.out.println("Cloned list: " + clonedList);

    }

}
