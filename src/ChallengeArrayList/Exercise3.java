package ChallengeArrayList;
// 3. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {

        displayNames();

    }


    public static void displayNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ion");
        names.add("Gigi");
        names.add("Matei");
        names.add("Eusebiu");
        names.add(0,"Vasile");

        for (String name : names){
            System.out.println(name);
        }

    }

}
