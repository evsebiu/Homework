package LambdaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//You are given a List<String> representing a list of words.
// Create a lambda expression to sort the list in alphabetical order.
// Next, modify your lambda expression to sort the list in reverse alphabetical order.
public class Exercise4 {
    static void main(String[] args) {

        ListStorage cuvinte = new ListStorage();
        List<String> words = cuvinte.words.stream()
                .sorted(String::compareToIgnoreCase)
                .toList();

        System.out.println("Alphabetical sorted:" + words);


        // varianta 1 : System.out.println("Reversed order: " + words.reversed());
    //varianta 2:
        List<String> reversedOrder = words.reversed();
        System.out.println("Reversed order: " + reversedOrder);
    }
}


class ListStorage{
    List<String> words = new ArrayList<>(Arrays.asList("pahar", "mouse", "monitor", "tastatura", "servetele", "avocado"));
}