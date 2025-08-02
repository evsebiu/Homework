package ChallengeArrayList;

import java.util.ArrayList;

//19. Write a Java program to trim the capacity of an array list the current list size.
public class Exercise19 {
    public static void main(String[] args) {
arrayList();
    }
    public static void arrayList(){
        ArrayList <String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");

        System.out.println("Original list: " + colors);
        System.out.println("Size list: " + colors.size());

        colors.remove(1);
        colors.remove(2);
        System.out.println("List after removing 2 elements: " + colors);

        ((ArrayList<String>) colors).trimToSize();
        System.out.println("List after trimming capacity: " + colors);
        System.out.println("Final list size : " + colors.size());

    }
}
