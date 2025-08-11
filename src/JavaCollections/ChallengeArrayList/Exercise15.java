package JavaCollections.ChallengeArrayList;

// 15. Write a Java program to join two array lists.

import java.util.ArrayList;

public class Exercise15 {
    public static void main(String[] args) {

        lists();

    }

    public static void lists(){
        ArrayList<String> primaryList= new ArrayList<>();
        primaryList.add("Banana");
        primaryList.add("Kiwi");
        primaryList.add("Coconut");

        ArrayList <String> secondList = new ArrayList<>();
        secondList.add("Paper");
        secondList.add("Pen");
        secondList.add("Ink");

        System.out.println("Primary list: " + primaryList);
        System.out.println("Second list: " + secondList);

        ArrayList<String> combinedList =new ArrayList<>();
        combinedList.addAll(primaryList);
        combinedList.addAll(secondList);

        System.out.println("Combined list, primary + second: " + combinedList);

    }

}
