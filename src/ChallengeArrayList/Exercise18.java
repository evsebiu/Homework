package ChallengeArrayList;

//18. Write a Java program to test an array list is empty or not.

import java.util.ArrayList;

public class Exercise18 {
    public static void main(String[] args) {
        isListEmpty();
        isListEmpty2();
    }

    public static void isListEmpty (){
        ArrayList<String> test = new ArrayList<>();
        test.add("Water");
        test.add("Beer");
        test.add("Wine");

        if (test.isEmpty()){
            System.out.println("List is empty: " + test.size() + " elements ");
        } else {
            System.out.println("List is not empty");
        }
    }
    public static void isListEmpty2 (){
        ArrayList<String> test = new ArrayList<>();

        if (test.isEmpty()){
            System.out.println("List is empty: " + test.size() + " elements ");
        } else {
            System.out.println("List is not empty");
        }
    }
}
