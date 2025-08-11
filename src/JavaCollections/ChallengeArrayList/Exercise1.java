package JavaCollections.ChallengeArrayList;
/* Write a Java program to create a new array list, add some colors (string) and print out the collection. */

import java.util.ArrayList;

public class Exercise1 {

    public static void main(String[] args) {
        printColors();
    }

    public static void printColors(){
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Brown");
        System.out.println(colors);
    }
}
