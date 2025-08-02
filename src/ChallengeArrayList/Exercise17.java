package ChallengeArrayList;

import java.util.ArrayList;

public class Exercise17 {
    public static void main(String[] args) {
        list();
    }

    public static void list(){
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Counter-Strike 2");
        newList.add("League of Legends");
        newList.add("Forza Horizon");
        newList.add("The Escapist");
        newList.add("Mario Kart 2");

        System.out.println("Original list: " + newList);
        System.out.println("Original list size: " + newList.size());

        newList.clear();
        System.out.println("List after clear: " + newList);
        System.out.println("Size list after clear: " + newList.size() );
    }
}
