package ChallengeArrayList;
// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;

public class Exercise4 {

    public static void main(String[] args) {

        groceriesList();

    }

    public static void groceriesList() {

        ArrayList <String> shoppingList = new ArrayList<>();

        shoppingList.add(0,"Chicken Breast");
        shoppingList.add(1,"Rice");
        shoppingList.add(2,"Shampoo");
        shoppingList.add(3,"Potatoes");
        shoppingList.add(4,"Spicy Chips");

        System.out.println("Full shopping list: " +  shoppingList);

        String item = shoppingList.get(4);

        System.out.println("Item number 4 from shopping list is: " + item);

    }

}
