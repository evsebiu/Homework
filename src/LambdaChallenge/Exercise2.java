package LambdaChallenge;
//Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {
    static void main(String[] args) {
        ListGenerate shoppingList = new ListGenerate();

        List<String> alphabetical = shoppingList.list.stream()
                .sorted(String::compareToIgnoreCase)
                .toList();

        System.out.println("Alphabetical list: " + alphabetical);
    }
}

class ListGenerate {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("Potato", "Watermelon", "Frozen Fruits", "Almond Milk"));
}
