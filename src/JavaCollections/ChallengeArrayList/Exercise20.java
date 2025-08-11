package JavaCollections.ChallengeArrayList;

//20. Write a Java program to increase the size of an array list.

import java.util.ArrayList;

public class Exercise20 {
    public static void main(String[] args) {
arrayList();
    }
    public static void arrayList(){
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Soup");
        shoppingList.add("Vodka");
        shoppingList.add("Detergent");
        shoppingList.add("2 bottles of cola");

        System.out.println("Original list: " + shoppingList);
        shoppingList.ensureCapacity(10); // can hold at least 10 elements.
        shoppingList.add("Toothpaste");
        shoppingList.add("Chips");
        shoppingList.add("Frozen fries");
        System.out.println("Updated list: " + shoppingList);
    }
}
